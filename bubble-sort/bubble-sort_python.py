#Python code for BUBBLE SORT

#Taking input
print("Enter the number of elements")
n = int(input())
print("Enter the elements in a single line seperated by a space")
arr = list(map(int,input().strip().split()))

#Sorting
for i in range(0,len(arr)):
    for j in range(0,len(arr)-i-1):
        if arr[j] > arr[j+1]:
            arr[j],arr[j+1] = arr[j+1],arr[j]

#Printing
for k in arr:
    print(k,end=" ")
print("\n")
