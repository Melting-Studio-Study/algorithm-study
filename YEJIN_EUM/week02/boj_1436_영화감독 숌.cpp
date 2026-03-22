#include <iostream>
#include <string>
using namespace std;

int main() {
    int N;
    cin >> N;

    long long num = 666;
    int count = 0;

    while(true){
        if(to_string(num).find("666") != string::npos) {
            count++;
        }

        if(count == N) {
            cout << num << endl;
            break;
        }

        num++;
    }

    return 0;
}