#include<stdio.h>
#include<stdlib.h>
void main(){
    // ***** MALLOC *****
    int *pointer1 = malloc(10*sizeof(int)); // malloc() --> Memory Allocation --> 30 * 4 byte = 120 byte
    /* Turkish Explain
    -> Malloc bellek ayirma fonksiyonudur
    -> Belirtilen deger kadar byte ayırır
    -> Eger ayirilan bellekler doluysa onları silmez bunu yapan başka bir fonksiyon vardır -> Calloc -> Clear Allocation
    */

    // ***** CALLOC *****
    int *pointer2 = calloc(10,sizeof(int));

    for(int i=0;i<10;i++){
        printf("pointer1[%d]=%d\t\tpointer2[%d]=%d\n",i,pointer1[i],i,pointer2[i]);
    }

    // ***** REALLOC *****
    // Yeniden bellek ayirma , boyutlandırma
    pointer1 = realloc(pointer1,15*sizeof(int));
    for(int i=0;i<15;i++){
        printf("pointer1[%d]=%d\n",i,pointer1[i]);
    }    
    free(pointer1);
    free(pointer2);
    // Free komutu ayirilan bellekleri serbest birakmayi saglar
    // Char
    char *charArray = malloc(6*sizeof(char));
    charArray[0] = "D";
    charArray[1] = "u";
    charArray[2] = "r";
    charArray[3] = "s";
    charArray[4] = "u";
    charArray[5] = "n";
    for(int i = 0;i<6;i++){
        printf("%c\n",charArray[i]);
    }
    // Multidimension Character Array
    char** mArray = calloc(3,sizeof(char*));
    for(int i=0;i<3;i++){
        mArray = calloc(10,sizeof(char));
    }
    mArray[0] = "Dursun";
    mArray[1] = "Ipek";
    mArray[2] = "Student";
    for(int i=0;i<3;i++){
        printf("%s\n",mArray[i]);
    }
}