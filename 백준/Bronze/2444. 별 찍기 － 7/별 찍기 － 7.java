import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b=1;
        StringBuilder output = new StringBuilder();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                output.append(" ");
            }
            for(int j=1;j<=b;j++){
                output.append("*");
            }
            output.append("\n");
            b+=2;
        }
        b-=4;
        for(int i=a-1;i>=1;i--){
            for(int j=a-i;j>=1;j--){
                output.append(" ");
            }
            for(int j=1;j<=b;j++){
                output.append("*");
            }
            output.append("\n");
            b-=2;
        }
        bw.write(output.substring(0, output.length() - 1));
        bw.flush();
    }
}