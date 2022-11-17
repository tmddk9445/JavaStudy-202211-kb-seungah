package j08_클래스;

public class Phone { // 클래스 (틀)

    String company; // 변수가 선언되어진다.
    String model;

    Phone(){ // 자료형이 없다. 리턴값도 없다. but 생성자는 두가지가 생략되어있다.
        // (무조건 주소값이 리턴되기 때문에)
    }

    Phone(String c, String m){
//        System.out.println("생성자 호출?");
        // 생성자 오버로딩
        // 오버로딩 전에는 생략되어있었기 때문에 그냥 사용가능했다.
        company = c;
        model = m; //( 생성자도 메소드이다. : 매개변수를 넣을 수 있다.)
    } // 반환자료형이 없다. 이름도 대문자로 시작한다.(클래스 명과 같다. )

    void printPhoneCompany(){ // 메소드 - 해당 변수에 들어있는 값을 출력하는 용도
        System.out.println("제조사 : " + company);
        System.out.println();
    }

    void printPhoneModel(){
        System.out.println("모델명 : " + model);
        System.out.println();
    }

}
