package j12_추상.인터페이스;
/*
    1. 모든 메소드는 기본적으로 추상 메소드이다.
    2. 변수는 선언할 수 없다.
    3. 상수는 선언할 수 있다. (기본적으로 모든 변수선언은 상수로 선언된다.)
    4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.

 */
public interface Calculator {

//    private String name; 변수 선언이 안된다.
    public int ERROR_CODE = -9999999; // 상수는 선언할 수 있다. - final 없이 상수 선언 가능 (private 사용 불가)

//    public Calculator(){} // 생성자를 불러올 수가 없다. 일반 변수가 존재하지 않기 때문에

    public int calc(int[] values);
    // 클래스와 동일하지만 추상메소드를 포함할 수 있는 것이 추상클래스이다.

     /*인터페이스는 추상클래스와 비슷하지만(구현부가 없다.) abstract이 없다.
     인터페이스는 기본메소드가 추상메소드이다. (일반 메소드를 사용할 수 없다.)
    */

    // 기본, 추상클래스에는 기본메소드가 일반 메소드이다.


//    public default void setErrorCode(){ // (상수로 선언하지 않았지만 기본적으로 상수로 선언되기 때문에) 선언할 수가 없다.
//        ERROR_CODE = 10;
//    }

}
