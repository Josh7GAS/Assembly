use structopt::StructOpt;

// #[derive(StructOpt)]
// struct Cli{
//     ip_adress:String,
// }

fn main() {
    // let args = Cli::from_args();
    // let ip = &args.ip_adress;
    //binary_calculator();
    getting_subnet_mask();
}

fn binary_calculator() {
    let arr = [128, 64, 32, 16, 8, 4, 2, 1];
    let num = 154;
    let mut aux = 0;

    println!("We want to find = {}\n", num);

    for walk in &arr {
        if walk <= &num {
            aux += walk;
            println!("adding:{}, current value is {} ", walk, aux);
            if aux == num {
                break;
            }
            if aux > num {
                aux -= walk;
                println!("descarting:{}", walk);
            } else {
                continue;
            }
        }
    }
    println!("\nthe calculator returned {}", aux);
}

fn getting_subnet_mask() {
    let mut num = 0;
    let bar = 27;
    let bit_in_octets = 32;
    let bits = vec![128, 64, 32, 16, 8, 4, 2, 1];
    let mut octet = vec![0; bit_in_octets];

    while num < bit_in_octets {
        for put_in_octet in &bits {
            if num >= bar {
                octet[num] = 0;
                num += 1;
            } else {
                octet[num] = *put_in_octet;
                num += 1;
            }
        }
    }
    println!("{:?}", octet);
    println!("{}", octet.len());
}