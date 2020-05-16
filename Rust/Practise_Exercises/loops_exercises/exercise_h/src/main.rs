use std::io;

fn main() {
    user_expoentitation();
}
fn user_expoentitation() {
    loop {
        let mut base = String::new();
        let mut expoent = String::new();
        let mut number: isize = 1;
        let mut result: isize = 1;

        println!("Give me a Base and an expoent\n");
        println!("Base: ");
        
        io::stdin()
            .read_line(&mut base)
            .expect("Failed to read line, please give a number to be the base");

        let base: isize = match base.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        println!("Expoent:");

        io::stdin()
            .read_line(&mut expoent)
            .expect("Failed to read line, please give a number to be the exponent");

        let expoent: isize = match expoent.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        for times in 0..expoent {
            result *= base;

            println!("pow of {}^{} is: {}", base, number, result);

            number += 1;
        }break;
    }
}
