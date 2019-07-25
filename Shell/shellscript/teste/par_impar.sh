#Perguntar se o usuario quer sair do programa ou continuar
echo "Olá gostaria de participar de um jogo de impar e par? (s) para SIM e (n) para NÃO"
read SIMOUNAO
#Se Continuar, peça apara o usuario entrar um númeor, e você deveria dizer se ele é impar ou par.
if [[ SIMOUNAO = "s"
]]
then 
echo "me de um número"
read NUMERO

if [[NUMERO%0]]
#Se ele escolher não participar, fale:"Obrigado por participar", e saia do programa
