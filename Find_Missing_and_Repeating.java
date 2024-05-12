/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.
*/
class Solve {
    int[] findTwoElement(int arr[], int n) {
       
        long repeat,miss;
        long n1 = (long) arr.length;
        
        long s1,sn=0L,s2,s2n=0L;
        
        s1=(n1*(n1+1))/2;
        s2=(n1*(n1+1)*((2*n1)+1))/6;
        for(int i=0;i<n;i++)
        {
            sn+=(long)arr[i];
            s2n+=(long)arr[i]*(long)arr[i];
        }
        long val1= sn - s1;
        long val2 = s2n - s2;
        val2= val2/val1;
        repeat =(val1+val2)/2;
        miss= repeat-val1;
        
        int[] arra =new int[2];
        arra[0]=(int)repeat;
        arra[1]=(int)miss;
                      
                      
        return arra;
    }
}
