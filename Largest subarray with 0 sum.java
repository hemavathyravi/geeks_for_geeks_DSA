/*
class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> mymap = new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
            max=i+1;
            else
            {
                if(mymap.get(sum)!=null)
                {
                    max=Math.max(max,i-mymap.get(sum));
                }
                else
                {
                    mymap.put(sum,i);
                }
            }
            
            
        }
        return max;
       
    }
}
*/
