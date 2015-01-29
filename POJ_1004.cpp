#include <cmath>
#include <iostream>
using namespace std;

double Round(double);
double average(double);

double average(double monthIncome[])
{
    double average, sum;
    int i;

    for (i = 0; i <= 11; i++) {
        sum += monthIncome[i];
    }
    average = Round(sum/12.0);
    return average;
}

double Round(double figure)
{
    double rounded;
    rounded = floor(figure*100+0.5)/100.0;
    return rounded;
}

int main()
{
    double monthIncome[12];
    int i;

    for (i = 0; i <= 11; i++) {
        cin >> monthIncome[i];
    }

    cout << "$" << average(monthIncome);

}
