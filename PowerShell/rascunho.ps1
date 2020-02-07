
#PAsta e caminho da planilha
$caminhoArquivo = "D:\Users\re91852z\Desktop\ip_adress_test.xlsx"
$nomeAba = "Planilha1"

#craindo um objeto usando Com interface
$objExcel = New-Object -ComObject Excel.Application

#Disabilte a opção visible para não abrir o excel enquanto edia via CLI
$objExcel.Visible = $false

#Open Excel file n save in $Workbook
$WorkBook = $objExcel.Workbooks.Open($caminhoArquivo)

#puxa a aba 
$WorkSheet = $WorkBook.sheets.item($nomeAba)

#$numLines = $WorkSheet.usedrange
$numLines = 1240

for ($count = 1; $count -le $numLines; $count++) {
    
    [pscustomobject]@{

        IpAdresses = $WorkSheet.Range("A" + $count).Text
        
    }

    $ip += Select-Object IpAdresses
    
}

Write-Host $ip

foreach ($ips in $ip) {

    $ip1, $ip2, $ip3, $ip4 = $ips.Split(".")

    $ip_list = $ip1, ".", $ip2, ".", $ip3, ".x"

    $newIpList = -join $ip_list

    Write-host $newIpList `n
}