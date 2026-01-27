class Cars:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
    
    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")

carOne = Cars ("Toyota", "S9", 2019, "Auto", "Red")
carTwo = Cars ("Suzuki", "Swift", 2022, "Auto", "Blue")
carThree = Cars ("BMW", "SZV", 2024, "Manual", "Silver")

