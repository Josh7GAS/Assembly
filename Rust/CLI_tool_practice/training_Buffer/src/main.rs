use std::fs::File;
use std::io::prelude::*;
use std::io::BufReader;
use structopt::StructOpt;

#[derive(StructOpt)]
struct Cli {
    //the pattern to look for
    pattern: String,
    //the path to the file to read
    #[structopt(parse(from_os_str))]
    path: std::path::PathBuf,
}
fn main() {
    let args = Cli::from_args();
    //reading the string on the file
    let file_to_read = File::open(&args.path)?;
    let reader = BufReader::new(file_to_read);
    // for line in reader.lines(){
    //     if line.contains(&args.pattern){
    //         println!("{}", line?);
    //     }
    // }
    Ok(())
}
