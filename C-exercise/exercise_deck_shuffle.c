#include <stdio.h>
#include <stdlib.h>
#include <time.h>

//defines
#define SUITS 4
#define FACES 13
#define CARDS 52

//prototypes
void shuffle(unsigned int wDeck[][FACES]);
void deal(unsigned int wDeck[][FACES], const char *wFace[], const char *wSuit[]);

void main(void){
    const char *suit[SUITS] = {"Hearts","Diamonds","Clubs","Spades"};
    const char *face[FACES] = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};

    unsigned int deck[SUITS][FACES] = {0};

    srand(time(NULL));

    shuffle(deck);

    // show deck
    puts("DECK ( AFTER SHUFFLE)");
    for(int i=0;i<SUITS;i++){
        printf("SUIT %d\n",i+1);
        for(int x=0;x<FACES;x++){
            printf("%5d",deck[i][x]);
        }
        printf("\n");
    }
    // check array frequency
    int checkArray[CARDS+1] = {0};
    for(int y = 1;y<CARDS+1;y++){   
        for(int i=0;i<SUITS;i++){
            for(int x=0;x<FACES;x++){
                if(deck[i][x] == y){
                    checkArray[y]++;
                }
            }
        }
    }
    /*
    puts("Printing checkArray");
    for(int i = 1;i<CARDS+1;i++){
        printf("%5d ",checkArray[i]);
        if(i==13 || i==26 || i==39){
            printf("\n");
        }
    }
    */
    deal(deck,face,suit);

}

void shuffle(unsigned int wDeck[][FACES]){
    size_t row;
    size_t column;
    size_t card;

    for(card=1 ; card <= CARDS ; ++card){
        do{
            row = rand() % SUITS;
            column = rand() % FACES;
        }
        while(wDeck[row][column] != 0);
        wDeck[row][column] = card;
    }
    
}
void deal(unsigned int wDeck[][FACES], const char *wFace[], const char *wSuit[]){
    size_t row;
    size_t column;
    size_t card;

    for(card = 1;card<=CARDS;card++){   
        for(row=0;row<SUITS;row++){
            for(column =0;column<FACES;column++){
                if(wDeck[row][column] == card){
                    printf("%5s of %-8s\n",wFace[column],wSuit[row]);
                }
            }
        }
    }
}