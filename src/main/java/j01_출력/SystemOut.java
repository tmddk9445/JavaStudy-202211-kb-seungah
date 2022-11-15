package j01_출력;

public class SystemOut {
    public static void main(String[] args) {
        System.out.print("이름 : ");
        System.out.println("이승아");
        // \n : 줄바꿈,\t : tab 띄어쓰기, \ 출력 \\ 입력 (이스케이프 문자 : 앞에 \가 붙은 문자)
        System.out.print("주소 : ");
        System.out.println("부산 동래구 사직동"); // ctrl shift F10 실행단축기
        System.out.print("연락처 : ");
        System.out.println("010-9988-1916"); // println 항상 줄바꿈 실행
        System.out.print("성별 : ");
        System.out.println("남성");
        // 단축기 sout입력 + enter
        // 명령의 끝엔 항상 세미클론을 붙여야한다.
    }
}

// 클래스 파일은 파일명을 대문자로 시작한다.(무조건)