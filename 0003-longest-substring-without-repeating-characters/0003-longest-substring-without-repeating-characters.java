class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int maxSubstring = 0;
        

        for(int right = 0; right<s.length(); right++){

            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            
                hs.add(s.charAt(right));
                maxSubstring = Math.max(maxSubstring,right-left+1);
            
        }

        return maxSubstring;
    }
}