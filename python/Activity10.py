print("Enter numbers separated by spaces:")
a = input().split()

tup = tuple(map(int, a))

for number in tup:
    if (number%5==0): 
        print(f"{number} ", end="")

