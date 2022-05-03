#include<stdio.h>
#include<stdlib.h>
int main(){
    int bir=0,iki=0,uc=0,dort=0,bes=0,alti=0;
    int x;
    srand(time(NULL));
    for(int i=1;i<=6000;i++){
        x = (rand()%6)+1;
        printf("%5d",x);
        if(x==1){
            bir++;
        }
        else if(x==2){
            iki++;
        }
        else if(x==3){
            uc++;
        }
        else if(x==4){
            dort++;
        }
        else if(x==5){
            bes++;
        }
        else if(x==6){
            alti++;
        }
    }
    printf("\nBir=%d Iki=%d Uc=%d Dort=%d Best=%d Alti=%d",bir,iki,uc,dort,bes,alti);
}