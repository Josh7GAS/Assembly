#/bin/bash
COUNT=0;
VALUE=0;
NEW_OUTPUT=()
COMM='comm="nom-http"';
for AUX in ` grep -P -o '(?x)((?<=\Kauid=)|(?<=\Kcomm="nom))[\S]+' audit.log.1` 
do
   MATCHVALUES[$COUNT]=$AUX; 
   #do manipulations here
    COUNT=$(($COUNT+1)); 
   
done 
echo "Value of third element in my array : ${MATCHVALUES[@]} ";
 MATCHVALUES_LENGTH=${#MATCHVALUES[@]}
 

# for LOOKINSIDE in "${MATCHVALUES[@]}"; 
# do
#     if [ $LOOKINSIDE == $COMM ];
#         then 
#             #NEW_OUTPUT[$COUNT_2]=$LOOKINSIDE[$COUNT_2-1];
            
#             NEW_OUTPUT[$COUNT_2]=$LOOKINSIDE[$COUNT_2];
#             echo ${NEW_OUTPUT[$COUNT_2]}
            
#         fi
#         COUNT_2=$(($COUNT_2+1));
# done

# echo "Value of third element in my array : ${NEW_OUTPUT[$COUNT_2]} ";
# echo "NEW_OUTPUT_LENGTH = ${#NEW_OUTPUT[@]}";
while [ $VALUE -le $MATCHVALUES_LENGTH ]; do
    if [ ${MATCHVALUES[VALUE]} -eq $COMM ]
       then            
             NEW_OUTPUT[$VALUE]+=($MATCHVALUES[$VALUE]);
         fi
         VALUE=$(($VALUE+1));
         echo "NEW_OUTPUT_LENGTH = ${#NEW_OUTPUT[@]}";
done