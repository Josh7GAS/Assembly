use structopt::StructOpt;
#[derive(StructOpt)]
struct Cli {
    //pattern to look for
    pattern: String,
    //The path to the file to read
    #[structopt(parse(from_os_str))]
    path: std::path::PathBuf,
}

fn main() -> Result<(), Box<dyn std::error::Error>> {
  
    let args = Cli::from_args();

    let content = std::fs::read_to_string(&args.path)?;
    println!("File content: {}", content);
    Ok(())

}
  //let pattern = std::env::args().nth(1).expect("no pattern given");
    //let path = std::env::args().nth(2).expect("no path given");
   // let content = std::fs::read_to_string(&args.path).unwrap();

//     let result = std::fs::read_to_string(&args.path);
//     let content = match result {
//         Ok(content) => {content},
//         Err(error) => { return Err(error.into());}
//     };
//     println!("file content: {}", content);
//     Ok(())
// }

// let result = std::fs::read_to_string(&args.path);
// let content = match result{
//     Ok(content) => {content},
//     Err(error) => {panic!("Can´t deal with {}, just exit here", error);}
// };
//     println!("file content: {}", content);
// }

// for line in content.lines() {
//     if line.contains(&args.pattern) {
//         println!("\n{}", line);
//     }
// }
