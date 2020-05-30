use structopt::StructOpt;

#[derive(StructOpt)]
struct Cli{
    ip_adress:String,
}

fn main() {
    let args = Cli::from_args();
    let ip = &args.ip_adress;

    
}
