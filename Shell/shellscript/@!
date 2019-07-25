#!/bin/bash
#Esse script cira um site com o servidor apache

#Instalar os pacotes necessarios para o Apache
sudo apt-get install apache2

#Abrir o Firewall
firewall-cmd --permanent -add-service=http
firewall-cmd --relod

#Habilitar o apache no inicio do sistema Linux
sudo systemctl enable apache2

#Iniciar o servidor apos instalação
sudo systemctl start apache2

sudo  echo "meu primeiro site">/var/www/html/index.htmli
