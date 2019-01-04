package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginMain {

	public static void main(String[] args) throws UserNotFoundException, PasswordDismatchException {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		User user=null;
		boolean sid=false;
		boolean spw=false;
		for(int i=0;i<joinUsers.size();i++)
		{
			user = joinUsers.get(i);
			if(user.getId().equals(id))
				sid=true;
			if(user.getPassword().equals(password))
				spw=true;
		}
		
		if(sid&&spw)
			System.out.println("로그인성공");
		else if(sid&&!spw) {
			throw new PasswordDismatchException();
		}
		else if(!sid)
		{
			throw new UserNotFoundException();
		}
		/* -1 return 해서 if로 처리 
		 *  로그인 처리 부분을 완성 합니다.
		 */
		

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}
}
