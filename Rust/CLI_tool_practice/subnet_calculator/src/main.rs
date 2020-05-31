use structopt::StructOpt;

// #[derive(StructOpt)]
// struct Cli{
//     ip_adress:String,
// }

fn main() {
    // let args = Cli::from_args();
    // let ip = &args.ip_adress;
    binary_calculator()
}

fn binary_calculator() {
    let arr = [128, 64, 32, 16, 8, 4, 2, 1];
    let num = 154;
    let mut aux = 0;

    println!("We want to find = {}\n", num);

    for walk in &arr {y
        if walk <= &num {
            aux += walk;
            println!("adding:{}, current value is {} ", walk, aux);
            if aux == num {
                break;
            }
            if aux > num {
                aux -= walk;
                println!(
                    "descarting:{}",
                    walk
                );
            } else {
                continue;
            }
        }
    }
    println!("\nthe calculator returned {}", aux);
}
