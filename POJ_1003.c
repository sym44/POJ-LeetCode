/*
 * This c program is the accepted answer to the question POJ 1003.
 * @author Raymond Shi
 */

#include <stdio.h>

int main(void){
    int numOfCards;
    float length, temp;

    while (1){
        scanf("%f",&length);
        if (length <= 0.0 || length > 5.20)
            return 1;
        else{
            numOfCards = 1;
            temp = 0.0;
            while (temp < length){
                temp += 1.0/(float)(numOfCards + 1);
                numOfCards++;
            }
        }
        printf("%d card(s)\n", numOfCards-1);
    }

    return 0;
}

