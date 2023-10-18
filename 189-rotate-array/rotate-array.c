void rotate(int* a, int n, int k){

    int ans[n];
    k=k%n;
    int start=n-k;
    int j=0;
    int i;
    for(i=start;i<n;i++)
    {
        ans[j]=a[i];
        j++;
    }

    for(i=0;i<start;i++)
    {
        ans[j]=a[i];
        j++;

    }
    for(i=0;i<n;i++)
    {
        a[i]=ans[i];
    }

}