#!/bin/bash

#this function is used to store the regex output in a array, called "MATCHVALUES[$COUNT]=$AUX";
STORING_OUTPUT() {
    COUNT=0

    for AUX in $(grep -P -o '(?x)((?<=\Kauid=)|(?<=\Kcomm="nom))[\S]+' audit.log.1); do
        MATCHVALUES[$COUNT]=$AUX
        COUNT=$(($COUNT + 1))
    done
}
#This WHILE loop is for walk trough the array MATCHVALUES compare with the ""comm="nom-http"" string,
# and if the value match store the matched value and the previous one in a new array;
STORING_MATCHED() {
    VALUE=0
    VAR=0
    COMM='comm="nom-http"'

    while [ $VALUE -lt ${#MATCHVALUES[@]} ]; do
        if [ ${MATCHVALUES[VALUE]} == $COMM ]; then
            NEW_OUTPUT[$VAR]+=${MATCHVALUES[$VALUE - 1]}
            VAR=$(($VAR + 1))
            NEW_OUTPUT[$VAR]+=${MATCHVALUES[$VALUE]}
            VAR=$(($VAR + 1))
        fi
        VALUE=$(($VALUE + 1))
    done
    #Here it´s output the desired manipuled log;
    #echo ${NEW_OUTPUT[@]}
    #here it can be outputed line by line;
    for show in ${NEW_OUTPUT[@]};
    do
     echo $show 
    done
}

STORING_OUTPUT
STORING_MATCHED

