import java.util.Scanner;

public class Linear {
    
    static int linearSearch(int arr[], int target){
        int size = arr.length;

        for(int i=0; i<size; i++){
            
            if(arr[i] == target){
                return i; //Element is found
            }
        }

        return -1; //Element not found

    }

    public static void main(String[] args) {
        int arr[] = {12,45,23,97,15,78};
        int target;
        int result;

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        target = sc.nextInt();

        result = linearSearch(arr, target);

        if(result == -1){
            System.out.println("Element not found...!");
        }else{
            System.out.println("Element found at index "+ result);
        }
    }
}
