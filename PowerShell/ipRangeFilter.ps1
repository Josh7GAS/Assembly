
#PAsta e caminho da planilha
$caminhoArquivo = $( Read-Host  "Qual e o Path para a planilha" )

$nomeDaPlanilha = $(Read-Host "Qual e o nome da planilha")

#$caminhoArquivo = "D:\Users\re91852z\Documents\Tozzini\All_Equipment-20200211-113215.xlsx"
$nomeAba = $(Read-Host "Qual e a ABA a ser lida?")
#$nomeAba = "All_Equipment-20200211-113215"

#craindo um objeto usando Com interface
$objExcel = New-Object -ComObject Excel.Application

#Disabilte a opção visible para não abrir o excel enquanto edia via CLI
$objExcel.Visible = $false

#Open Excel file n save in $Workbook
$WorkBook = $objExcel.Workbooks.Open($caminhoArquivo + "\" + $nomeDaPlanilha)

#puxa a aba 
$workSheet = $WorkBook.sheets.item($nomeAba)

#$numLines = $workSheet.usedrange



$rowsIp = New-Object System.Collections.ArrayList

$newIpList = New-Object System.Collections.ArrayList

$WorksheetRange = $workSheet.UsedRange
$RowCount = $WorksheetRange.Rows.Count


$numLines = $RowCount
 

for ($count = 2; $count -le $numLines; $count++) {

    $rowsIp += $workSheet.Range("B" + $count).Value()
    
}$objExcel.quit()


foreach ($ips in $rowsIp) {

    $ip1, $ip2, $ip3, $ip4 = $ips.Split(".")

    $ip_list = $ip1, ".", $ip2, ".", $ip3, ".x"

    $newIpList += "`n" + -join $ip_list 

    #Write-Host $newIpList 

}

$newIpList = $newIpList | sort | Get-Unique

Write-Host $newIpList "`n"