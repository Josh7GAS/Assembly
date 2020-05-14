fn main() {
    divisible_by_four();
}

fn divisible_by_four() {
    let mut count: isize = 1;

    println!("=======Start of the program=======\n");

    while count <= 200 {
        if count % 4 == 0{
            println!("The number {} is divisible by 4", count);
        }

        count+=1;
    } 
    println!("\n=======End of the program=======");
}
