use structopt::StructOpt;
//now we will parse the arguments with StructOpt, a library to parsing commands is clap.
//clap suports sub-comands, shell completions, and help messages
//using structopt
#[derive(StructOpt)]
struct Cli{
    //the pattern to look for
    pattern: String,
    //the path to the file to read
    #[structopt(parse(from_os_str))]
    path: std::path::PathBuf,
}

fn main() {
    let args = Cli::from_args();
    //reading the string on the file
    let content = std::fs::read_to_string(&args.path).expect("could not read file");

    for line in content.lines(){
        if line.contains(&args.pattern){
            println!("{}", line);
        }
    }
}
