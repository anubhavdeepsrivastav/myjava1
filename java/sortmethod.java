import java.util.*;
class sortmethod {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums3[]=new int[m+n];
        int k=0;
        int m1=0;
        while(m1<m)
        {
            
            nums3[k]=nums1[m1];
            k++;
            m1++;
        }
        m1=0;
        while(m1<n)
        {
            k++;
            nums3[k]=nums2[m1];
            m1++;
        }

        System.out.print(Arrays.sort(nums3));
    }
}