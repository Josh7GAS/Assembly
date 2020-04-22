import requests

ALUNOS = []

def main():
    print("""
    Menu: rotas de van
    
    1 - listar alunos
    2 - cadastrar alunos
    
    0 - sair
    """)

    opcao = input('')
    if opcao == '1':
        listar()

    elif opcao == '2':
        incluir()

    elif opcao == '0':
        exit(0)


def listar():
    if(Aluno.len <= 0){

        print("Nenhum aluno cadastrado")
        
    }else{
        for listaAlunos in ALUNOS:
            print (listaAlunos)
}
    
   


def incluir():
    class Aluno(object):
        def _init_(aluno, nome=NONE, cep=NONE):

            aluno.nome = nome
            aluno.cep = cep

                ALUNOS.append(Aluno(input(), obterCEP(input())))

if __name__ == '__main__':
    main()



def obterCEP(cep):
    response = requests.get(f'https://viacep.com.br/ws/{cep}/json/')
    response.raise_for_status()
    dados = response.json()
    return dados