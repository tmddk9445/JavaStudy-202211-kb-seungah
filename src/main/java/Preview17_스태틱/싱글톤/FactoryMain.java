package Preview17_스태틱.싱글톤;

public class FactoryMain {

    public static void main(String[] args) {

        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장"); // new 새로운 주소들
        // 공장은 다르더라도 회사는 한개!
        // 회사에서 serial 넘버를 관리!
        // 공장이 회사에서 serial넘버를 getInstance를 통해 받아간다.

        SmartPhone smartPhone1 = factory1.produceSmartPhone();
        SmartPhone smartPhone2 = factory2.produceSmartPhone();
        SmartPhone smartPhone3 = factory3.produceSmartPhone();
        SmartPhone smartPhone4 = factory4.produceSmartPhone();

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4); // serial이 1씩 증가한다.




    }
}
