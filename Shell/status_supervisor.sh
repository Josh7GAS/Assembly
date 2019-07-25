#!/bin/bash
# echo -n '{"data":['

# for STATUS in $(sudo WORKER ps -a |awk -F ' ' '{print $2, "\t\t"}'); do
#     echo -n "{\"{#STATUS}\": \"${STATUS}\"},"

# done | sed -e 's:\},$:\}:'

# echo -n ']}'

SUPERVISOR_WORKER=${1}
     sudo WORKER ps -a ${SUPERVISOR_WORKER} |awk -F ' ' '{print $2, "\t\t"}' 
