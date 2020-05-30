import sys,os,gzip

#DEFINICAO DE NOMES E DIRETORIOS PARA ENCAMINHAMENTO SEGUNDO ORIGEM
if sys.argv[1] == '/syslog/SP/SP_raw.log.1':
    ne_name = 'SPCTP_GPRHUA_GGS5'
    namePrefix = 'SP_final-'
    unzipPath = '/syslog/collectableCompressed/' #PATH DE ARQUIVOS DE SP FILTRADOS E AINDA NAO COMPACTADOS
    zipPath = '/syslog/collectableCompressed/SP_collectables/' #PATH DE ARQUIVOS DE SP FILTRADOS E COMPACTADOS
else:
    ne_name = 'RJBAR_GPRHUA_GGS05'
    namePrefix = 'RJ_final-'
    unzipPath = '/syslog/collectableCompressed/' #PATH DE ARQUIVOS DE RJ FILTRADOS E AINDA NAO COMPACTADOS
    zipPath = '/syslog/collectableCompressed/RJ_collectables/' #PATH DE ARQUIVOS DE RJ FILTRADOS E COMPACTADOS

logBruto=open(sys.argv[1],'r') #ABERTURA DO ARQUIVO DE ENTRADA COM MENSAGENS BRUTAS
logFiltrado=open(unzipPath + 'PreZipASerRenomeado.txt','w') #CRIACAO DO ARQUIVO QUE RECEBE O CONTEUDO FILTRADO

while True:
    line = logBruto.readline() #LEITURA DO ARQUIVO DE ENTRADA LINHA POR LINHA
    if not line:
        break;

    primeiroFiltro = line.split(" date=")[1] #FILTRAGEM DO CAMPO "DATE"
    data = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" time=")[1] #FILTRAGEM DO CAMPO "TIME"
    tempo = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" action=")[1] #FILTRAGEM DO CAMPO "ACTION"
    action = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" srcip=")[1] #FILTRAGEM DO CAMPO "SRCIP"
    srcip = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" transip=")[1] #FILTRAGEM DO CAMPO "TRANSIP"
    transip = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" transport=")[1] #FILTRAGEM DO CAMPO "TRANSPORT"
    transport = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" sessionid=")[1] #FILTRAGEM DO CAMPO SESSIONID"
    sessionid = primeiroFiltro.split()[0]

    primeiroFiltro = line.split(" duration=")[1] #FILTRAGEM DO CAMPO "DURATION"
    duration = primeiroFiltro.split()[0]

    logFiltrado.write( data + ',' + tempo + ',' + ne_name + ',' + action + ',' + srcip + ',' + transip + ',' + transport + ',' + sessionid + ',' + duration + '\n') #ESCRITA DOS CAMPOS FILTRADOS NO NOVO ARQUIVO

logBruto.close()

hname = tempo.split(":")[0] + 'h'
name = namePrefix + data + '-' + hname + '.txt' #DEFINICAO DO NOME DO ARQUIVO FINAL COMPACTADO
os.rename(unzipPath + 'PreZipASerRenomeado.txt', unzipPath + name) #RENOMEACAO DO ARQUIVO A SER COMPACTADO

#CRIACAO DO ARQUIVO COMPACTADO E PASSAGEM DO CONTEUDO FILTRADO
fp = open(unzipPath + name,'rb')
data = fp.read()
f = gzip.open(zipPath + name + '.gz', 'wb')
f.write(data)

#DELECAO DO ARQUIVO NAO COMPACTADO
os.remove(unzipPath + name)