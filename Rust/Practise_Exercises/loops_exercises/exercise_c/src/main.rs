fn main() {
    summing_the_first_hundred()
}

fn summing_the_first_hundred() {
    let mut number_a: isize = 0;
    let mut number_b: isize = 0;

    println!("Summing the first hundred natural numbers 100");

    for aux in 1..101 {
        number_a += 1;

        number_b = number_b + number_a;

        println!("The sum of {} plus {} is {}", number_b, number_a, number_b);
    }
}
