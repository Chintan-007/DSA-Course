public class SelcSort{
    
    public static void printArray(int arr[]){
        int size = arr.length;

        for(int i=0; i<size; i++){
            System.err.print(arr[i]+" ");
        }
    }

    public static void selSort(int arr[]){
        
        int size = arr.length;

        for(int i=0; i<size-1; i++){
            
            //Task 1
            int min = i;

            //Task2
            for(int j=i+1; j<size; j++){

                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            //Task3(Swapping)
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,12,73,84,97,11};

        System.out.println("\nArray before sorting: ");
        printArray(arr);

        selSort(arr);

        System.out.println("\nArray after Sorting:");
        printArray(arr);
    }
}