#include<stdio.h>
#include<conio.h>


//Printing array
void printArray(int arr[], int size){
    int i;
    for(i=0; i<size; i++){
        printf(" %d ", arr[i]);
    }
}

//Selection Sort
void SelecSort(int arr[], int size){

    //Members
    int i, j, min, tmp;

    for(i=0; i<size-1; i++){

        //Task 1
        min = i;

        //Task 2
        for(j=i+1; j<size; j++){

            if(arr[j] < arr[min]){
                min = j;
            }
        }

        
        //Task 3 (Swapping)
        tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;

    }
}

int main(){

    int arr[6] = {23,12,73,84,97,11};
    
    printf("\n Array before sorting: ");
    printArray(arr,6);

    SelecSort(arr,6);

    printf("\n Array after sorting: ");
    printArray(arr,6);

}