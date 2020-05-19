fn main() {
    xes();
}

fn xes() {
    let table_houses: isize = 65;
    let mut grains_in_place: isize = 1;

    for put_grains in 1..table_houses {
        grains_in_place += put_grains;

        println!(
            "House {} have: {} grains.\n 
            Total is {}",
            put_grains, put_grains, grains_in_place
        );
    }
    println!(
        "\n=============================================\nAll grains in the xes table are {}",
        grains_in_place
    );
}
