#include <stdio.h>

int main(){
    int a = 10, d;
    char b = 'c', e;
    float c = 15.14, f;
    FILE *filePtr;

    // write mode
    filePtr=fopen("out.txt","w");
    fprintf(filePtr,"%d %c %f",a,b,c);
    fclose(filePtr);
    
    // read mode
    filePtr = fopen("out.txt","r");
    fscanf(filePtr,"%d %c %f",&d,&e,&f);
    printf("%d %c %f\n",a,b,c);
    fclose(filePtr);
    printf("%d",d*d);

}