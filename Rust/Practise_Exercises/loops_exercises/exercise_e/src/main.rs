fn main() {
    odd_numbers();
}

fn odd_numbers(){
    println!("Showing all the odd numbers from 1 to 20");

    for numbers in 1..21{
        if numbers % 2 == 0{

            println!("The number is even, just showing odd numbers");

        }else{
            println!("the number {} is odd", numbers);
        }
    }
}