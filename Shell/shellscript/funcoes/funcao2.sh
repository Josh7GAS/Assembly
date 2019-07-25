#!/bin/bash
function minha_outra_funcao()
{
    for x in $*;
    do
        echo $x;
    done 
}

minha_outra_funcao