package Stringconceptprograms;

public class number12 {
	public static void main(String[] args) {
	    String str = "Aruna maheswari";
	    String words[]=str.split("\\s");
	    System.out.println(str);
        String newString ="";
        
        for(String w: words){
            String first = w.substring(0,1);     
            String rest = w.substring(1);       
     
            newString+=first.toUpperCase()+ rest+ " ";  
        }  
        System.out.println(newString.trim());
	}


}





