package question_no_1;

public class Employee {

	double calculateBonus(int a) {
	 return(a*0.05);
	}
	
	double calculateBonus(double b,int c) {
		if(c==5){
			return(b*0.2);
		}if(c==4){
			return(b*0.15);
		}if(c==3){
			return(b*0.1);
		}if(c==2){
			return(b*0.05);
		}if(c==1){
			return(b*1);
		}else {
			return(b*0);
		}
	}
}
