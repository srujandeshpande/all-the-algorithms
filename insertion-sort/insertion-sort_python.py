#Python code for INSERTION SORT

#Taking input
print("Enter the number of elements")
n = int(input())
print("Enter the elements in a single line seperated by a space")
arr = list(map(int,input().strip().split()))

#Sorting
for i in range(1,len(arr)):
    num = arr[i]
    j = i-1
    while j>=0 and arr[j]>num:
        arr[j+1] = arr[j]
        j-=1
    arr[j+1] = num

#Printing
for k in arr:
    print(k,end=" ")
print("\n")
