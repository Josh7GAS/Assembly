#Geting the IP Adress
$ip_addrees = $( Read-Host  "What is the IP Adreess, if have the mask also insert" )
$bit_ip = 32
$byte = 8
$binarry_array = [Object[]]::new($bit_ip)

#separating ip from mask
foreach ($input in $ip_addrees) {

    #gettings the mask
    $ip, $mask = $input.Split("/")

    #getting the IP
    #$ip1, $ip2, $ip3, $ip4 = $input.Split(".")

}

#getting $number_of_enable_host and the mask binary form
$binarys_on_octec = 0
for ($count = 0; $count -lt $bit_ip; $count++) {
    if ($binarys_on_octec -eq $byte) {
        $binarry_array[$count] = "."
        $binarys_on_octec = 1
    }
    else {
        $binarys_on_octec ++ 
        
    }
    if ($count -lt $mask) {
        $binarry_array[$count] += 1
       
    }
    else {
        $binarry_array[$count] += 0
        $number_of_enable_hosts += 1
    }
}

#getting number_of_enable_network
if ($mask -le 15) {

    $number_of_enable_network = $mask - 8
}
elseif ($mask -le 23) {

    $number_of_enable_network = $mask - 16
}
else {
    $number_of_enable_network = $mask - 24
}
$number_of_enable_network = $mask - $avaible_host


#getting subnets
$subnets = [math]::Pow(2, $number_of_enable_network)
#getting the Hosts
$hosts = [math]::Pow(2, $number_of_enable_hosts) - 2

Write-Host "IP: "$ip
Write-Host "Mask: "$mask
Write-Host "Mask Binary mode: " $binarry_array
Write-Host "Number of subnets: "$subnets
Write-Host "Number of hosts: "$hosts
