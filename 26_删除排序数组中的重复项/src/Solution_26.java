import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_26 {

    public int count = 0;
    public static void main(String[] args) {
        Solution_26 so = new Solution_26();
        //int[] nums =  {0,0,1,1,1,2,2,3,3,4};
        //int[] nums =  {1,1,2};
        int[] nums =  {1};
        System.out.println(so.removeDuplicates(nums));

    }


        public int removeDuplicates(int[] nums) {         //Version2.0
        Solution_26 so = new Solution_26();
        if (nums.length == 0)
            return 0;
        int[] addr = new int[nums.length];
        int count = 1;
        int temp = nums[0];
        addr[0] = nums[0];
        for (int i = 0; i < nums.length ;i++)
        {
            if (temp == nums[i])
            {
                continue;
            }
            temp = nums[i];
            addr[count] = temp;
            count++;
        }
        if(addr[count-1] != temp)
        {
             addr[count] = temp;
             //count++;
        }

        for (int i = 0;i < count;i++)
        {
            nums[i] = addr[i];
        }
        so.printout(nums);
        so.printout(addr);
        //return  nums.length - count +1;
            return count;
    }


//    public int removeDuplicates(int[] nums) {         //Version1.0
//        Solution_26 so = new Solution_26();
//        for(int i = 0;i< nums.length - count -1;)
//        {
//            if (nums[i] == nums[i+1])
//            {
//               for(int add = i;add < nums.length -1;add++)  //挪动数组
//               {
//                   nums[add] = nums[add+1];
//               }
//               count++;
//               so.printout(nums);
//                System.out.println(nums.length - count);
//               continue;
//            }
//            i++;
//        }
//        return  nums.length - count;
//    }


    public void printout(int[] nums){           //输出数组函数，测试用
        for (int i = 0;i < nums.length;i++)
        {
            System.out.print(nums[i]+",");
        }
        System.out.println();
    }



//    public int removeDuplicates(int[] nums) {  //成功提交的代码
//        int count = 0;
//        for(int i = 0;i< nums.length - count -1;)
//        {
//            if (nums[i] == nums[i+1])
//            {
//                for(int add = i;add < nums.length -1;add++)
//                {
//                    nums[add] = nums[add+1];
//                }
//                count++;
//                continue;
//            }
//            i++;
//        }
//        return  nums.length - count;
//    }
}
