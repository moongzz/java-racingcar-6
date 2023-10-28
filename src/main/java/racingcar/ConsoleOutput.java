package racingcar;

import java.util.List;

public class ConsoleOutput {
    public void printInputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printInputAttempts(){ System.out.println("시도할 회수는 몇회인가요?"); }

    public void printForward(List<String> cars, List<String> forward){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " : " + forward.get(i));
        }
    }
}
