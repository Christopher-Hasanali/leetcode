package problems;


public class Problem53 {

    public int maxSubArray(int[] nums) {
        int cur_max = nums[0];
        if(nums.length==1) return cur_max;
        if(nums.length==2) return Math.max(Math.max(nums[0],nums[1]),nums[0]+nums[1]);
        System.out.println("DONE");
        int max_soFar=cur_max;

        for(int i=1;i<nums.length;i++) {
            cur_max+= nums[i];
            System.out.println("cuur:"+cur_max + " " + max_soFar);
            if(max_soFar<Math.max(nums[i],cur_max)) {
                max_soFar=Math.max(cur_max,nums[i]);
                cur_max=max_soFar;
                System.out.println("in loop:"+max_soFar+" "+cur_max);
            }
        }
        return max_soFar;
    }
}
