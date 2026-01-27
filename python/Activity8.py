print("Enter list of numebrs. Enter 'stop' when you are done.")
numbers =[]
while(True):
    x = input()
    if (x.lower()=="stop"):
        break
    numbers.append(int(x))

if (numbers[0] == numbers[len(numbers)-1]):
    print(True)
else:
    print(False)