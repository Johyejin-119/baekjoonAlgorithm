package ZeroBaseCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 27958
public class ShootingPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        ArrayList<Integer> numList = new ArrayList<>();
        int[][] boardNum = new int[N][N];
        int[] shoot = new int[K];
        int score = 0;


        for (int row = 0; row < N; row++) {
            str = new StringTokenizer(br.readLine(), " ");
            for (int col = 0; col < N; col++) {
                int temp = Integer.parseInt(str.nextToken());
                numList.add(temp);
                boardNum[row][col] = temp;
            }
        }

        str = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < K; i++) {
            shoot[i] = Integer.parseInt(str.nextToken());
        }

        br.close();

        System.out.println(score);
    }
}
