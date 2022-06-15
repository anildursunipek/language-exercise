#include <stdio.h>

int main(){
    FILE *fptr;
    char ch;
    int counter = 0;
    fptr = fopen("story.txt","r");
    char buffer[100];

    // read story word by word and count vowel letter
    while(!feof(fptr)){
        ch = getc(fptr);
        if(ch == '\n'){
            printf("\n");
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            counter +=1;
        }
        printf("%c",ch);
    }
    printf("\n Total vowel letter = %d",counter);
    fclose(fptr);
    // Output = Total vowel letter = 2447
}