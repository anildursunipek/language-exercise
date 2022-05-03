#include <stdio.h>
#include <stdlib.h>
#include <string.h> // String methods library

int main(){
    char name[] = "Dursun Ipek";
    printf("Name lenght = %d\n",strlen(name)); // Lenght function
    //Example
    /*
    int name2[20];
    printf("Please enter name...\n");
    scanf("%s",name2);
    int lenght = strlen(name2);
    printf(" \"%s\" lenght = %d",name2,lenght);
    */
    gets(name); // also takes spaces between characters
    printf("%s\n",name); 
    // String Reversing
    int len = strlen(name);
    for(int i=len;i>=0;i--)
        printf("%c",name[i]);

    



    return 0;
}