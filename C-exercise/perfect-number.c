#include<stdio.h>
int kontrolEt(int sayi);
int mukemmel_sayi_yazdir(int basla,int bitis);
int main(){
    int sayi1,sayi2;
    scanf("%d",&sayi1);
    scanf("%d",&sayi2);
    mukemmel_sayi_yazdir(sayi1,sayi2);
}
int mukemmel_sayi_yazdir(int basla,int bitis){
    int toplam_sayi = 0;
    int x = basla;
    for(x;x<bitis-1;x++){
        if(kontrolEt(x)==1){
            toplam_sayi +=1;
            printf("%d\n",x);
        }
    }
    printf("%d adet sayi vardir.",toplam_sayi);
}
int kontrolEt(int sayi){
    int toplam =0;
    for(int i=1;i<sayi-1;i++){
        if(sayi%i==0){
            toplam += i;
        }
    }
    if(toplam == sayi){
        return 1;
    }
    else{
        return 0;
    }
}