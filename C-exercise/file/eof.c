#include <stdio.h>

void main(){
    FILE *fptr;
    char ch;
    // creating new text file
    fptr = fopen("eof.txt","w");
    fputs("This is end of file text",fptr);
    fclose(fptr);

    //reading text file char by char
    fptr = fopen("eof.txt","r");
    while(!feof(fptr)){
        ch = getc(fptr);
        printf("%c\n",ch);
    }
    fclose(fptr);
}