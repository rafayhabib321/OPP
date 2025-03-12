package question_3;

public class Bulb {
private boolean on = true;

void turn_on() {
	if(on==true) {
		System.out.println("on\n");	
	}else if(on==false){
		on=true;
		System.out.println("on\n");
	}
	
}
void turn_off() {
	if(on==true) {
		on=false;
	System.out.println("off\n");
	}else {
		System.out.println("off\n");
	}
}
void showstatus() {
	if(on==true) {
		System.out.println("The bulb is on\n");
	}else if(on==false) {
		System.out.println("The bulb is off\n");
	}
}
}
