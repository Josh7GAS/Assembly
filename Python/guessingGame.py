#This is a guess the number game
import random

print('Hello. What is your name?')
name = input()
secretNumber = random.randint(1, 20)
print('Well ' + name + ' lets play a guessing game, guess the secret number betwen 1 and 20')
guessNumber = int(input())

while secretNumber != guessNumber:
	if guessNumber < 1 or guessNumber > 20:
		print("the number has to be between 1 and 20. Give me a new number")
		guessNumber = int(input())
	elif secretNumber < guessNumber:
		print("Number is lower, give me a new number")
		guessNumber = int(input())
	elif secretNumber > guessNumber:
		print("Number is bigger, give me a new number")
		guessNumber = int(input())
else:
	print("!!!!Congratulations you won, the secret number is: "+ str(secretNumber) + "!!!!")
