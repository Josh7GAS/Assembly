puts "Calculando o Volume de uma lata"
puts "Qual é o raio da lata?"
R = gets
puts "Qual é a Altura da lata?"
A = gets
v = 3.14159 * (R.to_f*R.to_f) * A.to_f
puts "O Volume da Lata é: "+ v.to_s