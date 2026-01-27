def recursive_adder(x):
    if (x<=1):
        return x
    
    return x + recursive_adder(x-1)

n = 10
print(recursive_adder(10))