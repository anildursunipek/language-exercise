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
    int i=0;
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
    /* Multidimension Arrays Pointer */
    char teams[3][20] = {"Barcelona","Liverpool","Arsenal"};
    for(int i=0;i<3;i++){
        printf("%s \n",teams[i]);
    }
    //Alternate
    char *teams2[] = {"Barcelona","Liverpool","Arsenal"};
    for(int i=0;i<3;i++){
        printf("%s \n",*(teams2+i));
    }
    // Example
    /*
    char country[5][10];
    for(i;i<5;i++){
        printf("Please enter the %d.country...\n",i+1);
        scanf(" %s",country[i]);
    }
    for(i=0;i<5;i++){
        printf("%d.%s \n",i+1,country[i]);
    }
    char *countryAdress[5];
    for(i=0;i<5;i++)
        countryAdress[i] = &country[i];
    for(i=0;i<5;i++){
        printf("%s -> Adress: %x || %x\n",*(countryAdress+i),(countryAdress+i),country[i]);
    }
    */
    // Example2
    /*
    int numbers[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
    int *adress2;
    adress = &numbers;
    for(i=0;i<9;i++){
        printf("%d %x\n",*(adress+i),adress+i);
    }
    */
    int x , y=0;
    int *a1,*a2 = &y;
    a1 = a2;
    printf("a1 -> %x   a2 -> %x \n",a1,a2);
    x = ++(*a2);
    *a2 = *a1 + x;
    printf("x-> %d y-> %d a1-> %d a2-> %d\n",x,y,*a1,*a2);
    
    // Functions with pointers
    int star = 10;
    starPrint(&star);
}
void starPrint(int *number){
    for(int i=1;i<=*number;i++){
        for(int x=1;x<=*number;x++){
            if(i == 1 || i == *number){
                printf("* ");
                if(x==*number){
                    printf("\n");
                }
            }
            else{
                if(x==1 || x == *number){
                    printf("* ");
                    if(x == *number){
                        printf("\n");
                    }
                }
                else{
                    printf("  ");
                }
            }
        }
    }
}
