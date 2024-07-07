import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.parseInt(br.readLine()),index = 1,num;
        for(int i=0;i<8;i++){
            num = Integer.parseInt(br.readLine());
            if(max<=num){
                max = num; index = i+2;
            } 
        }
        bw.write(max+"\n"+index);
        bw.flush();
    }
}