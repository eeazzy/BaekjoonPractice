import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        if(a.trim().isEmpty()){
            bw.write(0+"");
            bw.flush();
            return;
        }
        if(a.charAt(0) == ' '){
            a = a.substring(1);
        }
        if(a.charAt(a.length()-1) == ' '){
            a = a.substring(0,a.length()-1);
        }

        int b=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == ' '){
                b++;
            }
        }

        bw.write((b+1)+"");
        bw.flush();
    }
}