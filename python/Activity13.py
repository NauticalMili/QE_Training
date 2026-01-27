def input_list():
    print("Enter a list of numbers. Enter 'stop' when you are done.")
    numbers =[]
    while(True):
        x = input()
        if (x.lower()=="stop"):
            break
        numbers.append(int(x))
    return numbers

def sum():
    numbers = input_list()
    sum = 0
    for number in numbers:
        sum+=number
    return sum