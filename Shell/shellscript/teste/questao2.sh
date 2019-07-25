#!/bin/bash

#passar o nome do usuario como argumento.
echo "Nome1 $1"
echo "Nome2 $2"

#se passar mais que dois nomes 
if [[ $# == 2 ]]
then
echo "$@"
else 
echo "Apenas 2 nomes são permitidos"
fi