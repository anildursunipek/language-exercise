#İterator kullanımı
#Biz bu işlemi aslında for bloğu ile istemeden de olsa yapıyoruz
#Bir listeyi for döngüsü ile çalıştırdığımızda iter() ve next metodları kullanılarak tek tek çalıştırılıyor
#ÖRNEK
"""
liste = [1,2,3,4,5,6,7,8]
for i in liste:
    print(i)
"""
#İTERATOR ÖRNEĞİ
"""
liste = [1,2,3,4,5,6,7,8]
iterator = iter(liste)#burada liste gibi iterable bir parametre girilmelidir.Aksi halde hata verir
while True:
    try:
        print(next(iterator))#next metodu tek tek çalışır her çalışmada bir sonraki eleman yazdırılır
    except StopIteration:
        break
#for döngüsünün arka planda çalışma şekli budur.
"""
"""
NOT= İterators kullanım amacı class içinde iterable olan bir obje yaratmak istediğimizde ya da kendimiz bir liste oluşturmak 
istediğimizde kullanmaktır.
"""
#GENERATORS ÖRNEĞİ
def kupAl():
    for i in range(5):
        yield i**3
'''
Return ile Yield farkı
-- Return ifadesi bir fonksiyonu sonlandırırken yield ifadesi değeri döndürür ve fonksiyonu çağırmaya devam eder
-- yield ifadesi ile değer döndüğü  zaman __iter__ ile __next__ metodları uygulanabilir olur
-- Değerler bittiğinde StopIteration hatası verir
-- Yield bellek üzerinde yer tutmaz. Return bellek üzerinde yer tutar
-- Generator bellek dostu olup bir seferde sadece bir öğe ürettiği için tercih edilir.
-- Bellek dostu olduğu için listeyi saklamamız gerekmediğinde tek seferlik kullanım olduğunda işimize yarar
'''
print(kupAl())
generator = kupAl()
iterators = iter(generator)
while True:
    try:
        print(iterators.__next__())
    except StopIteration:
        break







