import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int quarter = 25, dime = 10, nickel = 5, penny = 1;
        int num;
        for(int i=0;i<n;i++) {
            num = Integer.parseInt(br.readLine());
            bw.write(num/quarter+" "); num = num%quarter;
            bw.write(num/dime+" "); num = num%dime;
            bw.write(num/nickel+" "); num = num%nickel;
            bw.write(num/penny+" ");
            bw.write("\n");
        }
        bw.flush();
    }
}