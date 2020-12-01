#Geting the IP Adress
$ip_addrees = $( Read-Host  "What is the IP Adreess, if have the mask also insert" )
$bit_ip = 32
$byte = 8
$binarry_array = New-Object System.Collections.ArrayList


foreach ($input in $ip_addrees) {

    #gettings the mask
    $ip, $mask = $input.Split("/")

    #getting the IP
    #$ip1, $ip2, $ip3, $ip4 = $input.Split(".")

}
Write-Host $ip
Write-Host $mask
#getting the mask binary
$binarys_on_octec = 1
$number_of_hosts = 0

for ($count = 0; $count -lt $bit_ip; $count++) {
    if ($binarys_on_octec -eq $byte) {
        $binarry_array[$count] += "."
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
        $number_of_hosts += 1
    }
}

Write-Host $binarry_array

#getting subnets
$subnets = [math]::Pow(2, $number_of_hosts)
#getting the Hosts
$hosts = [math]::Pow(2, $number_of_hosts) - 2

Write-Host $subnets
Write-Host $hosts
