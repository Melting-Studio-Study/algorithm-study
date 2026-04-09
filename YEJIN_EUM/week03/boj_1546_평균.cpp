#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    double num[1000];
    double max = 0;
    double sum = 0;

    for (int i = 0; i < N; i++) {
        cin >> num[i];

        if (num[i] > max) {
            max = num[i];
        }
    }

    for (int i = 0; i < N; i++) {
        num[i] = num[i]/max*100;
        sum += num[i];
    }

    cout << sum / N << endl;

    return 0;
}