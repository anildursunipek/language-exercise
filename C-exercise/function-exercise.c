#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
float tabanAlan(float yariCap);
float hacim(float yariCap,float h);
float yanalAlan(float yariCap,float dogru);
float pi = 3.14;
void main(){
    float tabanYariCap,yuseklik,anaDogru;
    printf("Taban Yari Capi, yüksekligi ve ana dogruyu giriniz.(Sirayla)");
    scanf("%f",&tabanYariCap);
    scanf("%f",&yuseklik);
    scanf("%f",&anaDogru);
    printf("%f %f %f",tabanYariCap,yuseklik,anaDogru);
    printf("Taba Alanı = %f",tabanAlan(tabanYariCap));
    printf("Hacim = %f",hacim(tabanYariCap,yuseklik));
    printf("Yanal Alanı = %f",yanalAlan(tabanYariCap,anaDogru));
}
float tabanAlan(float yariCap){
    float alan;
    alan = pi * yariCap * yariCap;
    return alan;
}
float hacim(float yariCap,float h){
    return (pi * yariCap * yariCap * h)/3;
}
float yanalAlan(float yariCap,float dogru){
    return pi * yariCap * dogru;
}