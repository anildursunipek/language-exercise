#include<stdio.h>
void static_array(void);
int main(){
    static_array();
    static_array();
    static_array();
}

void static_array(void){
    static int a[5]={0};
    for(int i=0;i<5;i++){
        a[i] += 5;
    }
    for(int x=0;x<5;x++){
        printf("a[%d]= %d\n",x,a[x]);
    }
}
