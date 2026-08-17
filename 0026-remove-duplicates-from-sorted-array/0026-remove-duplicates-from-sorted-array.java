class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        int index = 0;

        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                nums[index] = nums[i];
                index = index+1;
            }
        }
        return hs.size();
    }
}