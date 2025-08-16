
import java.io.*;
import java.util.*;


class WordComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (a.length() != b.length()) {
            return Integer.compare(a.length(), b.length());
        }
        return a.compareTo(b);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> words = new ArrayList<>(set);
        words.sort(new WordComparator());

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w).append("\n");
        }
        System.out.println(sb);
    }
}
