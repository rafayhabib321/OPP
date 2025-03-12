package question_1;

public class Books {
	
private String title = "Ray";
private String author = "Eleceed";
private boolean issued = false;

void issuebook(String book,String name){
if(title==book && author==name) {
 if(!issued) {
		System.out.println("The "+book+" is not available");
	}
}
else if(title!=book && author!=name) { 	 
			System.out.println("The "+book+" is available");
		}
	
}  
}
