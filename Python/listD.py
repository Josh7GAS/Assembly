#Create two lists and the second is the power from the first list values.

firstList = []
secondList = []
rangeList = 15

print("Give me 15 numbers to see there power")

for count in range(rangeList):
	firstList.append(input())
	secondList.append(pow(int(firstList[count]),2))

print("First List:" + str(firstList)+"\n Second List:" + str(secondList))