
num = int(input("Enter the Number : "))
isPrime = True 


if num <= 1:
    isPrime = False   
else:
    for i in range(2, num ** (0.5) + 1):
        if (num % i == 0):
            isPrime = False
            break


if (isPrime):
    print(f"{num} is Not Prime")
else:
    print(f"{num} is Prime")