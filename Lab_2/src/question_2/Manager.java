package question_2;

public class Manager {
	private int pass = 1234;
	
	void changepassword(int oldpass,int newpass) {
		if(oldpass!=pass){
			System.out.println("The old password is invalid");
		}else if (pass==oldpass) {
			pass=newpass;
			System.out.println("Password update");
		}	
	}
	void validatepassword(int newpass) {
		if(newpass==pass) {
			System.out.println("Correct Password");
		}else {
			System.out.println("Invalid Password");
		}
	}
	
}
