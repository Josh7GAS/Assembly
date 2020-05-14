fn main() {
    summing_the_even_values()
}

fn summing_the_even_values(){

    let mut result: isize = 0;
    let mut number_a: isize = 0;

    for number in 1..501{

        if number % 2 == 0 {

            result = number_a + number;
            
            println!("The number is {} even so, {} + {} = {}", number, number_a, number, result);

            number_a = result;

        }else{
            println!("The number is {} odd", number);
        }
    }
}
