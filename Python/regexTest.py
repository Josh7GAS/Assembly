import regex
#pattern = regex.compile(r'(?x)((?<=\Kauid=)|(?<=\Kcomm="nom))[\S]+')
pattern = (r'(?x)((?<=\Kauid=)|(?<=\Kcomm="nom))[\S]+')
matchvalues = []
new_output = []
filename ="/home/joshua/Script/audit.log.1"
comm = 'comm="nom-http"'
i = 0

with open(filename) as audit:
    for line in audit:
        if pattern in line:
            print(line)

matchvalues_size = len(matchvalues)
#print(matchvalues)

while i < matchvalues_size:
    if matchvalues[i] == comm:
        new_output.append(matchvalues[i-1])
        new_output.append(matchvalues[i])
        i+=1
    else:
        i+=1
        continue
#print(new_output)
