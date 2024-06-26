import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a =Integer.parseInt(br.readLine());
        String b = br.readLine();
        int num = -1, sum = 0, in = 1;

        for(int i=2;i>=0;i--){
            num = b.charAt(i) - '0';
            System.out.println(a*num);
            sum += a*num*in;
            in*=10;
        }

        System.out.println(sum);
    }
}
