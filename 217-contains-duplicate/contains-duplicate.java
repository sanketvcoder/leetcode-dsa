class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i : nums){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }else{
                mp.put(i,1);
            }
            
        }

        for(Integer key : mp.keySet()){
            System.out.println(mp.get(key));
            if(mp.get(key)>1){
                return true;
            }
        }
        return false;
    }
}