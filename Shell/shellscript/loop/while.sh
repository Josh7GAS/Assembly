#!/bin/bash

COUNTER=1 

while [[ ${COUNTER} -le 10 ]]

do
	echo "Número da Contagem ${COUNTER}"
	((COUNTER++))
done

echo "${COUNTER}"