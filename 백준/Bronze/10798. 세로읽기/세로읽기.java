import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] word = new char[5][15];

        String a;
        for(int i=0;i<5;i++){
            a = br.readLine();
            for(int j=0; j<a.length(); j++) {
                word[i][j] = a.charAt(j);
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(word[j][i] != '\0'){
                    bw.write(word[j][i]);
                }
            }
        }
        bw.flush();
    }
}