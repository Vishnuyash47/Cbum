import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int temp = n;
            int count=0;
            int roundnum=1;
            ArrayList <Integer> subbu = new ArrayList<Integer>();
            while (temp>0) {
                roundnum = (int)(temp%10*(Math.pow(10, count)));
                if (roundnum!=0) {
                    subbu.add(roundnum);
                }
                temp/=10;
                count++;
            }
            System.out.println(subbu.size());
            for(int i=0; i<subbu.size(); i++){
                System.out.print(subbu.get(i) + " ");
            }
            System.out.println();
        }
    }
}
