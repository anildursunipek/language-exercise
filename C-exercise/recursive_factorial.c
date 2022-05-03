#include<stdio.h>
int fact(int);
int main(){
    for(int x=1;x<=10;x++){
        printf("%3d!= %11d\n",x,fact(x));
    }    
}
int fact(x){
    if(x<=1){
        return 1;
    }
    else{
        return x * fact(x-1);
    } 
}