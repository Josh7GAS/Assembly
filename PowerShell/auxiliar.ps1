#Geting the IP Adress
$ip_addrees = $( Read-Host  "What is the IP Adreess, if have the mask also insert" )
$bit_ip = 32
$byte = 8
$binarry_array = [Object[]]::new($bit_ip)
$bound_of_octets_beg = New-Object System.Collections.ArrayList

$bound_of_octets_end = New-Object System.Collections.ArrayList

#separating ip from mask
foreach ($input in $ip_addrees) {

    #gettings the mask
    $ip, $mask = $input.Split("/")

    #getting the IP
    #$ip1, $ip2, $ip3, $ip4 = $input.Split(".")

}

#getting $number_of_enable_host and the mask binary form
$binarys_on_octec = 0
$number_of_enable_hosts = 0

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

#getting subnets
$subnets = [math]::Pow(2, $number_of_enable_network)

#getting the Hosts
$hosts = [math]::Pow(2, $number_of_enable_hosts) - 2    

Write-Host "IP: "$ip
Write-Host "Mask: "$mask
Write-Host "Mask Binary mode: " $binarry_array
Write-Host "Number of subnets: "$subnets
Write-Host "Number of hosts: "$hosts

$octet1, $octe2, $octet3, $octet4 = $ip.Split(".")
$octet1end, $octe2end, $octet3end, $octet4end = $ip.Split(".")
$octe2end = 0
$octet3end = 63

# $octet1 = $octet1 -as [int64]

# $octet2 = $octet2 -as [int64]

# $octet3 = $octet3 -as [int64]

# $octet4 = $octet4 -as [int64]

$writing_the_xml_file = New-Object System.Collections.ArrayList

for ($octet2 = 0; $octet2 -le 255; $octet2 += 1) {
    for ($octet3 = 0; $octet3 -le 255; $octet3 += 64) {
       
        
        $bound_of_octets_beg += "<IPRange><Start>", "10.", $octet2.ToString(), ".", $octet3.ToString(), ".", "1"
    
    
    
        # if ($octet2 -eq 255) {
        #     $octet2 = 0
        # }

    }
}

for ($octe2end = 0; $octe2end -le 255; $octe2end += 1) {
    for ($octet3end = 63; $octet3end -lt 255; $octet3end += 64) {
        
        $bound_of_octets_end += "</Start><End>", "10.", $octe2end, ".", $octet3end.ToString(), ".", "254", "</End></IpRange>"
    }
}

#colocar um for looping para unir as listas
$writing_the_xml_file += -join $bound_of_octets

Write-Output $writing_the_xml_file | Out-File -FilePath D:\Users\teste1.xml