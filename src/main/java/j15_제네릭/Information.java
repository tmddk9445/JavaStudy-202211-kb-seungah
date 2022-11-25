package j15_제네릭;

import lombok.Getter;

public class Information<T> { // class를 제네릭으로 만들었다. // 클래스는 생성을 해야한다.
    @Getter
    private T target; // Object obj 일 경우 다운캐스팅을 해야하지만 제네릭을 사용하면 다운캐스팅을 안해도된다.

    public Information(T target){
        this.target = target;
    }

    public void printInfo(){
        System.out.println(target);
    }

}
