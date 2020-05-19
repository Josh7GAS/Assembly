fn main() {
    factorial();
}

fn factorial() {
    let n: isize = 15;
    let mut result: isize = 0;
    let mut aux: isize = 0;

    for mut numbers in 0..n {
        aux = numbers;
        result = 0;
        while aux >= 0 {
            result += aux;
            aux -= 1;
        }
        println!("The factorial number of {} is {}", numbers, result);
    }
}
