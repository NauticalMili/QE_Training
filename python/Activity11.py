fruits = {
    "apple": 120,
    "banana": 40,
    "orange": 60,
    "mango": 150,
    "grapes": 80,
    "kiwi": 200
}

fruit = input("Enter fruit name: ").lower()

if fruit in fruits:
    print(f"{fruit.capitalize()} is available.")
    print(f"Price: ₹{fruits[fruit]} per kg")
else:
    print(f"{fruit.capitalize()} is not available.")
