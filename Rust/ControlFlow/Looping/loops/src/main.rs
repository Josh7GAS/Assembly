fn main() {
        let mut counter = 0; 
    
        let result = loop{
            counter +=1;
    
            println!("{}",counter);
            
            if counter == 10 {
                break counter *2;
            }
        };
    
        println!("The result  is {}", result);

        while_loops();
    
}

fn while_loops(){
    let mut number = 3;

    while number !=0{
     println!("{}!", number);

     number -=1;
    }

println!("LIFTOFF!!!");
}