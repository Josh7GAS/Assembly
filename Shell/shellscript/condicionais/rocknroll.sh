#!/bin/bash

#checar a idade do usuario e enviar para um show de acordo com sua idade

#Nome: ./rocknroll

#mensagem de boas vindas
echo "Olá, quer ir em um show de Rock and Roll?"
#coleta respostas
read IDADE

#faz  o teste com o if
if [[ ${IDADE} -ge 18 ]]
#se o teste for verdadeiro
then 
	echo "Você tem 18 anos ou mais."
	echo "Aqui esta o seu ingresso para o show muito loko."       
#Outro teste para verificar
#se o teiste for falso
elif [[ ${IDADE} -ge 16 ]]

then 
	echo "Voce tem 16 ou 17 anos."
	echo "Aqui está seu ingresso para o show do Restart"
else 
	echo "Voce tem menos de 18."
	echo "Aqui esta o seu ingresso para o show da PePa."
#fechamos a condicional com fi
fi
