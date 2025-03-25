import java.util.*;
import java.io.*;


public class Main {

    int cash,jRes,sRes;
    int[] price = new int[14];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int calcJRes(int cash){
        int cnt = 0;

        for(int i=0;i<14;i++){
            int c = cash/price[i];
            if(c>0){
                cnt += c;
                cash -= (c*price[i]);
            }
        }

        return cash+cnt*price[13];
    }

    int calcSRes(int cash) {
        int cnt = 0;
        int up = 0, down = 0;

        for (int i = 1; i < 14; i++) {
            int c = cash / price[i];

            if (price[i - 1] < price[i]) {
                up++;
                down = 0;
            } else if (price[i - 1] > price[i]) {
                down++;
                up = 0;
            } else {
                up = down = 0;
            }

            if (up == 3) {
                cash += cnt * price[i];
                cnt = 0;
            } else if (down == 3) {
                if (c > 0) {
                    cnt += c;
                    cash -= c * price[i];
                }
            }
        }

        return cash + cnt * price[13];
    }


    void solution() throws Exception {
        cash = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<14;i++){
            price[i] = Integer.parseInt(st.nextToken());
        }

        jRes = calcJRes(cash);
        sRes = calcSRes(cash);

        if(jRes>sRes){
            System.out.println("BNP");
        }
        else if(jRes<sRes){
            System.out.println("TIMING");
        }
        else{
            System.out.println("SAMESAME");
        }
    }



    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}