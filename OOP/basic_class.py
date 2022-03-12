#class

class Person:
    adress = 'Bağlarbaşı'
    # attributes = öznitelikler
    # class attributes

    # constructor ( yapıcı metod )
    # init her bir obje için çalıştırır
    # objelere mutlaka eklenmesi gerek özellikleri init metodu ile yazıyoruz
    def __init__(self,name,year): #obje üzerine bir değer aktarmak istediğimizde self parametresini kullanırız
        self.name = name
        self.year = year
        # obcejt attributes
    # instance methods
    def intro(self):
        print("Hello There. I'am " + self.name)
    def calculateAge(self):
        return 2021 - self.year

    #pass burada yer tutucudur. Boş kalsaydı hata alırdık.



#object(instance)

p1 = Person('Dursun',1999)
p2 = Person('Gamze',1996)

#Updating
p2.adress = 'Ankara'
p2.name = 'Hatice'

print(p1.name)
print(p2.name)
print(p1.adress)
print(p2.adress)
print(type(p1))
print(type(p2))

p1.intro()
print(f'Adım {p1.name} yaşım {p1.calculateAge()}')

class circle:

    pi = 3.14 #Örnek olarak pi tüm nesneler için ortak ve sabit bir değer olacağı için class attribute olarak kullanılmıştır.
    #Diğer türlü init metodu içerisinde sürekli yazılması gereken bir parametre haline gelecekti

    def __init__(self, yaricap = 1):
        self.yaricap = yaricap

    def alanHesapla(self):
        return self.yaricap * self.yaricap * self.pi

    def cevreHesapla(self):
        return 2 * self.yaricap * self.pi


daire = circle(5)

print(daire.cevreHesapla())
print(daire.alanHesapla())
