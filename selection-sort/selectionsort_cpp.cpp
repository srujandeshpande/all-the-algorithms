//
//  main.cpp
//  stoofcpp
//
//  Created by Shrish Deshpande on 5/16/20.
//  Copyright © 2020 Shrish Deshpande. All rights reserved.
//

#include<iostream>
using namespace std;

void display(int *array, int size) {
   for(int i = 0; i<size; i++)
      cout << array[i] << " ";
   cout << endl;
}
void sort(int *array, int size) {
   int i, j, imin;
   for(i = 0; i<size-1; i++) {
      imin = i;
      for(j = i+1; j<size; j++)
         if(array[j] < array[imin])
            imin = j;
         swap(array[i], array[imin]);
   }
}
int main() {
   int length;
   cout << "Length" << endl;
   cin >> length;
   int arr[length];
   cout << "Elements" << endl;
    for(int i = 0; i < length; i++) {
      cin >> arr[i];
   }
   sort(arr, length);
   display(arr, length);
}
