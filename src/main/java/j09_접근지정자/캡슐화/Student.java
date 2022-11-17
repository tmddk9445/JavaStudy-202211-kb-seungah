package j09_접근지정자.캡슐화;

public class Student { // public 외부에서 접근X class안에서만 사용할 수 있다.
    public String name;
    public String gender;

    public Student() {
        // 생성을 해야지만 동적메모리를 할당받는다.
        // 여러 데이터를 받기 위해서는 생성을 해야한다.
        // (ex. 여러명의 데이터를 입력하기위해서)
    }

    public Student(String name, String gender) { // 생성자를 통해 값을 입력하는 방식
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    // setName이라는 메소드(를 통해)에 값을 입력할 수 있는 this.name = name;을 사용

    // set(외부에서 값을 가지고 오는 것) 값을 넣어주기만 하면된다.
    // return(자료형)이 void이다.

    // public void setName(변수 자료형 변수명){
    //     this.name = name(변수명);
    // }

    public String getName() {
        return name;
    }
//  get(외부로 가져다 주는 것) 반환(변수 값이)이 있을 때 값을 받을 수 있다.
    // public + 변수자료형 + get변수명(카멜표기법)(){
    //  return 변수명;
    // }

    //private일 경우 public을 하나 더 만ㄴ들어서 메인클래스로 가지고 갈 수 있다.

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

