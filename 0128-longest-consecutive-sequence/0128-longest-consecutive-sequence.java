class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int longest = 1;

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }

        for(int num: hs){

            if(!hs.contains(num-1)){

                int currCnt = 0;

                int x = num;

                while(hs.contains(x)){
                    currCnt++;
                    x = x+1;
                }

                longest = Math.max(longest,currCnt);
                
            }
            
        }
           return longest;
    }
}