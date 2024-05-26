#include<stdio.h>
#include<conio.h>

int LinearSearch(int arr[], int target, int size){
    int i;

    for(i=0; i<size; i++){

        if(arr[i] == target){
            return i; //Element is found
        }
    }

    return -1; //Element is not found
}

int main(){
    int arr[6] = {12,45,23,97,15,78};
    int target;
    int result;

    printf("Enter the element to be searched: ");
    scanf("%d", &target);

    result = LinearSearch(arr, target, 6);

    if(result == -1){
        printf("\n Element not found...!");
    }else{
        printf("\n Element found at index %d", result);
    }
    
    return 0;
}