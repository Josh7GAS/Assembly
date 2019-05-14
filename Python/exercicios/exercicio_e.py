valor = float(input("What is payment?"))
tax = float(input("What is the tax?"))
time = float(input("In how much time the payment will end?"))

payment = valor+(valor*(tax/100)*time)

print("The moth payment is {}".format(payment))

