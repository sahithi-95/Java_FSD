package corejava;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String e="sahithi@gmail.com";
      int at= e.indexOf('@');
      int ad= e.indexOf('.');
      if((at==e.lastIndexOf('@')) && (ad==e.lastIndexOf('.')) && at<=4 )
     
      System.out.println("valid");
      
      else
      System.out.println("Invalid");
        
    
	}

}
