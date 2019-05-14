print("Say four variables, A, B, C, D")
a = int(input("A = ?"))
b = int (input("B = ?"))
c = int (input("C = ?"))
d = int (input("D = ?"))

soma1 = a+b
soma2 = a+c
soma3 = a+d

soma4 = soma1
soma5 = b+c
soma6 = b+d

soma7 = soma2
soma8 = soma5
soma9 = c+d

soma10 = soma3
soma11 = soma6
soma12 = soma9

multiplicacao1 = a*b
multiplicacao2 = a*c
multiplicacao3 = a*d

multiplicacao4 = multiplicacao1
multiplicacao5 = b*c
multiplicacao6 = b*d

multiplicacao7 = multiplicacao2
multiplicacao8 = multiplicacao5
multiplicacao9 = c*d

multiplicacao10 = multiplicacao3
multiplicacao11 = multiplicacao6
multiplicacao12 = multiplicacao9

print("the sum between A={} and B={}".format(a, b)+ " is{} ".format(soma1))
print("the sum between A={} and C={}".format(a, c)+ " is{} ".format(soma2))
print("the sum between A={} and D={}".format(a, d)+ " is{} ".format(soma3))

print("the sum between B={} and A={}".format(b, a)+ " is{} ".format(soma4))
print("the sum between B={} and C={}".format(b, c)+ " is{} ".format(soma5))
print("the sum between B={} and D={}".format(b, d)+ " is{} ".format(soma6))

print("the sum between C={} and A={}".format(c, a)+ " is{} ".format(soma7))
print("the sum between C={} and B={}".format(c, b)+ " is{} ".format(soma8))
print("the sum between C={} and D={}".format(c, d)+ " is{} ".format(soma9))

print("the sum between D={} and A={}".format(d, a)+ " is {}".format(soma10))
print("the sum between D={} and B={}".format(d, b)+ " is {}".format(soma11))
print("the sum between D={} and C={}".format(d, c)+ " is {}".format(soma12))

print("the multiplication between A={} and B={}".format(a, b)+ " is {}".format(multiplicacao1))
print("the multiplication between A={} and C={}".format(a, c)+ " is {}".format(multiplicacao2))
print("the multiplication between A={} and D={}".format(a, d)+ " is {}".format(multiplicacao3))

print("the multiplication between B={} and A={}".format(b, a)+ " is {}".format(multiplicacao4))
print("the multiplication between B={} and C={}".format(b, c)+ " is {}".format(multiplicacao5))
print("the multiplication between B={} and D={}".format(b, d)+ " is {}".format(multiplicacao6))

print("the multiplication between C={} and A={}".format(c, a)+ " is {}".format(multiplicacao7))
print("the multiplication between C={} and B={}".format(c, b)+ " is {}".format(multiplicacao8))
print("the multiplication between C={} and D={}".format(c, d)+ " is {}".format(multiplicacao9))

print("the multiplication between D={} and A={}".format(d, a)+ " is {}".format(multiplicacao10))
print("the multiplication between D={} and B={}".format(d, b)+ " is {}".format(multiplicacao11))
print("the multiplication between D={} and C={}".format(d, c)+ " is {}".format(multiplicacao12))





