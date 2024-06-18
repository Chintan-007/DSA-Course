public class InsertionSort {

    
    public static void printArr(int arr[]){
        int size = arr.length;
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    

    public static void insSort(int arr[]){
        int size = arr.length;
        
        for(int i=1; i<size; i++){

            //Task 1: Pick
            int tmp = arr[i];

            int j;

            for(j=i-1; j>=0; j--){

                if(arr[j] > tmp){
                    //Task 2: Move
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            
            //Task 3: Insert
            arr[j+1] = tmp;
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {84,12,73,23,97,11};    
        System.out.println("\nArray before sorting: ");
        printArr(arr);

        insSort(arr);

        System.out.println("\nArray after sorting: ");
        printArr(arr);
    }
    
}
