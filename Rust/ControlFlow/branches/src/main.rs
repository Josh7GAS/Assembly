fn main() {
    let number = 7;
    
    if number <5{
        println!("Condition is true");
    }else{
        println!("Condition is false");
    }

    learning_if();
    learning_ifelse();
    looping();
}

fn learning_if(){
    let number = 3;

    if number != 0{
        println!("numer was three");
    }
}

fn learning_ifelse(){
    let number = 6;

    if number % 4 == 0 {
        println!("number is divisible by 4");
    }else if number % 3 == 0 {
        println!("number is divisible by 3");
    }else if number % 2 == 0 {
        println!("number is divisible by 2");
    }else{
        println!("number is not divisible by 2, 3 or 4");
    }
}

//returning value from the loop

