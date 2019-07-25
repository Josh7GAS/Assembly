#!/bin/bash

#pegar o nome e a idade
function ola(){
echo "Poderia me dar seu nome e sua idade?"
echo "Qual é o seu nome?"
read NOMEA
echo "Qual é a sua idade?"
read IDADEA

#segunda pessoa
echo "Me de mais um nome"
read NOMEB
echo "Qual é a idade dessa pessoa?"
read IDADEB

#Terceira pessoa
echo "Me outro nome"
read NOMEC
echo "Qual é a idade dessa pessoa?"
read IDADEC
}

ola
#comparando a idade das 3 pessoas 
function comparacao(){
    if [[ ${IDADEA} -gt ${IDADEB}]] && [[${IDADEA} -gt ${IDADEC} ]]
        then 
            echo "${NOMEA} é o mais velho ${NOMEB}"
        else    
            if [[ ${IDADEB} -gt ${IDADEC} && ${IDADEB} -gt ${IDADEA} ]]
                then 
                echo "${NOMEB} é o mais velho"
            else
                   if [[ ${IDADEC} -gt ${IDADEA} && ${IDADEC} -gt ${IDADEA} ]]
                    then 
                    echo "${NOMEB} é o mais velho"
    fi

}
comparacao

#mostrar o resultado das comparações
