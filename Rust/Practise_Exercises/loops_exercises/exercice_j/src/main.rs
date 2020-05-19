fn main() {
    celsius_to_fahrenheit();
}

fn celsius_to_fahrenheit() {
    let mut celsius: usize = 10;
    let mut fahrenheit: usize;

    while celsius < 100 {

        fahrenheit = (celsius * 9 / 5) + 32;

        celsius += 10;

        println!("This Celsius is: {}. \n So in Fahrenheit wil be: {}", celsius, fahrenheit);
    }
}
