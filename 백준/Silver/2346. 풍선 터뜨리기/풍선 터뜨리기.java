import java.io.*;
import java.util.*;

class Balloon {
    int number;
    int value;
    Balloon next;
    Balloon prev;

    Balloon(int number, int value) {
        this.number = number;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Balloon head = null;
        Balloon tail = null;

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(st.nextToken());
            Balloon balloon = new Balloon(i, value);
            if (head == null) {
                head = balloon;
                tail = balloon;
            } else {
                tail.next = balloon;
                balloon.prev = tail;
                tail = balloon;
            }
        }

        // 원형 연결 리스트 만들기
        head.prev = tail;
        tail.next = head;

        StringBuilder sb = new StringBuilder();
        Balloon current = head;

        for (int i = 0; i < n; i++) {
            sb.append(current.number).append(" ");

            int move = current.value;
            Balloon next = current.next;

            // 현재 풍선 제거
            current.prev.next = current.next;
            current.next.prev = current.prev;

            if (i == n - 1) break; // 마지막 풍선이면 종료

            // 다음 풍선으로 이동
            if (move > 0) {
                for (int j = 0; j < move - 1; j++) {
                    next = next.next;
                }
            } else {
                for (int j = 0; j < -move; j++) {
                    next = next.prev;
                }
            }

            current = next;
        }

        System.out.println(sb.toString().trim());
    }
}