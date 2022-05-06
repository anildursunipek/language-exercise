/* POİNTERS(İsaretleyiciler)*/
/* 
-> RAM üzerinden adres gösterir
-> Scanf bir degiskenin icine değer atarken ampersand kullanılır. Değişkenin bulunduğu bellek alanına atama yapmamızı sağlar.
-> Değişkenin ram adresine değeri atar -> ampersand
-> Pointerlar * ile oluşturur
->Pointerlar değişkenlerin adresini tutar ve *pointerName şeklinde print edildiğinde adres içindeki değeri ekrana yazdırır.
*/

// Example
#include <stdio.h>
#include <stdlib.h>
int main(){
    int number = 5;
    int *adress; // Pointer
    adress = &number; // Sayının adresini tutar
    printf("%d\t%x\t%p\n",*adress,adress,adress);
    printf("%d\t%x\t%p\n\n",number,&number,&number);

    int numberArray[6] = {1,2,3,4,5,6};
    int *arrayAdress;
    arrayAdress = &numberArray;
    printf("Array Pointers\n");
    printf("%d\t%d\t%x\n",numberArray[0],*arrayAdress,arrayAdress);
    printf("%d\t%d\t%x\n",numberArray[1],*arrayAdress+1,arrayAdress + 1);
    printf("%d\t%d\t%x\n",numberArray[2],*arrayAdress+2,arrayAdress + 2);
    printf("%d\t%d\t%x\n",numberArray[3],*arrayAdress+3,arrayAdress + 3);
    printf("%d\t%d\t%x\n",numberArray[4],*arrayAdress+4,arrayAdress + 4);
    printf("%d\t%d\t%x\n",numberArray[5],*arrayAdress+5,arrayAdress + 5);

}