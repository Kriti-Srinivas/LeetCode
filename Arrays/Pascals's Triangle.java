/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]] */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pt= new ArrayList<>();
        if(numRows<=0) return pt;
        List<Integer> first= new ArrayList<>();
        first.add(1);
        pt.add(first);
        for(int i=1; i<numRows; i++){
            List<Integer> prev= pt.get(i-1);
            List<Integer> current= new ArrayList<>();
            current.add(1);

            for(int j=1; j<i; j++){
                int s= prev.get(j-1)+prev.get(j);
                current.add(s);
            }

            current.add(1);
            pt.add(current);
        }

        return pt;
    }
}