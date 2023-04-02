import java.util.Arrays;
public class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success){
    final int n=spells.length;
    int []myarr=new int [n];
        Arrays.sort(potions);
        for (int i=0;i<n;i++)
    {
        long minPotion=(long) Math.ceil((1.0*success)/spells[i]);
        if (minPotion>potions[potions.length-1])
        {
            myarr[i]=0;
            continue;
        }
        myarr[i]=potions.length-binarysearch((int)minPotion,potions);
    }
        return myarr;

}
    int binarysearch (int minPotion,int[] potions)
    {
        int low=0;
        int high=potions.length;
        int mid;
        while (high>low)
        {
            mid=low+(high-low)/2;
            //System.out.println(result);
            if(potions[mid]<minPotion)
                low=mid+1;
            else
                high=mid;

        }
        return low;
    }
}
