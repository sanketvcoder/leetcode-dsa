class Solution {
    
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }

        int half = nums.length/2;
        int maxVal = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > half) {
                return entry.getKey();
            }
        }
        return -1;
    }
}