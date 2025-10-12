import java.util.Scanner;

public class Search_in_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String str=s.nextLine();

        System.out.println("enter the element to search");
        char ch=s.next().charAt(0);

        System.out.println(search3(str,ch));
    }

    //to check wheather the char is present in string or not
    private static char search(String str,char target){
        for (int i=0;i<str.length();i++){
            if (str.length()==0){
                return '0';
            }
           char[] strArray=str.toCharArray();
            if (strArray[i]==target){
                return strArray[i];
            }
        }
        return '0';
    }
    //to check wheather the char is present in string or not using advance for loop// for-each loop
    private static char search2(String str,char target){
        for (char ch: str.toCharArray()){
            if (str.length()==0){
                return '0';
            }

            if (ch==target){
                return ch;
            }
        }
        return '0';
    }

    //to count how many times the char is repeated in string
    private static int search3(String str,char target){
        int count=0;
        for (char ch:str.toCharArray()){
            if (str.length()==0){
                return '0';
            }
         if (ch==target){
             count++;
         }

        }

        return count;
    }
}
