#include<stdio.h>
#include<conio.h>

void PrintArr(int arr[], int size){
    int i;
    for(i=0; i<size; i++){
        printf(" %d ", arr[i]);
    }
}


void BubbleSort(int arr[], int size){

    int i,j;
    int flag = 0;

    for(i=0; i<size-1; i++){
        for(j=0; j<size-i-1; j++){

            if(arr[j] > arr[j+1]){

                flag = 1;
                //swapping
                arr[j] = arr[j] + arr[j+1];
                arr[j+1] = arr[j] - arr[j+1];
                arr[j] = arr[j] - arr[j+1];
            }
        }
        if(flag == 0){
            break;
        }
    }
}

int main(){
    int arr[6] = {23,12,97,84,73,11};

    printf("\nArray before sorting: \n");
    PrintArr(arr,6);

    BubbleSort(arr, 6);

    printf("\nArray after sorting: \n");
    PrintArr(arr,6);
    
    return 0;
}