puts "Saiba o quanto de gasolina foi gasto em uma viagem, Utilizando um automóvel que faz 12 quilometros por litro."
puts "Quanto tempo de viajem?"
tempo = gets
puts "qual é a velocidade média durante a viagem?" 
velocidade = gets
Distancia = (tempo.to_f) * (velocidade.to_f)
Litros_usados = Distancia.to_f/12
puts "A Distância percorrida foi de: "+ (Distancia.to_s)
puts "O total de gasolina gasto foi de: "+ (Litros_usados.to_s)    