package haruCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2751
public class InsertionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] insertSort = new int[N];

        for (int i = 0; i < N; i++) {
            insertSort[i] = Integer.parseInt(br.readLine());
        }
    }
}