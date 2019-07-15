try:
    arquivo = open('tentativa.txt')
    print('Arquivo aberto')
except Exception as err:
    print('Não foi possível abrir o arquivo')
    print('Erro: {}'.format(err))