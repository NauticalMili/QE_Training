import pandas as pd

df = pd.read_csv('people.csv')


print(df.to_string())  
print(df['Usernames'])
print(df.iloc[1])
df = df.sort_values("Usernames")
print(df)
df = df.sort_values("Passwords")
print(df)