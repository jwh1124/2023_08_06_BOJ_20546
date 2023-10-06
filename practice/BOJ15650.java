import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15650 {
    static int n;
    static int m;
    static boolean visit[];
    static int result[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visit = new boolean[n + 1];
        result = new int[m + 1];

        dfs(1, 0);

    }

    public static void dfs(int num, int dep) {

        if (dep == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println("");
            return;
        }
        for (int i = num; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[dep] = i;
                dfs(i, dep + 1);
                visit[i] = false;
            }

        }

    }

}
