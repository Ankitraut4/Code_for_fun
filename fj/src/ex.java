import java.util.ArrayList;
import java.util.Scanner;

public class ex {
    public static int processArray(ArrayList<Integer> array) {
        for (int i = 0; i < 1; i++) {
           // System.out.println(array.get(array.size()-1));
            if (array.get(array.size()-1)<=100) {
                return array.get(array.size() - 1);
            }
            //return array.get(array.get(array.size()-1));
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}