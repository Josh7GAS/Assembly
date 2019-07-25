#!/bin/bash
if [[ ${UID} -eq 0 ]]
	
then 
	echo "Você tem permissão de root."
	echo "Você quer parar o servidor apache?"
	echo "Digite (s) para sim, e (n) para não"
	read RESPOSTA
	if [[ ${RESPOSTA} = "s" ]]
	then
		echo "Você pediu para parar o servidor"
		echo "Parando o Servidor Apache..."
		systemctl stop httpd
	else
		echo "Ok. Nada será feito"
	fi

else 
	echo "Por favor vire root para usar esse programa."
fi
