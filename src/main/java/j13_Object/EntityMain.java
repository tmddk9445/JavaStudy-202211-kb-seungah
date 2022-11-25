package j13_Object;

public class EntityMain {
    public static void main(String[] args) {
        Entity entity = new Entity("김준일", 29, "부산 동래구 사직동");
        Entity entity2 = new Entity("김준일", 29, "부산 동래구 사직동");

        System.out.println(entity);
        System.out.println("----------");

        System.out.println(entity.equals(entity2)); // 값 비교 : true
        System.out.println(entity.hashCode()); // hashCode(주소)
        System.out.println(entity2.hashCode()); // objects : true

        System.out.println(entity.getAddress());

        System.out.println(Entity.class); // 주소값 출력

//        Class c = Entity.class;

        Object obj = new Student(20220001, "김준일");

        System.out.println(Entity.class == entity.getClass()); // Entity.class - static (객체 생성 없이 사용가능하다.)
        System.out.println(Entity.class.equals(obj.getClass())); // 두개의 클래스가 다르다. (Student는 Entitiy로 만들어진 것이 아니다.) Object로...?????
        System.out.println(obj instanceof Entity);
    }
}
