#!/bin/bash
echo "Give me the community string: "
read RO_COMMUNITY_STRING

echo "Give me an file to read"
read FILE

STORING_OUTPUT() {

    for LINE in $(cat $FILE); do
        echo $LINE >> 'output.txt'
        $(snmpwalk -v 2c -c $RO_COMMUNITY_STRING $LINE .1.3.6.1.2.1.47.1.1.1.1.11 >>output.txt)

    done
    echo "Check the createed file called output.txt"
}

STORING_OUTPUT
