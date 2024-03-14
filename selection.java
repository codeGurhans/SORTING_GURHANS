public class selection 
{
    public static void selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            int min_index = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[min_index]) 
                {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        selectionSort(arr);
        
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
