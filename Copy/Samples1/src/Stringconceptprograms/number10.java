package Stringconceptprograms;

public class number10 {
	public static void main(String args[])
	{
		
	int ccount = 0, vcount = 0;       
    String str = "Aruna maheswari";    
    str = str.toLowerCase(); 
    System.out.println(str);
        
    for(int i = 0; i < str.length(); i++) {    
        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
        {    
            vcount++;    
        }    
        else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
        {      
            ccount++;    
        } 
        else if(str.charAt(i)==' ')
        {
        	
        }
    }    
    System.out.println("Number of vowels: " + vcount);    
    System.out.println("Number of consonants: " + ccount);    
}
}


