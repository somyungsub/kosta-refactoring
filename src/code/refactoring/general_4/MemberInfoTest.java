package code.refactoring.general_4;

public class MemberInfoTest {

	public static void main(String[] args) {
		IMemberInfo memberInfo = new MemberInfoImpl();
//		MemberInfoImpl memberInfo = new MemberInfoImpl();
		memberInfo.searchInform("홍사원", "010-1234-5678");
		memberInfo.runService(11, 100);		
	}
}
