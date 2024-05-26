#include<stdio.h>
#include<conio.h>

int BinSer(int arr[], int target, int size){// Without recursion

    int si = 0;
    int ei = size-1;
    int mid;

    while(si < ei){
        mid = (si+ei)/2;

        //case 1
        if(target == arr[mid]){
            return mid;
        }

        //case 2
        if(target < arr[mid]){
            ei = mid-1;
        }
        else{//case 3
            si = mid+1;
        }

    }

    return -1;

}

int BinSerRec(int arr[], int si, int ei, int target){ //Recursive code

    int mid;

    if(si > ei){
        return -1;
    }

    mid = (si+ei)/2;

    //case 1 
    if(target == arr[mid]){
        return mid;
    }

    //case 2
    if(target < arr[mid]){
        return BinSerRec(arr,si,mid-1,target);
    }
    else{//case 3 target>arr[mid]
        return BinSerRec(arr,mid+1,ei,target);
    }

}

int main(){
    int arr[] = {12,18,23,30,36,38,42,45,56,61,67,73,84,89,97,105};
    int result;
    int target;

    printf("Enter the element to be searched: ");
    scanf("%d", &target);

    result = BinSerRec(arr, 0, 15, target);

    if(result == -1){
        printf("\nElement not found...!");
    }
    else{
        printf("\nElement found at index %d", result);
    }

    return 0;
}