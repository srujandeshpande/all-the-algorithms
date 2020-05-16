//C code for INSERTION SORT
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
  long long int num = 0;
  long long int j = 0;
  for(unsigned long long int i=1; i<n; i++) {
    num = arr[i];
    j = i-1;
    while(j>=0 && arr[j]>num){
      arr[j+1] = arr[j];
      j--;
    }
    arr[j+1] = num;
  }

  //Printing
  for(unsigned long long int k=0;k<n;k++) {
    printf("%lld ",arr[k]);
  }
  printf("\n");
  free(arr);
}
