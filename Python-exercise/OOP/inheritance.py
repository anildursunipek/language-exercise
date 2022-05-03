# OOP

#İNHERİTANCE -- KALITIM = MİRAS ALMA

#Örnek olarak bir sınıf başka bir sınıftan miras alabilir
"""Örnek"""
# Her öğrenci bir insandır. Bu nedenle tüm insanlardaki fiziksel ihtiyaçlar öğrenciler içinde geçerlidir.
# Student class'ı person class'ının tüm özelliklerini içerdiği için miras alıp kullanabilir.

class Person():
    def __init__(self,fname,lname):
        self.fname = fname
        self.lname = lname
        print('Person Created')

    def who_am_i(self):
        print('I am a person')
# who_am_i fonksiyonunu ezmek istersek aynı isimle yeni metod oluşturmamız gerekir.(Override)
class Student(Person):
    def __init__(self,fname,lname):
        Person.__init__(self,fname,lname) # Eğer bu satır kullanılmasaydı person için init metodu miras alınamayıp student'ın init metodu kullanılacaktı
        print('Student Created')
    pass
p1 = Person('Dursun','İpek')
p2 = Student('Gamze','İpek')
print(p2.fname)
p2.who_am_i()
