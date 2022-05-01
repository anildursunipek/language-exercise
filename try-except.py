#Errors
#Errors handling --> Hata aykılama
""" EXCEPTİON = İstisna,kuraldışılık,sıra dışı durum"""
#NameError
#ValueError
#ZroDivisionError
#SyntaxError
"""
try:#Hata alabileceğimiz kodu try altında yazıyoruz
    x = int(input('x: '))
    y = int(input('y: '))
    print(x/y)
except ZeroDivisionError:#Hataların adını except hata: şeklinde print ederek uyarı veriyoruz
    print('Y için 0 girilemez')
except ValueError:
    print('X ve Y için sayısal değer girilmeli')
except Exception:
    #Base error class
    #bu klass yazılırsa tüm hatalarda aynı mesaj yazdırılabilir.
    print('Yanlış bilgi girdiniz')
"""
"""
#KENDİMİZ DE BİR EXCEPTİON OLUŞTURABİLİRİZ

def check_password(psw):
    import re
    if len(psw) < 8:
        raise Exception("Parola en az 8 karakter olmalıdır")
    elif not re.search("[A-Z]",psw):
        raise Exception("Parola büyük harf içermelidir.")
    elif not re.search("[a-z]",psw):
        raise Exception("Parola küçük harf içermelidir.")
    elif not re.search("[0-9]",psw):
        raise Exception("Parola bir rakam içermelidir")

check_password('Abcabcsdfsdf')

"""
""" UYGULAMA 1"""
"""
liste = ["1","2","5a","10b","abc","10","50"]
for i in liste:
    try:
        result = int(i)
        print(result)
    except ValueError:
        continue

while True:
    sayi = input('Lütfen bir sayı giriniz: ')
    if sayi == 'q':
        break
    try:
        result = int(sayi)
        print(f"Girmiş olduğunuz sayı : {sayi}")
    except ValueError:
        print('Geçersiz sayı')
        continue
"""
"""  UYGULAMA 2   """
"""
turkce_characters = 'şçğüöıİ'
parola = input('Parola: ')

for x in parola:
    for y in turkce_characters:
        if x==y:
            raise Exception('Parolanızda türkçe karakter bulunmaktadır')
            break
        else:
            pass
"""

"""  UYGULAMA 3  """

def fact(x):
    x = int(x)
    if x < 0:
        raise ValueError('Negatif sayı girilemez')
    elif x == 0:
        return 1

    result = 1

    for i in range(1,x+1):
        result *= i
    return result
print(fact(5))






