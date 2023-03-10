package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-29
 * @title : 삼각형의 완성조건(1)
 * */

import java.util.Arrays;

public class theConditionsForCompletionOfATriangle {
    public static void main(String[] args){
        int[] sides = {199, 72, 222};
        System.out.println(solution(sides));
    }
    public static int solution(int[] sides){
        int answer = 0;
        Arrays.sort(sides);

        if(sides[2] < (sides[0] + sides[1])){
            answer = 1;
        }
        else{
            answer = 2;
        }
        return answer;
    }
}
