fn main() {
    
    using_loop();
    using_while();
    
}

fn using_loop(){
    let mut number: isize = 15;

        loop{
            if number <= 200{
             let square = number * number;

                println!("The square of {} is {}",number, square);

                 number +=1;
            }else{
                break 
            }
        }
}

fn using_while(){
    //wait seconds to show
    // let mut wait = 0;
    // while wait <=9{

    // println!("Using While:{}", wait);

    // wait +=1;
    // }

for number in (0..9).rev(){
    println!("Using While in {}", number);
}

    //do the exercise with "while"
    let mut number: isize = 15;

    while number <= 200{
        let square = number * number;

        println!("The square of {} is {}",number, square);
        number +=1;
    }

    println!("Finish")
}
