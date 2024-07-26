import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        int count = 0;
        for(int i=0;i<a.length();i++){
            if (i < a.length() - 1) {
                if (a.charAt(i) == 'c' && (a.charAt(i + 1) == '=' || a.charAt(i + 1) == '-')) {
                    i++;
                } else if (a.charAt(i) == 'd' && a.charAt(i + 1) == '-') {
                    i++;
                } else if (a.charAt(i) == 'l' && a.charAt(i + 1) == 'j') {
                    i++;
                } else if (a.charAt(i) == 'n' && a.charAt(i + 1) == 'j') {
                    i++;
                } else if (a.charAt(i) == 's' && a.charAt(i + 1) == '=') {
                    i++;
                } else if (a.charAt(i) == 'z' && a.charAt(i + 1) == '=') {
                    i++;
                } else if (i < a.length() - 2 && a.charAt(i) == 'd' && a.charAt(i + 1) == 'z' && a.charAt(i + 2) == '=') {
                    i += 2;
                }
            }
            count++;
        }
        bw.write(count+"");
        bw.flush();
    }
}