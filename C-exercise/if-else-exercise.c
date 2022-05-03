#include<stdio.h>
#include<math.h>

int main(){
    int a,b,c,k1,k2,dis;
    double k3,k4;
    printf("Denklemdeki a, b ve c degerlerini giriniz: ");
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);

    dis = (b*b) - (4*a*c);
    printf("Delta= %d\n",dis);
    if(dis>0){
        k3 = (-b - sqrt(dis))/ (2*a);
        k4 = (-b + sqrt(dis))/ (2*a);
        printf("Iki kok vardir. Kok1 = %lf Kok2 = %lf",k3,k4);
    }
    else if(dis == 0){
        dis = -b / 2*a;
        printf("Tek kok vardir. Kok = %d",dis);
    }
    else{
        printf("Kok yoktur.");
    }



}