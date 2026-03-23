#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;
    int num[1000];

    for (int i = 0; i < N; i++) {
        cin >> num[i];
    }

    for (int i = 0; i < N - 1; i++){
        for(int j = 0; j < N - 1; j++) {
            
            if (num[j] > num[j + 1]){
            int temp = num[j];
            num[j] = num[j + 1];
            num[j + 1] = temp;
        }
    }
}

    for ( int i = 0; i < N; i++){
        cout << num[i] << '\n';
    }

    return 0;
}