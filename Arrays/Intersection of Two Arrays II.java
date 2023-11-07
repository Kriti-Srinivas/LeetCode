/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted. */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m= new HashMap<>();
        for(int i:nums1){
            m.put(i, m.getOrDefault(i,0)+1);
        }

        List<Integer> l= new ArrayList<>();
        for(int i: nums2){
            if(m.containsKey(i) && m.get(i)>0){
                l.add(i);
                m.put(i, m.get(i)-1);
            }
        }

        int[] ans= new int[l.size()];
        for(int i=0; i<l.size(); i++){
            ans[i]= l.get(i);
        }
        return ans;
    }
}