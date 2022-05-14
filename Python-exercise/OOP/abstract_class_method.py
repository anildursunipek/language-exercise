from abc import ABC,abstractmethod

class Polygon(ABC):

    @abstractmethod
    def numberOfSides(self):
        pass

    def __area(self):
        pass

class Triangle(Polygon):
    def __init__(self,side):
        self.side = side

    def numberOfSides(self):
        print("I have 3 side")

class Rectangle(Polygon):
    def __init__(self, side):
        self.side = side

    def numberOfSides(self):
        print("I have 4 side")

    def area(self):
        print(f"Area: {self.side * self.side}")

# p1 = Polygon() Error -> Can't instantiate abstract class Polygon with abstract method numberOfSides
t1 = Triangle(5)
t1.numberOfSides()

r1 = Rectangle(10)
print(r1.side)
r1.area()