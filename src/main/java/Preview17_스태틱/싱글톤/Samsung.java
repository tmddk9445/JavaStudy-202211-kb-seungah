package Preview17_스태틱.싱글톤;

import lombok.Getter;

public class Samsung {

    @Getter
    private String company; // field위에 String company만 Getter를 가진다.
    private int serialNumber; // static이 아니다!

    private static Samsung instance = null; // 변수 : getSamsung 메소드 안에서 사용하기 위해 static으로 설정, Samsung은 instance(객체)이다.

    // 싱글 톤을 사용하기 위해서는 생성자의 접근지정자를 private으로 두어야한다. (하나만 딱 생성해야하기 때문에 외부에서 생성할 수 없도록)
    private Samsung(){ // 생성자 호출은 단 한번 밖에 이루어지지 않는다. (생성이 단 한번 뿐이기 때문에)
        company = getClass().getSimpleName(); // company 변수안에 클래스 명이 들어가도록 : 클래스 명은 클래스 class 안에 들어가 있다.
        serialNumber = 20220000;
        // Samsung 클래스는 Object 클래스를 상속 받고 있다.
    }

    public static Samsung getSamsung(){ // 메소드가 static되어 있어야지만 외부에서 Samsung클래스를 생성하지 않고도 이 메소드를 사용할 수 있다. (static의 특성으로)
        if(instance == null){
            instance = new Samsung(); // 주소안에 값이 담겨져 있다.
        }
        return new Samsung(); // getSamsung을 할 때마다 생성하게 된다.
    }

    public static Samsung getInstance() {
        if(instance == null){
            instance = new Samsung(); // 주소안에 값이 담겨져 있다.
        }
        return instance;
    }
    // 생성하고 나서는 instance. 하면 주소값이다. (안에 있는 메소드 전부 사용 가능)

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }


}

// 싱글톤 패턴
// 자바의 디자인 패턴 : 생성 : 객체를 생성할 때, 구조 : 객체를 설계하거나 사용할 때(전체적인 틀을 짤 때), 행동 : 실행되어 지는 것들 (메소드를 설계하는 방법 : 하나의 객체로 묶임)

// Builder, Singleton 패턴

// singleton : 클래스에 인스턴스가 하나만 있도록 하면서 이 인스턴스에 대한 전역(어디서든지) 접근지점을 제공합니다.

// 싱글턴 패턴(Singleton pattern)을 따르는 클래스는, 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고
// 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.

/*
 * 싱글톤 사용 목적
 * 프로그램 내에서 하나의 객체만 존재해야 한다.
 * 프로그램 내에서 여러 부분에서 해당 객체를 공유하여 사용해야한다.
 */
