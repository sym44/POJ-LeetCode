#include <stdio.h>
#include <math.h>

double calculateAvg(double months[12]){
    double sum= 0.0 , avg;
    int i;
    for(i = 0; i < 12; i++){
        sum += months[i];
    }
    avg = sum/12.0;
    return avg;
}

int main(void){
    double months[12];
    double avg = 0.0;
    int i;
    for (i = 0; i < 12; i++){
        scanf("%lf", &months[i]);
    }

    avg = calculateAvg(months);
    printf("$%3.2lf\n", avg);
}
