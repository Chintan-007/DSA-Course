import java.util.Scanner;

public class BinSearch {
    
    static int binSearch(int arr[], int target){ //Non recursive code
        int size = arr.length;
        int si = 0, ei = size-1;

        while (si < ei) {
            
            int mid = (si+ei)/2;

            //case 1
            if(target == arr[mid]){
                return mid;
            }

            //case 2
            if(target < arr[mid]){
                ei = mid-1;
            }
            else{ //case 3 target>arr[mid]
                si = mid+1;
            }
        }

        return -1;
    }


    //recursive code
    static int binSearchRec(int arr[], int si, int ei, int target){

        if(si > ei){
            return -1;
        }

        int mid = (si+ei)/2;

        //case 1
        if(target == arr[mid]){
            return mid;
        }

        //case2
        if(target < arr[mid]){
            return binSearchRec(arr, si, mid-1, target);
        }
        else{ //case 3 target>arr[mid]
            return binSearchRec(arr, mid+1, ei, target);
        }

    }

    public static void main(String[] args) {
        int arr[] = {12,18,23,30,36,38,42,45,56,61,67,73,84,89,97,105};
        int target;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element to be searched: ");
        target = sc.nextInt();

        result = binSearchRec(arr, 0, arr.length-1, target);

        if(result == -1){
            System.out.println("Element not found....!");
        }else{
            System.out.println("Element found at index "+ result);
        }

    }
}
