import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;

        String str = new String();

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<String>();
            int cnt = 0;
            str = br.readLine();
            String chr[] = new String[50];
            chr = str.split("");
            for (int j = 0; j < chr.length; j++) {
                if (chr[j].equals("(")) {
                    stack.push("(");
                } else if (chr[j].equals(")")) {
                    if (stack.empty()) {
                        cnt++;
                    } else if (stack.peek().equals("(")) {
                        stack.pop();
                    }
                }
            }
            if (!stack.empty()) {
                cnt++;
            }
            if (cnt > 0) {
                System.out.println("NO");
            } else
                System.out.println("YES");
        } // 입력란

        br.close();
    }
}
