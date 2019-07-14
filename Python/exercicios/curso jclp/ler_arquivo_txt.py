arquivo = open('leitura.txt')

linhas=arquivo.readlines()

print(linhas)

for linha in linhas:
    print(linha)