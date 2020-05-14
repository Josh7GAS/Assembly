use std::io;
fn main() {
    //make a multiplication table
    //multiplication_table();
    multiplication_table_user()
}

fn multiplication_table_user() {
    loop {
        println!("Please input a number.");

        //atributtes
        let mut user_number = String::new();
        let mut aux: isize = 0;
        let mut result: isize;

        //receiving user_input and parsing
        io::stdin()
            .read_line(&mut user_number)
            .expect("Failed to read line, please give a number");

        let user_number: isize = match user_number.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        //calculating
        println!("Printing a multiple table of {}", user_number);
        while aux <= 10 {
            result = user_number * aux;

            println!("{} x {} = {}", user_number, aux, result);

            aux += 1;
        }
        break;
    }
}

fn multiplication_table() {
    //reading user input with "std:io"
    let mut number: isize = 0;
    let mut aux: isize = 0;
    let mut result: isize = 0;

    println!("Writing a Multiple Table");

    while number <= 10 {
        while aux <= 10 {
            result = number * aux;

            println!("{} x {} = {}", number, aux, result);

            aux += 1;
        }
        number += 1;
        aux = 0;
    }
}
