print("Concorrencia a Presidencia")
a = int(input("Votos do candidato A"))
b = int(input("Votos do candidato B"))
c = int(input("Votos do candidato C"))
nulo = int(input("Quantidade de votos nulos"))
branco = int(input("Quantidade de votos brancos"))
soma = int (a+b+c+nulo+branco)
invalidos = int(nulo+branco)
pv1 = float(invalidos/soma*100)
pv2 = float(a/soma*100)
pv3 = float(b/soma*100)
pv4 = float(c/soma*100)
pv5 = float(nulo/soma*100)
pv6 = float(branco/soma*100)

print("Total de Votos {}".format(soma)),"%"
print("Total de Votos Invalidos {}".format(invalidos)),"%"
print("Percentual do total de votos validos {}".format(pv1)),"%"
print("Percentual do total de votos do candidato A {}".format(pv2),"%")
print("Percentual do total de votos do candidato B {}".format(pv3),"%")
print("Percentual do total de votos do candidato C {}".format(pv4),"%")
print("Percentual de votos nulos {}".format(pv5),"%")
print("Percentual de votos brancos {}".format(pv6),"%")


