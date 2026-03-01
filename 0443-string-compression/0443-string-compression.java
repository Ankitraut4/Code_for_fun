class Solution {
    public int compress(char[] chars) {
        int i=0, write=0;
            while(i<chars.length){
                int count=0;
                char current = chars[i];
                while(i<chars.length && chars[i]==current){
                
                    count++;
                    i++;
                
            }
            chars[write++]=current;
            if(count>1){
                String str= String.valueOf(count); 
                for(char c: str.toCharArray()){
                    chars[write++]=c;
                }
            }
            }
            

        
            
        return write;
        }
        
        
    }
    
