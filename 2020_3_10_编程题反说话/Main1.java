package lianxi_0309;
//反说话
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for(int i = strings.length-1; i >= 0; i--){
                if(i == 0){
                    System.out.print(strings[i]);
                }else {
                    System.out.print(strings[i] + " ");
                }
            }
        }
    }
}
