from datetime import date

print("What is Your Name?")
name = input()
print("What is Your Age?")
age = int(input())
year = date.today().year + 100 - age

print(f"{name} is going to turn 100 in the year {year}")