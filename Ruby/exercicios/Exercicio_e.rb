puts "saiba a prestação de um bem em atraso"
puts "Qual é o valor inicial da primeira prestação?"
valor = gets
puts "Qual é a Taxa acordada?"
taxa = gets
puts "Em quantos meses será pago?"
tempo = gets
prestação = valor.to_f + (valor.to_f*(taxa.to_f/100)*tempo.to_f)
puts "Sua prestação é " + (prestação.to_s)
