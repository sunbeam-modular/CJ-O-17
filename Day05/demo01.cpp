#include <iostream>
using namespace std;

int main()
{
    int num1 = 100;
    int arr[3];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    cout << "num1 - " << num1 << endl;
    cout << "arr - " << arr << endl;
    cout << "arr[0] - " << arr[0] << endl;
    cout << "&arr[0] - " << &arr[0] << endl;
    cout << "arr[1] - " << arr[1] << endl;
    cout << "&arr[1] - " << &arr[1] << endl;
    cout << "arr[2] - " << arr[2] << endl;
    cout << "&arr[2] - " << &arr[2] << endl;
    return 0;
}