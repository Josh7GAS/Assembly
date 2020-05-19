fn main() {
    fibonacci();
}

fn fibonacci(){
    let mut actual: isize = 0;
    let mut before: isize = 1;
    let mut after: isize;

    for fib_numb in 0..15 {
        //0         0         1
        after = actual + before;
        before = actual + after;
        actual = before + after;
        println!("{}, {}, {}",after, before, actual);
                                    
    }
}
