#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>


void main(void){

    /*
    char string[20];
    puts("Enter the string(max 10 char\n");
    scanf("%10s",string);
    printf("%s",string);*/
    
    
    // isdigit
    printf("%s\n%s%s\n\n","isdigit function result",isdigit('n') ? "n is a" : "n is not a"," digit");
    printf("%s\n%s%s\n\n","isdigit function result",isdigit('8') ? "8 is a" : "8 is not a"," digit");

    //isalpha
    printf("%s\n%s\n%s\n\n","isalpha function result",isalpha('A') ? "A is a letter" : "A is not a letter",isalpha('5') ? "5 is a letter" : "5 is not a letter");

    //isalnum
    printf("%s\n%s%s\n%s%s\n\n","isalnum function result",isalnum('B') ? "B is a " : "B is not a ","letter or digit",isalpha('+') ? "+ is a " : "+ is not a ", "letter or digit");

    // toupper and tolower

    char *string = "uppercase";
    char *string2 = "LOWERCASE";
    
    for(;*string !='\0';string++){
        printf("%c",toupper(*string));
    }
    printf("\n");
    for(;*string2 !='\0';string2++){
        printf("%c",tolower(*string2));
    }
}