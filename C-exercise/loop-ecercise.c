#include <stdio.h>
int main(){
    float ortalama;
    int toplam,sayici,not;

    toplam = 0;
    sayici = 0;
    printf("Eklemek istediginiz notu giriniz(Cikmak icin -1 giriniz):");
    scanf("%d",&not);

    while (not != -1){
        toplam += not;
        sayici += 1;
        printf("Eklemek istediginiz notu giriniz(Cikmak icin -1 giriniz):");
        scanf("%d",&not);
    }

    if(sayici != 0){
    ortalama = (float) toplam/sayici;  
    printf("Not ortalamasi= %.2f Not sayisi= %d",ortalama,sayici);}
    else{
        printf("Not girilmemistir...");
    }
    return 0;
}