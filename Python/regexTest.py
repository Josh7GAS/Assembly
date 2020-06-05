import regex
pattern = regex.compile('(?x)((?<=\Kauid=)|(?<=\Kcomm="nom))[\S]+')
matchvalues = []
new_output = []
comm = 'comm="nom-http"'
i = 1

with open('/home/joshua/Script/audit.log.1', 'r') as file:
    for line in file:
        for word in line.split():
            matchvalues.append(word)

            
matchvalues_size = len(matchvalues)

while i < matchvalues_size:
    if matchvalues[i] == comm:
        new_output.append(matchvalues[i-1])
        i+=1
        new_output.append(matchvalues[i])
        i+=1
    else:
        i+=1
        continue

print(matchvalues_size)
print(i)
