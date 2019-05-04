segment .text  ; code segment
    global_start        ;most be declared for linker 
_start: ;tell linker a entry point 
mov edx,len ;message length
mov ecx,msg ;message to write
mov ebx,1 ; file descriptor (stdout)
mov eax,4 ; system call number 
int 0x80 ;call kernel

mov eax,1 ; system call number (sys_exit)
int 0x80 ; call kernel

segment .data ;data segment
msg db 'Hello world', 0xa ;our dear string 
len equ $ - msg  ;lenght of our dear string