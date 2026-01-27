def fibonacci(n):
    if (n <= 0):
        return
    dp = [0] * n
    dp[0] = 0

    if(n>1):
        dp[1] = 1

    for i in range (2, n):
        dp[i] = dp[i-1] + dp[i-2]
    
    print(*dp)

print("Enter number of fibonacci numbers to generate.")
n = int(input())
fibonacci(n)