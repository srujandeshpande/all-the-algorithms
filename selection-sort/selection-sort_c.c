//C code for SELECTION SORT
#include <stdio.h>
#include <stdlib.h>

//Taking input
int main() {
  unsigned long long int n;
  printf("Enter the number of elements\n");
  scanf("%llu",&n);
  long long int* arr = (long long int*)(calloc(n, sizeof(long long int)));
  printf("Enter the elements in a single line seperated by a space\n");
  for(unsigned long long int i=0;i<n;i++) {
    scanf("%lld",&arr[i]);
  }

  //Sorting
  long long int temp = 0;
  for(unsigned long long int i=0; i<n; i++) {
    for(unsigned long long int j=i; j<n; j++) {
      if(arr[j]<arr[i]) {
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
  }

  //Printing
  for(unsigned long long int k=0;k<n;k++) {
    printf("%lld ",arr[k]);
  }
  printf("\n");
  free(arr);
}
