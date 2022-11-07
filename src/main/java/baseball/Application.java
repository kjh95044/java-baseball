package baseball;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }

    private static List<Integer> createRandomThreeNums(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public static Boolean isNothing(List<Integer> userInput, List<Integer> computer){
        boolean isNothing = true;
        for (Integer integer : userInput) {
            if (computer.contains(integer)) {
                isNothing = false;
                break;
            }
        }
        return isNothing;
    }
}
