package j18_예외;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class CustomException extends RuntimeException {
	// alt shift s
	private static final long serialVersionUID = 1L; // 노란줄 뜨면 실행해야된다. - 직렬화 때문에

	Map<String, String> errorMap;

	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Map<String, String> errorMap) {
		super();
		this.errorMap = errorMap;
	}

	public CustomException(String message, Map<String, String> errorMap) {
		super(message);
		this.errorMap = errorMap;
	}

	public void printErrorMap() {
		Objects.requireNonNull(errorMap); // 만약에 errorMap이 null인 경우에 여기서 nullPointException을 나타내고 그 아래는 실행X

		for (Entry<String, String> entry : errorMap.entrySet()) {
			System.out.println(entry.getKey() + ">>> " + entry.getValue());
		}

		System.out.println();
	}
}
