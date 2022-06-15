#include <stdio.h>
#include <string.h>

int main(){

    FILE *fptr;

    char c[] = "This is a test text file";
    char buffer[50];
    
    // Open file
    fptr = fopen("read_write.txt","w+");

    // write c string in read_write.txt file    
    fwrite(c, strlen(c) + 1, 1, fptr);

    // seek to the begining of the file
    fseek(fptr,0,SEEK_SET);

    // read text file 
    fread(buffer, strlen(c)+1, 1, fptr);
    printf("%s",buffer);

    //close file
    fclose(fptr);
    return 0;
}