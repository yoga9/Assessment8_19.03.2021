class StringEg1{
	public static void main(String args[]) {
		
		String Name = "Yogeshwari Karnan";
		
		System.out.println("String contains() Method");      //contains - T/F
		System.out.println(Name.contains("Karnan"));      
		System.out.println(Name.contains("Yoga"));
		System.out.println(Name.contains("karnan")); //---Case sensitive
	
System.out.println("");
	    System.out.println("String compareTo() Method");
	    String s1 = "Vizhali";
	    String s2 = "Mona";
	    String s3 = "";
	    String s4 = "Yoga";
	    String s5 = "Mona";
	    String s6 =null;
	    
	    System.out.println(s1.compareTo(s2));      //+ve Greater_than
	    System.out.println(s2.compareTo(s5));     //0    equal 
	    System.out.println(s3.compareTo(s4));     //-ve  less_than
        
System.out.println("");
        System.out.println("String replace() Method");   
        String replaceStr = s4.replace("Yoga", "Yogeshwari");
        System.out.println(replaceStr);
        
System.out.println("");
        System.out.println("String isEmpty() Method");
        System.out.println(s1.isEmpty());            //F  --- Length is Not 0
        System.out.println(s3.isEmpty());           //T  --- Length is 0
        System.out.println(s3.length());    
        System.out.println(s6.isEmpty());     //Exception 
        

       
}
	
}
