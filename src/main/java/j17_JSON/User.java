package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize (Object -> Json)
 * deserialize (Json -> Object)로 변환할 때
 *  
 * 
 */

@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)
	private String username;
	@Expose(serialize = false, deserialize = false) // serialize : 객체가 json문자열로 변환될 때(포함할 것인가 아닌가)
 	private String password;
	@Expose(serialize = true, deserialize = false) // deserialize : json이 Object로 변환될 때(포함할 것인가 아닌가)
	private String name;
	@Expose(serialize = true, deserialize = true) 
	// 모든 필드에 사용하여야한다. 기본값이 true로 자동 생성되지 않는다.  
	private String email;
	
}












