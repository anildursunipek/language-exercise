#Fonksiyon içinde fonksiyon çağırabiliriz
#Bu işlemde fonksiyon tanımlandıktan sonra çağırılmazsa işleme tabi tutulmaz
#ENCAPSULATİON = Karmaşık kodlarda işlerimizi kolaylaştırır.Dışarıda olan işlemler iç fonksiyonu etkilemez.
"""
def topla(sayi):
    if sayi > 5:
        return sayi + sayi
    else:
        def kare(sayi): #Burada kullanılan fonksiyon local'dir. Global olarak kullanılamaz
            return sayi*sayi
        return kare(sayi)
print(topla(3))
try:
    print(kare(5))
except NameError:
    print('kare fonksiyonu local bir fonksiyondur')
"""
"""
#Capsulation kullanarak faktoriyel yazımı. Recursive example
def faktoriyel(number):
    if not isinstance(number,int):#Number parametresinin sayı olup olmadığını kontrol eder
        raise TypeError('Number must be an integer')
    if not number >= 0:
        raise ValueError('Number must be zero or positive integer')

    def inner_faktoriyel(number):
        if number <= 1:
            return 1
        else:
            return number * inner_faktoriyel(number-1)
    return inner_faktoriyel(number)
print(faktoriyel(-5))
"""
#Fonksiyon içinde fonksiyon döndürme

def islem(islem_adi):
    def toplama(*args):
        toplam = 0
        for i in args:
            toplam += i
        return toplam
    def carpma(*args):
        carpim=1
        for i in args:
            carpim *= i
        return carpim
    if islem_adi == 'toplama':
        return toplama
    elif islem_adi == 'carpma':
        return carpma
    else:
        print('Yanlış işlem adını girdiniz')
deneme = islem('toplama')
print(deneme(5,2,4,4,4))
deneme2 = islem('carpma')
print(deneme2(4,4))