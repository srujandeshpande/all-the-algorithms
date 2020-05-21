//
//  Created by Shrish Deshpande on 5/16/20.
//  Copyright © 2020 Shrish Deshpande. All rights reserved.
//

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
  int i, j, imin;
  for(i = 0; i<length-1; i++) {
    imin = i;
    for(j = i+1; j<length; j++) {
      if(arr[j] < arr[imin]) {
        imin = j;
      }
    }
    swap(arr[i], arr[imin]);
  }

  //Printing
  for(int i = 0; i<length; i++)
    cout << arr[i] << " ";
  cout << endl;
}
