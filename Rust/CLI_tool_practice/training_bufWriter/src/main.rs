use std::io::{self, Write};

fn main() {
    
    let stdout =io::stdout();//get the globla stdout entity
    let mut handle = stdout.lock(); //acquire a lock on it
    writeln!(handle, "foo: {}", 42);//add '?' if you care about erros here
}
