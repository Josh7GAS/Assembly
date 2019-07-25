#!/bin/bash
cd /tmp
touch arq1
ls -l /tmp/arq1
pwd

#Atribuir uma data a variavel date

DATA=$(date +%m-%y)
cd ~/Desktop/shellscript
touch arquivo-${DATA}.txt

