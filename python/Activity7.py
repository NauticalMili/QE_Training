print("Enter list of numebrs. Enter 'stop' when you are done.")
numbers =[]
while(True):
    x = input()
    if (x.lower()=="stop"):
        break
    numbers.append(int(x))

sum = 0
for number in numbers:
    sum+=number

print(f"Sum of List: {sum}")
