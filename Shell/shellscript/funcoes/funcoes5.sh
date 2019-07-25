#!/bin/bash
function constante()
{

    local -r TRUE='verdade'
    local -r FALSE='falso'
    echo $TRUE
    echo $FALSE
    TRUE='nem vem'
    FALSE='isso ai cara'

}

constante