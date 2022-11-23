package j12_추상.인터페이스;
/*
    연말정산
 */

public class Tax implements Calculator {
    // 추상클래스도 implements하게 되면 합쳐진다.(공간 할당된 부분이)
    // Tax안에 추상메소드가 포함되어있다.

    @Override // 클래스를 실제 쓸수 있도록 오버라이드 해주어야한다. (추상적이지 않게)
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result += values[i];
        }
        return result;
    }
}
