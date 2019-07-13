n1 = 10
n2 = 10
soma = n1 + n2
print('A soma é = a {}'.format(soma))

def soma_sem_parametro():
    numero1 = 20
    numero2 = 140
    soma = numero1 + numero1
    #print(soma)
    return (soma)

def soma_com_parametro(numero1, numero2):
    return numero1 + numero2

a = soma_com_parametro(10, 30)
print(a)

b = soma_com_parametro(33.9, 78.98)
print(b)

c = soma_com_parametro(45, 87.54)
print(c)






