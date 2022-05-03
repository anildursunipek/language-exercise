#include <stdio.h>
#include <stdlib.h>
#include <string.h> // String methods library

int main(){
    // ***** STRLEN ****
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
    //gets(name); // also takes spaces between characters
    printf("%s\n",name); 
    // String Reversing
    int len = strlen(name);
    for(int i=len-1;i>=0;i--){
        printf("%c",name[i]);
    }

    // ***** STRCOPY & STRNCOPY *****
    char countrys[20] = "Turkey England USA";
    char countrys2[20];
    char countrys3[15];
    strcpy(countrys2,countrys);
    printf("\nCopy function = %s\n",countrys2);
    strncpy(countrys3,countrys,14);
    printf("%sXXXXX\n",countrys3);

    // ***** STRCAT ***** -> concating two strings
    char newUserName[20] = "Dursun";
    char newUserJob[20] = "CE";
    char user[30] = "";
    //scanf("%s%s",newUserName,newUserJob);
    strcat(user,newUserName);
    strcat(user," ");
    strcat(user,newUserJob);
    printf("User Name And Job = \"%s\"\n",user);
    

    // ***** STRCMP ***** -> String Compare
    char fruit1[] = "Apple";
    char fruit2[] = "Banana";
    if(strcmp(fruit1,fruit2) == 0){
        printf("%s euqal %s\n",fruit1,fruit2);
    }
    else if(strcmp(fruit1,fruit2) < 0){
        printf("%s smaller than %s\n",fruit1,fruit2);
    }
    else{
        printf("%s bigger than %s\n",fruit1,fruit2);
    }
    /* Example
    char userName[] = "Dursun";
    char userInput[20];
    scanf("%s",userInput);
    if(strcmp(userName,userInput) == 0){
        printf("Login successful");
    }
    else{
        printf("Username is not valid");
    }
    */
    // ***** STRREV ****** -> String reversing
    char job[30] = "Computer Engineer";
    strrev(job);
    printf("%s\n",job);
    // ***** STRLWR & STRUPR ****** -> String lower & String upper
    strlwr(job);
    printf("%s\n",job);
    strupr(job);
    printf("%s\n",job);
    return 0;
}