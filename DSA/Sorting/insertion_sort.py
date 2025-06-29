

def insertion_sort(arr):

    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1

        while ( j >= 0 and arr[j] > key):
            arr[j+1] = arr[j]
            j = j - 1;

        arr[j+1] = key 
    
    return arr  

rs = insertion_sort([6,5,2,1])
print(rs)