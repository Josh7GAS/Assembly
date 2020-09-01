use std::io;
//use structopt::StructOpt;
// #[derive(StructOpt)]
// struct Cli{
//     ip_adress:String,
// }

fn main() {
    loop {
        println!("Give me an Ip and Mask.");

        let mut net_mask_input = String::new();

        io::stdin()
            .read_line(&mut net_mask_input)
            .expect("Failed to read Line");

        let split_input_to_get_mask: Vec<&str> = net_mask_input.split("/").collect();
        let split_input_to_get_ip: Vec<&str> = split_input_to_get_mask[0].split(".").collect();

        //let mask = split_input_to_get_mask[0].parse::<usize>().unwrap();

        let mask: usize = match split_input_to_get_mask[1].trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        let ip_last_octet: u32 = match split_input_to_get_ip[split_input_to_get_ip.len() - 1]
            .trim()
            .parse()
        {
            Ok(num2) => num2,
            Err(_) => continue,
        };
        getting_last_octet_binary(ip_last_octet);
        getting_mask_octet(mask);
        break;
    }
}

fn getting_last_octet_binary(ip_last_octet: u32) {
    let arr = vec![128, 64, 32, 16, 8, 4, 2, 1];
    let mut aux = 0;
    let binary_ip = 8;
    let mut count = 0;
    let mut binary_on_ip = vec![0; binary_ip];
    println!("We want to find = {}", ip_last_octet);

    for walk in arr {
        aux += walk;

        if aux == ip_last_octet {
            binary_on_ip[count] = walk;
            break;
        }
        if aux > ip_last_octet {
            aux -= walk;
            binary_on_ip[count] = 0;
            count += 1;
        } else {
            binary_on_ip[count] = walk;
            count += 1;
            continue;
        }
    }
    println!("getting last octet binary from the IP Address {:?}", binary_on_ip);
}

fn getting_mask_octet(mask: usize) {
    let mut num = 0;
    let byte = 8;
    let mut first_bit_from_the_last_octet = 24;
    let bit_in_octets = 32;
    let bits = vec![128, 64, 32, 16, 8, 4, 2, 1];
    let mut octet = vec![0; bit_in_octets];
    let mut last_octet = vec![0; byte];

    while num < bit_in_octets {
        for put_in_octet in &bits {
            if num >= mask {
                octet[num] = 0;
                num += 1;
            } else {
                octet[num] = *put_in_octet;
                num += 1;
            }
        }
    }

    for count in 0..7 {
        last_octet[count] = octet[first_bit_from_the_last_octet];
        first_bit_from_the_last_octet += 1;

    }

    println!("the mask is: {}", mask);
    println!("{:?}mask binary form\n", octet);

    println!("{:?}last octet binary from the mask\n", last_octet);
}
