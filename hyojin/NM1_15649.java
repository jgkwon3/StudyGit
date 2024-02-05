package test.StudyGit.hyojin;

import java.util.Scanner;

public class NM1_15649 {
    public static void main(String[] args) { // 경우의수 구하고 나머지 코드 작성 예정
        Scanner sc =new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();
        int p=1;
        for (int i = 0; i < M; i++) { //경우의 수 구하기
            p= p*(N-i);
        }
        int[][] arr = new int[p][M];

        for (int i = 1; i <= N; i++) {

            if (M == 1) {
                //System.out.println(i);
            }else{

            }
        }

    }

}
