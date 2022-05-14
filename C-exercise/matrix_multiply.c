#include<stdio.h>
#include<stdlib.h>

void main(){
    int matrix1[3][3], matrix2[3][3];
    int result[3][3] = {0};
    printf("1. Matrix'i giriniz\n");
    for(int i=0;i<3;i++){
        for(int y=0;y<3;y++){
            scanf("%d",&matrix1[i][y]);
            printf("matrix[%d][%d]= %d\n",i,y,matrix1[i][y]);
        }
    }
    printf("2. Matrix'i giriniz\n");
    for(int i=0;i<3;i++){
        for(int y=0;y<3;y++){
            scanf("%d",&matrix2[i][y]);
            printf("matrix[%d][%d]= %d\n",i,y,matrix2[i][y]);
        }
    }
    printf("----- 1. Matrix -----\n");
    for(int i=0;i<3;i++){
        for(int y=0;y<3;y++){
            printf("matrix1[%d][%d]= %d\n",i,y,matrix1[i][y]);
        }
    }   
    printf("----- 2. Matrix -----\n");
    for(int i=0;i<3;i++){
        for(int y=0;y<3;y++){
            printf("matrix2[%d][%d]= %d\n",i,y,matrix2[i][y]);
        }
    }   
    //Multiply
    for(int i=0;i<3;i++){
        for(int y=0;y<3;y++){
            for(int x=0;x<3;x++){
                result[i][y] += matrix1[i][x] * matrix2[x][y];
            }
        }
    }     
    printf("----- Result Matrix -----\n");
    for(int i=0;i<3;i++){
        for(int y=0;y<3;y++){
            printf("result[%d][%d]= %d\n",i,y,result[i][y]);
        }
    }   






}