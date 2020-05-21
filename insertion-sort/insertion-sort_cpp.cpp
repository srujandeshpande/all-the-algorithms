//INSERTION SORT IN C++

#include<iostream>
using namespace std;

int main() {
  //Input
  int length;
  cout << "Enter Length\n";
  cin >> length;
  int arr[length];
  cout << "Enter the Elements\n";
  for(int i = 0; i < length; i++) {
    cin >> arr[i];
  }

  //Sorting
  long long int num = 0;
  int j;
  for(unsigned long long int i=1; i<length; i++) {
    num = arr[i];
    j = i-1;
    while(j>=0 && arr[j]>num){
      arr[j+1] = arr[j];
      j--;
    }
    arr[j+1] = num;
  }

  //Printing
  for(int i = 0; i<length; i++)
    cout << arr[i] << " ";
  cout << endl;
}
