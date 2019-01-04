package prob05;

public class UserNotFoundException extends Exception {

	public UserNotFoundException()
	{
		super("사용자를 찾을수가 없습니다.");
		System.out.println(super.getMessage());
	}
}
