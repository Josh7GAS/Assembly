distancia = float(input("Diga a distancia do projetil"))
tempo = float(input("diga o tempo de locomocao"))

velocidade = (distancia*1000)/(tempo*60)

print("Projectile speed is {}".format(velocidade))