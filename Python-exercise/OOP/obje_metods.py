class Movie():
    def __init__(self,title,director,duration):
        self.title = title
        self.director = director
        self.duration = duration
        print('Film oluşturuldu.')
    # İnit metodu obje her çalıştırıldığında çalışır ancak print edince init çalışmaz __str__ metodu çalışır

    def __str__(self):
        return F"{self.title} by {self.director}"
    #Len metodu normalde çalışmaz eklendikten sonra film süresini belirtmek için fonksiyon tanımladım
    def __len__(self):
        return self.duration

    def __del__(self):
        print('Film silindi ' + self.title)
    #Obje silindikten sonra bu metod çalıştırılır ve ekrana yazdırılır.


m = Movie('Avangers','Dursun',120)
print(m)
print(len(m))
del m