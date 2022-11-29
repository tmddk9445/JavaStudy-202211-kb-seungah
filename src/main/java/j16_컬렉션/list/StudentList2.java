package j16_컬렉션.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {

    public static void main(String[] args) {
        //        // 위의 공식을 풀이한 것
//        String[] names = new String[] {"김준일", "김준이", "김준삼"};
//        // 문자열 배열 생성, names에 주소입력
//        List<String> nameList;//
//        nameList = Arrays.asList(names);
//        // 배열의 기능 : asList메소드 - 배열을 담으면 List로 변경해준다. (List로 반환)
//        List<String> nameList = Arrays.asList(new String[] {
//                "김준일",
//                "김준이",
//                "김준삼"
//        });
        //           Object[] nameArray = (String[])nameList.toArray(); // 배열 자체를 다운캐스팅 X
//        Object[] nameArray = nameList.toArray();
//        System.out.println((String)nameArray[0]);
//        안에 있는 값들을 하나씩 다운캐스팅 해야한다.
//        객체일 경우 메소드를 사용할 때 다운캐스팅을 꼭 해주어야 사용이 가능하다.

//        for(Hobby h : hobbyList){
//            System.out.println(h);
//        }
        // 배열을 리스트로 변경하는 법
        // 객체 생성 후 배열에 담아서 List로 생성
        List<Hobby> h1 = Arrays.asList(new Hobby[]{
                new Hobby(1, "축구"), // 매개변수가 두 개 : AllArgsConstructor가 있다.(Builder)
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상")
        });

        Student s1 = Student.builder()
                .studentId(20220001)
                .name("고동현")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[]{h1.get(0), h1.get(2)}))
                .build();

        Student s2 = Student.builder()
                .studentId(20220002)
                .name("강동욱")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[]{h1.get(1), h1.get(3)}))
                .build();

        Student s3 = Student.builder()
                .studentId(20220003)
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[]{h1.get(0), h1.get(3)}))
                .build();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for (Student s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + " 학생 취미>");
            for (Hobby h : s.getHobbyList()) {
                System.out.println(h);
            }
            System.out.println();
        }
    }
}
