def input_list():
    print("Enter a list of numebrs. Enter 'stop' when you are done.")
    numbers =[]
    while(True):
        x = input()
        if (x.lower()=="stop"):
            break
        numbers.append(int(x))
    return numbers

print("Enter the first list")
list_one = input_list()

print("Enter the second list")
list_two = input_list()

final_list = []

for number in list_one:
    if (number%2 == 1):
        final_list.append(number)

for number in list_two:
    if (number%2 == 0):
        final_list.append(number)

print (final_list)