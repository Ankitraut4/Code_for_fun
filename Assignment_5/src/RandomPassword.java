public class RandomPassword {
    public static void main(String[] args) {
//Implement a program to generate random password based on
//customer name, age and id for banking applications
        String name="ankit";
        int age=22;
        int id=575765765;
        System.out.println(randomPassword(name,age,id));
    }
    private static String randomPassword(String name,int age,int id){
        String con=name+age+id;
        int length=con.length();
        String randomString="";
        for(int i=0;i<length;i++){
        randomString+=(con.charAt((int)(Math.random()*(length-1))));
        }
        return randomString;
    }
}
