package j16_컬렉션.list;

import java.util.ArrayList;

public class StackList {
    public static void main(String[] args) {

        // 임지현, 신경수, 고희주, 문승주, 장건녕, 박수현, 황석민, 박준현

        ArrayList<String> stack = new ArrayList<String>();
//        stack.add("임지현");
//        stack.add(0, "신경수");
//
//        for(String name : stack){
//            System.out.print(name);
//            if(!name.equals(stack.get(stack.size()-1))){
//                System.out.print(", ");
//                // 마지막 인덱스랑 같으면 , 찍고
//                // 같지 않으면 찍지 않는다.
//            }
//        }
        stack.add("임지현");
        stack.add("신경수");
        stack.add("고희주");
        stack.add("문승주");
        stack.add("장건녕");
        stack.add("박수현");
        stack.add("황석민");
        stack.add("박준현");

//         번호가 필요하기 때문에 foreach사용 불가 -> 일반반복 사용
//        int size = stack.size();
//        for(int i = 0; i < size; i++){
//            System.out.print(stack.remove(size - i - 1));
//            // 반복될 수록 size가 줄어드는 것을 방지하기 위해 size를 선언한다.
//            // 제거된 값을 출력 -> stack이기 때문에 제일 마지막 입력값부터 출력된다.
//            // List의 size가 8이기 때문에 마지막 인덱스 번호는 size - 1
//        }

        // String removeData = strList.remove(2);
        //        System.out.println(removeData);

//        // 다른 List에 옮기기

        ArrayList<String> copyList = new ArrayList<String>();
        int size = stack.size();

        for(int i = 0; i < size; i++){
            copyList.add(0, stack.remove(size - i - 1));
        }
        System.out.println(copyList);
//        출력시 배열처럼 출력된다.
    }
}
