package j09_접근지정자.캡슐화;

public class Student {
    private String name;
    private String gender;

    public Student(){

    }

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() { // 변수값을 반환하는 것이기 때문에 return 필수!!
        return gender;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

