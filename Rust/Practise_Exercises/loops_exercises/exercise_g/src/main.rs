fn main() {
    expoent_on_base_();
     expoent_on_base_2();
}

fn expoent_on_base_() {
    let base: isize = 3;
    let mut result: isize = 1;
    let mut number: isize = 1;

    for expoent in 0..17 {
        while number < expoent {
            result *= base;

            println!("pow of 3^{} is: {}",number, result);   

            number+=1;
        }
    }
}
fn expoent_on_base_2() {
    let base: isize = 3;
    let mut result: isize;

    for expoent in 0..16 {
        result = isize::pow(base, expoent);

        println!("The potence of {}^{} is {}", base, expoent, result);
    }
}
