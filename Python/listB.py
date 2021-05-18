#create two lists of the same size, but the second list is the values from the first times 3

listSize = 8
listOne = []
listTwo = []

print("give to me 8 numbers to make them times 3")

for count in range(listSize):
	print("Number "+str(count + 1))
	listOne.append(input())
	listTwo.append(int(listOne[count]) * 3)

print("This is list 1"+ str(listOne)+ "This is list 2 "+ str(listTwo))
