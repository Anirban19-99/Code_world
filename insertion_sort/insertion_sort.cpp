void insertionSort(int arr[], int n)
{
    int i,j,value,index;

    for(i=1;i<n;i++)
    {
        index=i;
        value=arr[index];// it will store the value of index

        while(index>0 && arr[index-1]>value)// compare if the previous value is greate then
                                            //index value or not, if yes then shift the content to the right side
        {
            arr[index]=arr[index-1];
            index--;
        }
        arr[index]=value; //if the loop gets a exit that means the value got its right position
    }
}
