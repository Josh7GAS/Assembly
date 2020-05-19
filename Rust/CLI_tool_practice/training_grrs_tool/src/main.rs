//struct is a way to job with the type the app will use
struct Cli{
    pattern: String,
    path: std::path::PathBuf,
}
fn main() {

    //this now is for getting the argument´s and path´s.
    //here we get the informations from the Operational System and parse a manually.
    let pattern = std::env::args().nth(1).expect("no pattern given");
    let path = std::env::args().nth(2).expect("no path given");
    let args = Cli{
        pattern:pattern,
        path: std::path::PathBuf::from(path),
    };
}
