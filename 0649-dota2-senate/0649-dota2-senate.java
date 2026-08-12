class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queueD = new ArrayDeque<>();
        Queue<Integer> queueR = new ArrayDeque<>();

        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i)=='R'){
                queueR.offer(i);
            }else{
                queueD.offer(i);
            }
        }
        while(!queueR.isEmpty() && !queueD.isEmpty()){
            int r = queueR.poll();
            int d=queueD.poll();
            if(r<d){
                queueR.offer(r + senate.length());
            }else{
                queueD.offer(d + senate.length());
            }
        }
        return queueR.size() > queueD.size() ? "Radiant" : "Dire";
    }
}