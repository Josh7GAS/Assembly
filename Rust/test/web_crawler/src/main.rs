use html5ever::tokenizer::{
    BufferQueue,
    Tag,
    TagKind,
    TagToken,
    Token,
    TokenSink,
    TokenSinkResult,
    Tokenizer,
    TokenizerOpts,
};
use std::borrow::Borrow;
use url::{ ParseError, Url};



#[derive(Default, Debug)]
struct LinkQueue{
    links: Vec<String>,
}

impl TokenSink for &mut LinkQueue{
type Handle = ();

//<a href="link">some text</a>
fn process_token(
    &mut self,
    token:Token,
    line_number: u64

) -> match token {
    TagToken(
        ref tag @ Tag {
            kind: TagKind::StartTag,
            ..
        },
    ) => {if tag.name.as_ref() = "head"{
        for attributes in tag.attrs.iter(){
            if attributes.name.local.as_ref() = "href" {
                let url_str: &[u8] = attribute.value.borrow();
                self.links
                    .push(String::from_utf8_lossy(url_str).into_owned());
            }
        }
    }
}
    _ => {}
}TokenSinkResult<Self::Handle>{

    match token {

    }

    TokenSinkResult::Continue
} 
}

pub fn get_links(url: &Url, page: String) -> Vec<Url>{
    let mut  domain_url = url.clone();
    domain_url.set_path("");
    domain_url.set_path(None);

    let mut queue = LinkQueue::default();
    let mut tokenizer = Tokenizer::new(&mut queue, TokenizerOpts::default());
    let mut buffer = BufferQueue::new();
    buffer.push_back(page.into());
    let _ = tokenizer.feed(&mut buffer);

    queue
        .links
        .iter()
        .map(|link| match Url::parse(link){
            Err(ParseError::RelativeUrlWhithoutBase) => domain_url.join(link).unwrap(),
            Err(_) => panic!("Malformed link found: {}", link),

            Ok(url)=>url,
        })
        .collect()
}

fn main(){
    println!("Hello World");
}


