// import java.util.Arrays;

// public class leetcode229 {
//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3, 4 };
//         print(nums, nums2);
//         System.out.println(Arrays.toString(nums2));
//     }

//     public static int[] print(int[] nums) {
//         int[] nums2 = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//             int a = i;
//             print2(nums, a, 1, nums2);
//         }
//         for (int i = 0; i < nums2.length; i++) {
//         nums[i] = nums2[i];
//         }
//         return nums;
//     }

//     public static int[] print2(int[] nums, int a, int ans, int[] nums2) {
//         for (int i = 0; i < nums.length; i++) {
//             if (i != a) {
//                 ans = ans * nums[i];
//             }
//         }
//         nums2[a] = ans;
//         return nums2;
//     }
// }
import java.util.*;
public class leetcode229
{
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("a");
        l1.add("ab");
        l1.add("b");
        l1.sort();
        System.out.println(l1);


    }
}