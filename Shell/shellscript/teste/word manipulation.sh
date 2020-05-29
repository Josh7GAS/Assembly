#/bin/bash
i=0;
for j in `cat audit.log.1` 
do
   array[$i]=$j; 
   #do manipulations here
    i=$(($i+1)); 
   
done 
echo "Value of third element in my array : ${array[3]} ";
echo "array total length: ${#array[@]}";
for  GET_COMM in $array
    do
        if [${GET_AUID[$count]} == (?x)((?<=\Kcomm="nom))[^\s]+]
        then

        for GET_AUID in $array 
            if [${array[$i]}] == (?x)((?<=\Kauid=))[^\s]+]
            then 
