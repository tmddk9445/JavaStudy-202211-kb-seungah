package test_1207;

import j17_JSON.User;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class Company {
	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;

}




//User user = User.builder()
//.username("junil")
//.password("1234")
//.name("김준일")
////.email("junil1218@gmail.com") // 주석 처리할 경우 : null은 형변환이 일어나지 않는다.
//.build();
//
//System.out.println(user);
//
//Gson gson = new GsonBuilder()
//.setPrettyPrinting()
//.serializeNulls() // 주석처리 된 부분도 형변환하여 null표시를 하게 된다. 
//.excludeFieldsWithoutExposeAnnotation() // serialize 실행하기 위해서 사용
//.create();
//
//String userJson = gson.toJson(user);
