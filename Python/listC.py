#create 3 list with the same size and the values
# of the third should be the values of the first index should be less than the second

firstList = []
secondList = []
thirdList = []
listRange = 2

print("Give me 20 numbers")

for count in range(listRange):
	print("Give me a number ")
	firstList.append(input())
	secondList.append(int(firstList[count])*2)

	thirdList.append(int(firstList[count])-int(secondList[count]))

print("The First List is: \n" + str(firstList) + "\n The Second List is:\n"
 + str(secondList) + "\n The thirdh List is:\n" + str(thirdList) )
