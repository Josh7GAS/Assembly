$ArrayIp = "10.106.101.245",
"10.106.104.2",
"10.106.104.3",
"10.106.104.5",
"10.106.104.6",
"10.106.104.16",
"10.106.104.8",
"10.106.104.10",
"10.106.104.20",
"10.106.104.21",
"10.106.104.34",
"10.106.104.26",
"10.106.104.24",
"10.106.104.25",
"10.106.104.27",
"10.106.104.22",
"10.106.104.23",
"10.106.104.38",
"10.106.104.36",
"10.106.103.6",
"10.106.103.13",
"10.106.103.21",
"10.106.103.37",
"10.106.103.14",
"10.106.103.41",
"10.106.102.23",
"10.106.101.15",
"10.106.101.70",
"10.106.101.64",
"10.106.101.77",
"10.106.101.16",
"10.106.101.44",
"10.106.101.54",
"10.106.101.25",
"10.106.101.61",
"10.106.101.28",
"10.106.101.21",
"10.106.101.27",
"10.106.101.18",
"10.106.101.59",
"10.106.101.97",
"10.106.101.16",
"10.106.101.10",
"10.106.101.95",
"10.106.101.15",
"10.106.101.20",
"10.106.101.15",
"10.106.101.20",
"10.106.101.23",
"10.106.101.17",
"10.106.101.20",
"10.106.101.69",
"10.106.101.53",
"10.106.101.127",
"10.106.101.205",
"10.106.101.236"


foreach ($ArrayIps in $ArrayIp) {
    if (Test-Connection $ArrayIps -Count 1 -Quiet) {
        $countOnline++
        Write-Host $ArrayIps is Online -ForegroundColor Green
    }
    else {
        Write-Host $ArrayIps is Offline -Foreground Red
        $countOffline++
    }

    
}
Write-Host "Quantidade de Hosts online" $countOnline  ", Quantidade de Hosts offline" $countOffline