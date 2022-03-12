#For döngüsü uygulamaları
sayılar = [1,3,5,7,9,12,19,21]
t = 0
#Uygulama 1 - 3 ün katı olanlar
"""
for sayı in sayılar:
    if sayı % 3 == 0:
        print(f"{sayı} 3'ün katıdır.")
"""
#Uygulama 2 - Toplamı
"""
for sayı in sayılar:
    t = t + sayı
print(t)
"""
#Uygulama 3 - Teklerin karesi
"""
for sayı in sayılar:
    if (sayı % 2 == 1):
        print(sayı**2)
"""
#Uygulama 4 - Şehirlerden en fazla 5 karakterli olanlar
"""
sehirler = ['kocaeli','istanbuk','ankara','izmir','rize']
for sehir in sehirler:
    if len(sehir) <= 5:
        print(sehir)
"""
#Uygulama 5 - For ile Object list example
"""
urunler = [
    {'name':'samsung S6', 'price': '3000'},
    {'name':'samsung S7', 'price': '4000'},
    {'name':'samsung S8', 'price': '5000'},
    {'name':'samsung S9', 'price': '6000'},
    {'name':'samsung S10', 'price': '7000'}
]
print(urunler)
toplam = 0
for urun in urunler:
    toplam = toplam + int(urun['price'])
print(toplam)
for urun in urunler:
    if int(urun['price']) <= 5000:
        print(urun['price'])
"""
#While DÖngüsü
"""
i = 0
while i < len(sayılar):
    print(sayılar[i])
    i += 1
"""
#Uygulama 1
"""
baslangıc = int(input("Bas. Değeri: "))
bitis = int(input("Bitis değeri: "))
i = baslangıc
while i < bitis:
    if i % 2 == 1:
        print(i)
    i += 1
"""
#Uygulama 2 - Liste oluşturma ve sıralama
"""numbers = []
i = 0
while i < 5:
    numbers.append(input("Sayı giriniz: "))
    i += 1
print(numbers)
"""
"""
numbers = []
i = 0
while i < 5:
    numbers.insert(i,input("Sayı giriniz: "))
    i += 1
numbers.sort()
print(numbers)
"""
#Uygulama 3
"""
urunler=[]
adet = int(input("Kaç adet ürün eklemek istersiniz: "))
i = 0
while i < adet :
    name = input("Ürün adı giriniz: ")
    price = input("Ürün fiyatı giriniz: ")
    urunler.append({
        'name': name,
        'price': price
    })
    i += 1
print(urunler)
"""
#Zip metod
list1 = [1,2,3,4,5]
list2 = ["a","b","c","d","e"]
for item in zip(list1,list2):
    print(item)