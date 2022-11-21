package j11_상속.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal(); // 원
        Human human = new Human(); // 세모
        Tiger tiger = new Tiger(); // 네모

        Animal hAnimal = (Animal) human; // (묵시적) 형변환 - 업캐스팅
        //hAnimal 안에는 100번 주소값만 가지고 있다.(참조하고 있다.)
        Animal tAnimal = tiger; // 형변환을 통해 Animal로 묶었다. => Animal배열을 만들 수 있다.
        Animal[] animals = new Animal[3];

//        animals[0] = hAnimal;
        animals[0] = new Human(); // 생성해서 값을 바로 넣을 수 있다.
        animals[1] = new Tiger(); //
        animals[2] = new Animal(); //

        for(int i = 0; i < animals.length; i++){
            animals[i].move(); // animal 클래스에 move 메소드를 가지고 있기 때문에 오버라이드가 가능하고, 상속(검은차) 후 오버라이드를 하면 흰색차로 도색!
            // 업캐스팅이 되었더라도 상속 후의 값을 가지고 온다.
        }
//        int a = (int) 3.14; // 다운캐스팅 double 자료형을 int 자료형에 대입 (명시적형변환 필수)
//        double d = 3; // 업캐스팅 (묵시적형변환 가능)

        // 다운캐스팅

//        for(int i = 0; i < animals.length; i++){
//            Human h = (Human) animals[i]; // 다운캐스팅
//            h.readBooks(); // readBooks호출이 가능하다.
//
//        }// 반복으로 animals[1]이 되면 Tiger를 Human에 넣을 수가 없다.

        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Human){ // instanceof
                Human h = (Human) animals[i];
                h.readBooks();
            } else if(animals[i] instanceof Tiger){
                Tiger t = (Tiger) animals[i];
                t.hunting();
            } else {
                System.out.println("다운 캐스팅 불가");
            }
        }


        animal.move();
        human.move(); // human 클래스의 move정의로 변경
        tiger.move();

        human.readBooks();
        tiger.hunting();

//        hAnimal.  // readBooks가 뜨지 않는다.
    }
}
