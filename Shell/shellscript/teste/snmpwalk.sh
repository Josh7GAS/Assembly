#/bin/bash
read -p "Enter the path to read the file" PATH
read -p "Enter Read Community" RO_COMMUNITY_STRING

STORING_OUTPUT() {
    COUNT=0
    FILE = arquivo.txt;
    
    for AUX in $(grep -P -o '\b\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}\b' $PATH); do
        IP_ADDRESS[$COUNT]=$AUX
        COUNT=$(($COUNT + 1))
    done

}

RUNNING_SNMP_COMMAND(){
    VALUE = 0

    while [ $VALUE -lt ${#IP_ADDRESS[@]} ]; do    
    'snmpwalk -v 2c -c <"$RO_COMMUNITY_STRING"> <"${IP_ADDRESS[$VALUE]}">.1.3.6.1.2.1.47.1.1.1.1.11 >> output.txt'
    VALUE=$(($VALUE + 1))
    done
}