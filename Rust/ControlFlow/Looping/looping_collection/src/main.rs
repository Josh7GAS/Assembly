fn main() {
    let a = [10, 20, 30, 40, 50];
    let mut index = 0;

    while index <5{
        println!("The value is: {}", a[index]);

        index += 1;
    }

    for_each();

    reverse_contdown();
}

//foreach

fn for_each(){
    let a = [10, 20, 30, 40, 50];

    for element in a.iter(){
        println!("the value is {}", element);
    }
}

fn reverse_contdown(){
    for number in (1..4).rev(){
        println!("reverse -> {}!", number);
    }
    println!("LIFTOFF!");
}
