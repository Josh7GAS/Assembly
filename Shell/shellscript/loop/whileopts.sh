#!/bin/bash

while getopts "brgc:" OPTION; do #getopts passsa os argumentos argumentos 
    case $OPTION in 
    b)                  #primeiro caso
        COLOR=BLUE
        ;;
    r)                  #se a opção dada for veremelha
        COLOR=RED
        ;;
    g)                  #se a opção dada for verde
        COLOR=GREEN
        ;;
    c)                  #se a opção dada for verde
        COLOR=$OPTARG #a cor pode ser escrita coo argumento dentro dos seguintes parametros
        [[ ! $COLOR =~ BLUE|RED|GREEN ]] && {
            echo "Incorrect options provided"
            exit 1
        }
        ;;
    *)
        echo "Incorrect options provided"
        exit 1
        ;;
    esac
done

echo "Color is $COLOR"
exit 0;