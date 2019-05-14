m = gets
n = gets
r = m.to_f/n.to_f

if r = 0:
    puts "the great commun diviser is"+ n.to_i 
    
else
    m = n
    n = r 
    return
end