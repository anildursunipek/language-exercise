#def square(num):
#    return num ** 2
numbers = [1,2,3,4,5,6]
""" MAP """
#1.yöntem fonskiyon oluşturup kullanmak
#result = list(map(square,numbers))
#2.yöntem lambda metodu ile isimsiz bir fonksiyon kullanmak
#lambda fonskiyonparametresi : yapılacakişlem
#result = list(map(lambda num: num *2,numbers))
""" FİLTER """
#result = list(filter(lambda num: num%3==0,numbers))


"""hatırlatma"""
result = list(map(lambda num: num*3,numbers))
print(result)
