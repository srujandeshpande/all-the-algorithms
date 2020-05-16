#Python code for SELECTION SORT

#Taking input
print("Enter the number of elements")
n = int(input())
print("Enter the elements in a single line seperated by a space")
arr = list(map(int,input().strip().split()))

#Sorting
for i in range(len(arr)):
    for j in range(i,len(arr)):
        if arr[j]<arr[i]:
            arr[j], arr[i] = arr[i], arr[j]

#Printing
for k in arr:
    print(k,end=" ")
print("\n")
