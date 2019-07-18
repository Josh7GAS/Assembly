capacidade_carro = 12
tempo = float(input("How much time you spend in hours?"))
velocidade = float(input("What is the average speed?"))
distancia = tempo*velocidade
litros_usados = distancia/capacidade_carro

print("Your speed was {}, in {} hours on the trip, using {} Liters".format(velocidade, tempo, int(litros_usados)))
