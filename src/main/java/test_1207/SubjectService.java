package test_1207;

import java.util.Arrays;
import java.util.List;

class SubjectService {
	private List<String> subjects;

	public SubjectService(List<String> subjects) {
		this.subjects = subjects;
	}

	public void showSubjects() { 
		int length = 4;

		try {

			for (int i = 0; i < length; i++) {
				System.out.println(subjects.get(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

}
