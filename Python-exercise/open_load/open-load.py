# DOSYA AÇMA FONKSİYONU
# OPEN()
""" open w modu
file = open("newfile.txt","w")#İlgili konumda newfile.txt uzantılı bir dosya oluşturur. Write anlamındadır.
#Parametre olarak ("dosyaadı.uzantı",dosyayı açma modu)
file.close() #Dosyanın kaynak harcamaması için kapatmamız gerekmektedir.
file = open("")
'w' : Write yazma modu
-- Dosyayı belirtilen konumda oluşturur
-- Dosyanın içeriğini siler ve yeniden oluşturur

file = open("newfile.txt","w",encoding="UTF-8")
file.write("Dursun İpek")
file.close()
"""
"""
'a' : Append metodu
-- Dosya o dizinde varsa sonuna ekleme yapar
-- Dosyayı yoksa yeni dosya oluşturur
-- file.write() metodunun başına \n koyulursa yeni satırdan başlar ; sonuna koyulursa alta boş bir satır açar 

file = open("newfile.txt","a",encoding="UTF-8")
file.write('\nAppend metodu deneme')
file.close()
"""
"""
'x' = (Create) oluşturma. Dosya zaten varsa hata verir.
-- Belirtilen dizindde dosya oluşturur
-- Dosya zaten varsa hata verecektir
"""
"""
'r' : (read) okuma. Dosya belirtilen konumdaysa okuma yapar
-- Open fonksiyonunun default parametresi read'dir
-- Eğer dosya o dizinde yoksa hata verecektir
"""
"""
file = open("newfile.txt","r",encoding='utf-8')
#for döngüsü ile
for i in file:
    print(i,end="")
#Dosya içindeki tüm satırları döngüye alarak tek tek yazdırıldı
file.close()
"""
"""
#read() metodu dosya içerğini okur
file = open("newfile.txt","r",encoding='utf-8')
content = file.read()#file içeriği okunarak content değişkenin içine atandı daha sonra print metodu ile yazdırıldı
print('içerik 1')
print(content)
file.close()
file = open("newfile.txt","r",encoding='utf-8')
content2 = file.read()
print('içerik 2')
print(content2)
file.close()
"""
"""
NOT=File read metodundan sonra courser dosyanın en altında olduğu için okuma işlemine 2.kez alttan başlar
Bunu düzeltmek için tekrar okuma işlemi yapmamız gerekiyor. 2.kez open komutu ile file read metodu kullanılıyor ve
içerik okunabiliyor
2.NOT = file.read() metodu içerğinie parametre olarak bir int değeri girersek belirtilen sayıda karakter okur 
print edersek belirttiğimiz sayıda karakteri ekrana yazdırır.

file = open("newfile.txt","r",encoding='utf-8')
content= file.read(15)
print(content)
file.close()
"""
#     readline() fonksiyonu
"""
her bir çalıştırma da tek bir satır okur
Courser kaldığı yerden devam edeceği için eğer file tekrardan read metodu ile çalıştırılmazsa kaldığı yerden devam eder
"""
#Örnek denemee
"""
file = open("newfile.txt","r",encoding='utf-8')
print(file.readline(),end="")
print(file.readline(),end="")
print(file.readline(),end="")
print(file.readline(),end="")
print(file.readline(),end="")
file = open("newfile.txt","r",encoding='utf-8')
print(file.readline(),end="")
print(file.readline(),end="")
print(file.readline(),end="")
print(file.readline(),end="")
print(file.readline(),end="")
file.close()
"""
# readlines() fonksiyonu
# readline'dan tek farkı satıları alt alta tek tek yazdırmak yerine tek seferde tüm satırları dizi içine alır
"""
# BURADA YAPILAN İŞLEMLER RUTİN DOSYA OKUMA İŞLEMİDİR
# file.close() için farklı yöntemler de bulunmaktadır.
# with ---------- as ---: komut bloğunu kullanarak işlemler bitene kadar çalışan ve kendini kapatan bir komut bloğu yazabiliriz.
file = open('newfile.txt','r',encoding='utf-8')
content = file.read()
print(content)

file.close()
"""
"""
******** 2.YÖNTEM *******
with open('newfile.txt','r',encoding='utf-8') as file:
    content = file.read()
    print(content)
"""
"""
# file.tell() metodu
# dosyada courser'ın nerede olduğunu söyler
with open('newfile.txt','r',encoding='utf-8') as file:
    content = file.read()
    print(content)
    print(file.tell())
"""
"""
file.seek() metodu courser'ı istediğimiz yere gönderir
İçeriğine yazdığımız paramtere gidecek yeri belirler
"""
# ********** DOSYA İÇERİSİNDE GÜNCELLEME İŞLEMİ YAPMA
"""
SAYFA BAŞINDA GÜNCELLEME
with open('newfile.txt','r+',encoding='utf-8') as file: # r+ hem okuma hem de yazma modunu temsil eder
    file.write('Güncelleme')
    file.write('Dursun İpek')
"""
"""
SAYFA SONUNDA GÜNCELLEME
with open('newfile.txt','a',encoding='utf-8') as file:
    file.write('Sona ekleme')
"""
"""
SAYFA ORTASINDA GÜNCELLEME
"""

with open('newfile.txt','r+',encoding='utf-8') as file: # r+ hem okuma hem de yazma modunu temsil eder
    liste = file.readlines()
    liste.insert(3,'Gamze İpek')
    file.seek(0)
    print(liste)
    file.writelines(liste)
