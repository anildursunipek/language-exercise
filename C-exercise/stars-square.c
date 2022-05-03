#include <stdio.h>
int main(){
    int sayi;
    printf("Kare yapmak istediginiz yildiz sayisini giriniz: \n");
    scanf("%d",&sayi);
    for(int x = 1;x < sayi+1; x++){
        for(int y = 1; y < sayi+1; y++){
            if(x==1 || x==sayi){
                printf("* ");
                if(y==sayi){
                    printf("\n");}}
            else if(y==1 || y==sayi){
                printf("* ");
                    if(y==sayi){
                        printf("\n");
                }
            }
            else{
                printf("  ");
            }
        }
    }
    return 0;
}