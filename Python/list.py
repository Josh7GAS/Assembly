#Give me 10 names to add and print

names = []
print("Give me 10 names to add and show on my list")

for count in range(10):
	print("Give me the " + str(count + 1) + "th name")
	names.append(input())

print(names)
