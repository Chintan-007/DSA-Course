public class BubbleSort{


    static void printArr(int arr[]){
        int size = arr.length;

        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Bubble sort
    static void bubbleSort(int arr[]){

        int size = arr.length;

        boolean isSorted = true;

        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){

                if(arr[j] > arr[j+1]){
                    isSorted = false;
                    //swapping
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }

            if(isSorted){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {23,12,97,84,73,11};

        System.out.println("\nArray before sorting: ");
        printArr(arr);

        bubbleSort(arr);

        System.out.println("\nArray after sorting: ");
        printArr(arr);

    }
}