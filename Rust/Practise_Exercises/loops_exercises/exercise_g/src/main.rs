fn main() {
   expoent_on_base_();
}

fn expoent_on_base_(){
    let base: isize = 3;
    let mut result: isize = 0;
    let mut number: isize = 0;

    for expoent in 0..16{
    
        while number <= expoent {
            
            result = result * base;

        }number +=1;

        println!("The potence of 3^{} is {}",expoent, result);
    }
}
