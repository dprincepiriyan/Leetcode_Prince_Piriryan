class Solution {
    public int longestWPI(int[] hours) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int balance=0;
        int maxLen=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>8){
                balance+=1;
            }else{
                balance+=-1;
            }
            if(balance>0){
                maxLen=Math.max(maxLen,i+1);
            }else{
                if(map.containsKey(balance-1)){
                    maxLen=Math.max(maxLen,i-map.get(balance-1));
                }
                if(!map.containsKey(balance)){
                    map.put(balance,i);
                }
            }
        }
        return maxLen;
    }
}