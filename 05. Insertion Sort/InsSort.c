#include<stdio.h>
#include<conio.h>

void PrintArr(int arr[], int size){

    int i;
    for(i=0; i<size; i++){
        printf(" %d ",arr[i]);
    }
}



//Insertion sort
void InsSort(int arr[], int size){

    int i,j,tmp;

    for(i=1; i<size; i++){
        
        //Task 1:  Pick
        tmp = arr[i];

        for(j=i-1; j>=0; j--){

            //Task 2: Move
            if(arr[j] > tmp){
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


int main(){
    int arr[6] = {84,12,73,23,97,11};
    
    printf("\nArray before sorting: ");
    PrintArr(arr,6);

    InsSort(arr,6);

    printf("\nArray aftre sorting: ");
    PrintArr(arr,6);

    return 0;
}