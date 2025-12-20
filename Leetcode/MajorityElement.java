package Leetcode;

class Solution {
  public class MajorityElement {
    
    public static int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int i : nums) {
            if(count == 0) {
                ans = i;
            }
            if(i == ans) {
                count++;
            } else {
                count--;
            }  
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {3,2,3};
        System.out.println("Test 1: " + majorityElement(nums1)); // 3
        
        // Test Case 2
        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println("Test 2: " + majorityElement(nums2)); // 2
        
        // Test Case 3
        int[] nums3 = {1};
        System.out.println("Test 3: " + majorityElement(nums3)); // 1
        
        // Test Case 4 (LeetCode style)
        int[] nums4 = {8,8,7,7,7};
        System.out.println("Test 4: " + majorityElement(nums4)); // 7
    }
}
}
