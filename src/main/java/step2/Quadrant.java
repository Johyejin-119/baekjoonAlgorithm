package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 14681
public class Quadrant {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bufferedReader.readLine());
        int y = Integer.parseInt(bufferedReader.readLine());

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else {
            System.out.println("형식이 잘못되었습니다.(x != 0");
        }
    }
}
