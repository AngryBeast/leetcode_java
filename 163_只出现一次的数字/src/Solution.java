import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] num = {2,2,3,5,5};
        Solution so = new Solution();
        System.out.println(so.singleNumber(num));
    }
//    public int singleNumber(int[] nums){
//        int count = 0;
//        while (count < nums.length){
//            int times = 0;
//            int i = 0;
//            while (i < nums.length)
//            {
//                if (nums[i] == nums[count])
//                {
//                    times++;
//                }
//                if (times == 2)
//                    break;
//                i++;
//            }
//            if (times != 2)
//                return nums[count];
//            count++;
//        }
//        return -1;
//    }
    public int singleNumber(int[] nums){
        //先排序，遍历数组，若该数和它旁边的数不一致则证明该数只有一个
        Arrays.sort(nums);
        int count = 0;
        while(count < nums.length - 1)
        {
            if (nums[count] != nums[count + 1])
                return nums[count];
            count += 2;
        }
        return nums[nums.length -1];
    }
}
