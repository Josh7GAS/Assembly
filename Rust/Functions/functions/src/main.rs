fn main() {

    println!("Hello, world!");

    another_function(5, 9);

    expression();

    let x = 5;
    println!("The value of x is {}", five());
    println!("The value of x is {}", x);

    println!("the value gived is: {}", plus_one(79));
}

fn another_function(x: isize, y: isize){

    println!("The value of x is:{}", x);
    println!("The value of y is:{}", y);

}

//Function bodies Contain Statements and Expressions
//expression return  a value
//statements are instructions and do not return a value

fn expression(){
    let x = 5;//Statement, Statements have semicolon ";"

    
    let y = {
        let x = 3;
        x + 1//Expression
    };

    println!("The value of y is: {}", y);
}

//Function with a return value

fn five() -> i32{
    5
}

fn plus_one(x:i32) -> i32 {
    x + 1
}

