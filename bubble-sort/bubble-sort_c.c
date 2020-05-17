//C code for BUBBLE SORT
#include <stdio.h>
#include <stdlib.h>

int main() {
  //Taking input
  printf("Enter the number of elements\n");
  unsigned long long int n;
  scanf("%llu",&n);

  long long int *arr = (long long int*)(calloc(n,sizeof(long long int)));
  printf("Enter the elements in a single line seperated by a space\n");
  for(int i=0;i<n;i++) {
    scanf("%lld",&arr[i]);
  }

  //Sorting
  int temp = 0;
  for(int i=0;i<n;i++) {
    for(int j=0;j<(n-i-1);j++) {
      if(arr[j]>arr[j+1]) {
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }

  //Printing
  for(int i=0;i<n;i++) {
    printf("%lld ",arr[i]);
  }
  printf("\n");
}
