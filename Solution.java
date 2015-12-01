public class Solution {
    public int majorityElement(int[] nums) {
        int sol=0;
        int bit=1;
        int count=0;
        for(int j=0;j<32;j++){
            count=0;
            for(int i=0;i<nums.length;i++){
                count+=(nums[i]&bit)==0?(-1):1;
            }
            sol|=(count>0)?bit:0;
            bit = bit<<1;
        }
        return sol;
    }
}
