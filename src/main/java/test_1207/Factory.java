package test_1207;

import java.util.Scanner;

import j14_스태틱.싱글톤.ScannerSingleton;
import lombok.Getter;

public class Factory {

	private static Factory factoryName = null;

	private Scanner scanner;

	private Factory() {
		scanner = new Scanner(System.in);
	}

	public static Factory getFactoryName() {

		if (factoryName == null) {
			factoryName = new Factory();

		}
		return factoryName;
	}

}
