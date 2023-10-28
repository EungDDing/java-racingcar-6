package input;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Car {
    public List<String> inputCar() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        List<String> carNames = new ArrayList<>();
        String input = readLine();
        for (String name: input.split(",")) {
            carNames.add(name);
        }
        checkNameLength(carNames);
        return carNames;
    }
    public void checkNameLength(List<String> carNames) {
        for (int i = 0; i < carNames.size(); i++) {
            String name = carNames.get(i);
            if (name.length() > 5 || name.length() < 1) {
                throw new IllegalArgumentException();
            }
        }
    }
}
