import csv

arquivo = csv.reader(open('leitura.csv'),delimiter=';')
for [nome_host, ip, id_group, id_templates] in arquivo:
    print('{} - {} - {} - {}'.format(nome_host, ip, id_group, id_templates))
