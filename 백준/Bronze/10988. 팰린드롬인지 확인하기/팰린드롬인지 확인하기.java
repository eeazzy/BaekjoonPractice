import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        int b=0;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i) == a.charAt(a.length()-(i+1))){
                b = 1;
            }
            else{
                b = 0;
                break;
            }
        }
        if(a.length()==1){
            b = 1;
        }
        bw.write(b+"");
        bw.flush();
    }
}