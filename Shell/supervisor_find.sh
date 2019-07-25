#!/bin/bash

encontrar_worker()
{

    echo -n '{"data":['

    for WORKER in $(supervisorctl status all|awk -F ' ' '{print $1, "\t\t"}'); do
    echo -n "{\"{#WORKER}\": \"${WORKER}\"},"

    done | sed -e 's:\},$:\}:'

    echo -n ']}'

}

encontrar_status()
{   
     SUPERVISOR_WORKER=${1}
     supervisorctl status ${SUPERVISOR_WORKER} |awk -F ' ' '{print $2, "\t\t"}' 
}

while getopts "ws:" OPTION; do
    case $OPTION in 
    w) 
     encontrar_worker
      ;;
    s)
        STATUS=$OPTARG
        for COLUNA in $(supervisorctl status all|awk -F ' ' '{print $1, "\t\t"}'); do 
            if [[ ! $STATUS =~ ${COLUNA} ]] 
                then
                    echo "Worker não existe" 
                    exit 1
            else
                encontrar_status
            fi
        done
    ;;
    *)
     echo "Opção Incorreta"
     exit 1
     ;;
    esac
done