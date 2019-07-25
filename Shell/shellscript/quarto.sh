#!/bin/bash
#O Nosso primeiro programa complexo
echo "O programa foi iniciado..."
#mostrar o hostname
echo "O nome da maquina: $(hostname)"
#mostrar a versao do kernel
echo "A versao do Kernel: $(uname -r)"
#mostrar informações sobre a maquina
echo "Info sobre a maquina: $(uname -m)"
#mostrar dispositivos em blocos disponiveis
echo "Dispositivos em bloco disponiveis: $(lsblk)"
#mostrar dispositivos em blocos disponiveis
#mostrar espaco no sistema
df -h
