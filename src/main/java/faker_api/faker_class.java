package faker_api;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class faker_class {

	public static void main(String[] args) {

    	Faker faker = new Faker();  
    	
    	
    	String mail= faker.internet().emailAddress(); 
    	
    	System.out.println(mail);
    	
    	String ref_email=  faker.internet().emailAddress();
    	
    	System.out.println(ref_email);
    	
   	    int  number =faker.number().numberBetween(10, 1000);
      	 System.out.println(number); 
   	  
   	     String F_name=faker.name().firstName();
   	   
   	  System.out.println(F_name);
   	     String L_name = faker.name().lastName();
   	     
   	  System.out.println(L_name);
   	     
   	     PhoneNumber  phone =faker.phoneNumber();
   	 
   	  System.out.println(phone);
   	     
   	     Address address =faker.address();
   	     
   	     String phn=String.valueOf(phone);
   	     
   	    String addrs=String.valueOf(address);
   	 System.out.println(mail);
   	 
   	    String adress_l2 = String.valueOf(faker.address());
    	   
   	 System.out.println(adress_l2);

		String city=faker.address().city();
		
		String country=faker.address().country();
		 String pin=faker.address().zipCode();
		 
		String state=faker.address().state();
		
		
	}
	
	
}
