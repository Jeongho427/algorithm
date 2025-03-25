import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();  // 초기 자산
        int[] prices = new int[14];
        for (int i = 0; i < 14; i++) {
            prices[i] = sc.nextInt();
        }

        // 준현이 (BNP 전략)
        int jhMoney = money;
        int jhStock = 0;

        for (int i = 0; i < 14; i++) {
            if (jhMoney >= prices[i]) {
                int canBuy = jhMoney / prices[i];
                jhStock += canBuy;
                jhMoney -= canBuy * prices[i];
            }
        }
        int jhTotal = jhMoney + jhStock * prices[13];

        // 성민이 (TIMING 전략)
        int smMoney = money;
        int smStock = 0;

        for (int i = 3; i < 14; i++) {
            if (prices[i-3] > prices[i-2] && prices[i-2] > prices[i-1]) {
                // 3일 연속 하락 -> 매수
                int canBuy = smMoney / prices[i];
                smStock += canBuy;
                smMoney -= canBuy * prices[i];
            } else if (prices[i-3] < prices[i-2] && prices[i-2] < prices[i-1]) {
                // 3일 연속 상승 -> 전량 매도
                smMoney += smStock * prices[i];
                smStock = 0;
            }
        }
        int smTotal = smMoney + smStock * prices[13];

        if (jhTotal > smTotal) {
            System.out.println("BNP");
        } else if (jhTotal < smTotal) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }

        sc.close();
    }
}
