#!/bin/bash
#################################
# SCRIPT BACKUP SERVIDOR DADOS  #
#################################

mount /dev/disk/by-uuid/3221-7431 /backup 
mounted=`mount | grep /backup`

#Se a montagem não estiver Up então Fecha, Caso contrário realiza o Backup
if [ -z “$mounted” ] 
then
    echo "Backup não aconteceu:" >> /var/log/backup.log

    exit 1 
else

    # COMPACTA TODO O CONTEÚDO DAS PASTAS DENTRO DE HOME/JOSHUA
    tar -zcvf  /backup/backupjoshua.tar.gz /home/joshua 

    # REGISTRA QUE O BACKUP FOI FEITO COM SUCESSO
    echo “Backup realizado com sucesso em: ” >> /var/log/backup.log

    # DESMONTA O PONTO DE MONTAGEM /BACKUP
    umount /backup

fi

# FIM DAS INSTRUÇÕES #