function selectionSort(arr) 
{
     n = arr.length;
    for (let i = 0; i < n; i++) 
    {
        let min_index = i;
        for (let j = i + 1; j < n; j++) 
        {
            if (arr[j] < arr[min_index]) 
            {
                min_index = j;
            }
        }
        temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
}

arr = [10, 7, 8, 9, 1, 5];
selectionSort(arr);
console.log("Sorted array: " + arr.join(" "));
