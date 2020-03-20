package lianxi_0318;

import java.util.Scanner;

public class Main1{
    public static String myReserve(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        //System.out.println(stringBuilder); //注意：自身旋转 旋转之后值改变
        if(stringBuilder.length() == 0 || stringBuilder.reverse().toString().equals(s)){
            return "YES";
        }else{
          for(int i = 0;i<stringBuilder.length();i++){
              StringBuilder str = new StringBuilder(s).deleteCharAt(i);
              String s1 = str.toString(); //记录原串
              if(str.reverse().toString().equals(s1)){
                  return "YES";
              }
          }
        }
        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String result = myReserve(s);
            System.out.println(result);
        }
    }
}