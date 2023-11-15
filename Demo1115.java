import java.util.Arrays;

public class Demo1115 {
    public int maximizeSum(int[] nums, int k) {
        int result= 0;
        int n = nums.length-1;
        Arrays.sort(nums);
        while(k!=0){
            result += nums[n];
            nums[n] = nums[n]+1;
            k--;
        }
        return result;
    }


}
