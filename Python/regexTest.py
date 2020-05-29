import re
pattern = re.compile("(?x)(((?<=\Kauid=))|((?<=\Kcomm=\"nom)))[\S]+")
matchvalues = []
new_output = []

for i,line in enumerate(open('audit.log.1')):
    for match in re.finditer(pattern, line):
        matchvalues.append(match)
        
while i <= len(matchvalues):
    if matchvalues[i] == 'comm="nom-http"':
        new_output.append(matchvalues[i-1], matchvalues[i])
        i+=1
    for aux in new_output:
        print(aux)

