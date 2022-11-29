package Preview17_스태틱.싱글톤;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SmartPhone { // 여러가지가 생성될 수 있다. != Samsung

    private String company;
    private String model;
    private String serial;


}
