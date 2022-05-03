"""
def yazdir(kelime, tekrar):
    for i in range(tekrar):
        print(kelime)
yazdir("Dursun",15)
"""
"""
def liste(*args):
    liste = []
    for arg in args:
        liste.append(arg)
    return liste
result = liste(1,2,45,5,6,6)
print(result)
"""
"""

def asal(sayı1, sayı2):
    for sayi in range(sayı1, sayı2+1):
        if (sayi > 1):
            for i in range(2,sayi):
                if(sayi % i == 0):
                    break
            else:
                print(sayi)

sayı1 = int(input("1. sayıyı giriniz: "))
sayı2 = int(input("2. sayıyı giriniz: "))
result = asal(sayı1,sayı2)
print(result)
"""
def tamBolen(sayı):
    list = []
    for i in range(sayı + 1):
        if i > 0:
            if (sayı % i == 0):
                list.append(i)
    return list
a = int(input("Bir sayı giriniz"))

result = tamBolen(a)
print(result)

