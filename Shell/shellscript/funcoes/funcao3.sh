#!/bin/bash
function verdade()
{
    [ $1 ] && echo 'verdade' || echo 'mentira'
}

verdade0