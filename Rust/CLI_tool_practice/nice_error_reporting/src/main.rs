use structopt::StructOpt;
use failure::ResultExt;
use exitfailure::ExitFailure;

#[derive(StructOpt)]
struct Cli {
    //the pattern to look for
    pattern: String,
    //the path to the file to read
    #[structopt(parse(from_os_str))]
    path: std::path::PathBuf,
}
#[derive(Debug)]
struct CustomError(String);

fn main() -> Result<(), ExitFailure> {
    let args = Cli::from_args();
    //let path = &args.path;
    let path = "test.txt";
    let content = std::fs::read_to_string(path)
        .with_context(|_| format!("could not read file '{}'", path))?;
    println!("File content: {}", content);
    Ok(())
    // let content = match result {
    //     Ok(content) => content,
    //     Err(error) => {
    //         return Err(error.into());
    //     }
    // };
    // println!("File content: {}", content);
    // Ok(())
}
