fn main() {
    //using let to store variable and output to earn about
    // "mut" => is a wildcard for the variables undestanding they are mutable
    let mut x = 5;
    println!("The value of x is {}", x);
     x = 9;
    println!("The value of x is {}", x);

    //const is a variable as the name says it´s constant
    //cannot be used for a runing time logic or mutable on a function
    const MAX_POINTS: u32 = 100_000;

    println!("Max Point are {}", MAX_POINTS);

    //here I traing to understand the concepts of shadowing
    //its no like "mut" it make the byte code create another memorie and store new values.
    let z = 5;

    let z = z + 1;

    let z = z * 2;

    println!("the value of x is: {}", z);

}
