package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class UserRepository {
	
	@Getter
	private List<Map<String,Object>> userList;
	
	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);
	}
	public Map<String, Object> findUserByUsername(String username){
		Map<String, Object> userMap = null;
		
		for(Map<String, Object> user : userList) { // Object
			String _username = (String) user.get("username"); // 같은 변수명 중복사용 불가 : 앞에 언더바 사용(임시사용)
			if(_username.equals(username)) {
				userMap = user;
				break;
			}
		}
		return userMap;
	}
	
	public void modifyPasswordByUsername(String username, String newPassword) {
		Map<String, Object> userMap = findUserByUsername(username);
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; // 메소드 강제로 빠져나가는 것
		}
		userMap.replace("password", newPassword);
		
				
	}

	public void deletUserByUsername(String username) {// userList에서 값을 제거
		Map<String, Object> userMap = findUserByUsername(username);
		if(userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; // 메소드 강제로 빠져나가는 것
		}		
		int userIndex = userList.indexOf(userMap);
		userList.remove(userIndex);		
	}
}