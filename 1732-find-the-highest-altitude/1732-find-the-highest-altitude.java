class Solution {
    public int largestAltitude(int[] gain) {
       int prefix=0;
       int max_altitude = 0;
       for(int i=0; i<gain.length; i++){
            prefix+=gain[i];
            max_altitude = Math.max(max_altitude, prefix);
       }
       return max_altitude; 
    }
}