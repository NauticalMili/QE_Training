print("Enter number")
x = int(input())
"""
for i in range(1, x+1):
    for j in range(1, i+1):
        print(i, end="")
    print()
"""
for i in range(x+1):
    print(str(i) * i)
    