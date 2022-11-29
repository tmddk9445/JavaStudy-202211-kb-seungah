package j16_컬렉션.list;

import java.util.ArrayList;
import java.util.Vector;

public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "JSP";
        strArray[2] = "Servlet";

        // 일반 반복 : 인덱스 값이 있다. (순서의 번호가 있다.)
        System.out.println("<<<<<<일반반복>>>>>>");
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println();

        //foreach : 순서를 표현하는 인덱스 값이 없다.
        System.out.println("<<<<<<foreach>>>>>>");
        for(String str : strArray){
            System.out.println(str);
        }
        // 인덱스 순서대로 뽑아낸다.
        // stack은 인덱스를 쓰지 않는다.

        ArrayList<String> strList = new ArrayList<String>(); //import java.util.ArrayList; (Alt + Enter)
        // new ArrayList<String>(); 생성할 때 크기를 지정하지 않는다.
        // (3); - (ArrayList의 생성자에)크기 지정가능하다.

        //        crud (추가 생성 조회 수정 삭제)
        // 값 추가(Create) -> add(값), add(index, 값)
        strList.add("Java");
        strList.add("Jsp");
        strList.add("Servlet"); // add 시킬 때 크기가 늘어날 수 있다.
        strList.add("Servlet"); // 크기를 지정해도 값이 추가된다.
        strList.add(1, "C++"); // add는 값을 바꿔라가 아니라 값을 추가해라 이기 때문에 이후 값이 밀린다.
        // List는 기본적으로 크기가 부족할 경우 1.5배 자동으로 늘린다.
        // 초기값이 10일 경우 자동으로 1.5배가 늘어나 15개의 공간이 할당
        // 쓰지않는 공간은 죽는다........ 요즘은 메모리가 많아서 지정안해도된다.
        // 메모리 낭비를 줄이기 위해서는 크기 지정을 하면된다.

        System.out.println("<<<<<<list foreach>>>>>>");
        for(String str : strList){
            System.out.println(str);
        }

        // 값 조회(Read) -> get(index)
        System.out.println("<<<<<<list 일반반복>>>>>>");
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
            // List에서 i번째 있는 값을 가지고 와라
            // collection에는 get이라는 메소드가 없다. (map에는 있다. - 키 값이 있을 때 있다.)
            // set같은 경우에는 get이 없다...???????
            // list는 length 대신 size를 써야하낟.
        }

        // 값 수정(Update) -> set(index, 값)
        strList.set(0, "HTML5");
        System.out.println(strList); // toString되어져있다.

        // 값 삭제(Delete) -> remove(index);
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList); // toString되어져있다.

        // 스택 - 한개씩 쌓여진 젠가
        //LIFO(Last In First Out)
    }
}
