package j08_클래스;

public class Student { // 클래스 : 틀

    String school; // 변수
    String name;
    int studentYear;
    boolean gender;

    Student(){

    }

    Student(String s, String n, int sYear, boolean g){
        this.school = s;
        this.name = n; //100번 안에서 자기자신의 주소.name
        // 변수명과 동일하게 적는 것이 원칙(매개변수는)
        /* String name 지역변수가 권역 변수보다 더 우선순위에 있다.
            (name){
            this.name
            }
         */
        this.studentYear = sYear;
        this.gender = g; // this.
        /*
        class Student
         */
    }

    void showStudentInfo(){
        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        System.out.println("성별 : " + (gender ? "남" : "여"));
    }
}
