import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10828 {

    static int n, floor;
    static String botton;
    static int[] stack;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        stack = new int[100000];
        floor = 0;
        cal(stack);

    }

    static void cal(int[] stack) throws IOException {

        for (int i = 0; i < n; i++) {
            botton = br.readLine();
            StringTokenizer st = new StringTokenizer(botton);
            switch (st.nextToken()) {
                case "push": {
                    floor++;
                    int num = 0;
                    num = Integer.parseInt(st.nextToken());
                    stack[floor] = num;
                    break;
                }
                case "pop": {
                    if (floor == 0) {
                        System.out.println(-1);
                        break;
                    } else {
                        System.out.println(stack[floor]);
                        stack[floor] = 0;
                        floor = floor - 1;
                        break;
                    }
                }
                case "empty": {
                    if (floor == 0) {
                        System.out.println(1);
                        break;
                    } else {
                        System.out.println(0);
                        break;
                    }
                }
                case "size": {
                    int j = 1, cnt = 0;
                    while (stack[j] != 0) {
                        cnt++;
                        j++;
                    }
                    System.out.println(cnt);
                    break;
                }
                case "top": {
                    if (floor == 0) {
                        System.out.println(-1);
                        break;
                    } else
                        System.out.println(stack[floor]);
                    break;
                }

            }
        }
    }

}
