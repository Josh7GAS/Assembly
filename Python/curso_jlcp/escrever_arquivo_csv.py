import csv

try:
    arquivo = open('documento.csv', 'w', newline='', encoding='utf-8')
    write = csv.writer(arquivo, delimiter = ';')
except Exception as err:
    print('Não foi possivel Abrir e escrever o arquivo')
    print('Erro'.format(err))

cabecalho = ['Nome', 'Idade', 'Situacao']
write.writerow(cabecalho)

funcionario1 = ['Jose','25', 'Ativo']
write.writerow(funcionario1)
print('Escrevendo linha 1')

funcionario2 = ['Antonio', '55', 'Ativo']
write.writerow(funcionario2)
print('Escrevendo linha 2')
funcionario3 = ['Marcos', '21', 'Ativo']
write.writerow(funcionario3)
print('Escrevendo linha 3')