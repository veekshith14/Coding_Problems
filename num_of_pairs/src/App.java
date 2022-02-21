import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int count =0;
        try (Scanner inp = new Scanner(System.in)) {
            try (Scanner arr = new Scanner(System.in)) {
                System.out.println("Enter your number");
                int num = inp.nextInt();
                int[] ar = new int[num];
                for(int i =0;i<num;i++){
                // System.out.println("Enter array elements");
                   ar[i] = arr.nextInt();
                }
                System.out.print(Arrays.toString(ar));
                for(int i=0;i<num;i++){
                    for(int j=i+1;j<num;j++){
                        if(ar[i]==ar[j]){
                           
                           count++;
                           i++;
                           break;
                        }
                    }
                }
                System.out.println(Arrays.toString(ar));
                System.out.println(count);
            }
        }

}
}