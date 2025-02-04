//#![feature(asm)]
#![no_std] //don´t link the rust library
#![no_main] //diseble all Rust-level entry points


use core::panic::PanicInfo;

//this function is called when panic
#[panic_handler]
fn panic(_info: &PanicInfo) -> !{
    loop{}
}

#[no_mangle] //don´t mangle the name of this function
pub extern "C" fn _start() -> ! {
    //this function is the entry point, since the linker looks for a function
    //named '_start' by default
    loop{}
}

