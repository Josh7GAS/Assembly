
#PAsta e caminho da planilha
$caminhoArquivo= "D:\Users\re91852z\Documents\Tozzini\All_Equipment-20200211-113215.xlsx"
$nomeAba = "All_Equipment-20200211-113215"

#craindo um objeto usando Com interface
$objExcel = New-Object -ComObject Excel.Application

#Disabilte a opção visible para não abrir o excel enquanto edia via CLI
$objExcel.Visible = $false

#Open Excel file n save in $Workbook
$WorkBook = $objExcel.Workbooks.Open($caminhoArquivo)

#puxa a aba 
$WorkSheet = $WorkBook.sheets.item($nomeAba)

#$numLines = $WorkSheet.usedrange
$numLines = 176

$rowsIp = New-Object System.Collections.ArrayList

 $newIpList = New-Object System.Collections.ArrayList

for ($count = 1; $count -le $numLines; $count++) {

    $rowsIp += $WorkSheet.Range("B" + $count).Value()
    
}$objExcel.quit()


foreach ($ips in $rowsIp) {

    $ip1, $ip2, $ip3, $ip4 = $ips.Split(".")

    $ip_list = $ip1, ".", $ip2, ".", $ip3, ".x"

    $newIpList = -join $ip_list 

    Write-Host $newIpList 

    #Write-Host $newIpList | Sort-Object | Get-Unique
}

