fn main() {
    
    //Rust is a typed static language
    // so keep in mind that all variables should get typed as the exemple below shows:
    // you need to add a type annotation
    let guess u32 = "42".parse().expect("Not a number!");

    println!("Guess is: {}", guess);

    //Types n Rust
    //Scalar types are: integers, floating-point numbers, Booleans, and characters.
    // Lets see them in action

    //Integer is a number without a fraction integer tyoe is called using u32.
    //Singned and unsiged numbers works like positive and negative numers on papper,
    //Singned numbers are like when you write the number with a plus or a minus sign.
    //Unsiged is when it´s save to asssume that number is positive.

    //Floating numbers are f32 or f64, by default they are 64 bits, so if you does.

    let x = 2.0; // the type will be f64

    let x: f32 = 3.0 //it will be 32 bits
}
