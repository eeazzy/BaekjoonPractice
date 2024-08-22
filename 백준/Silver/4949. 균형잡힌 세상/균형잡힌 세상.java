import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> cStack = new Stack<>();
        String s;
        boolean next = false;
        while (true) {
            s = br.readLine();
            if (s == null || s.equals(".")) {
                break;
            }
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='[' || s.charAt(i)=='('){
                    cStack.push(s.charAt(i));
                }else if(s.charAt(i)==']'){
                    if(cStack.isEmpty() || cStack.pop()!='['){
                        bw.write("no\n");
                        next = true;
                        break;
                    }
                }else if(s.charAt(i)==')'){
                    if(cStack.isEmpty() || cStack.pop()!='('){
                        bw.write("no\n");
                        next = true;
                        break;
                    }
                }
            }
            if(next==false){
                if(cStack.isEmpty()){
                    bw.write("yes\n");
                }else{
                    bw.write("no\n");
                }
            }
            next = false;
            cStack.clear();
        }

        bw.flush();
    }
}