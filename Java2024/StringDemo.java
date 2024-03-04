 class StringDemo {
    public static void main(String[] args) {
        String s1=new String("gpt zalaki");
        String s2="GPT ZAKALI";
        System.out.println("the string s1 is:"+s1);
        System.out.println("the string s2 is:"+s2);
        System.out.println("the lenght of s1 is:"+s1.length());
        System.out.println("the lenght of s2 is:"+s2.length());
        System.out.println("the string of s1 in UpperCase:"+s1.toUpperCase());
        System.out.println("the string of s2 in lowerCase:"+s2.toLowerCase());
        System.out.println("The first occurence of a at the position:"+s1.indexOf('a'));
        System.out.println("the equals to s2:"+s1.equals(s2));
        System.out.println("s1 equals ignore case to s2:"+s1.equalsIgnoreCase(s2));
        System.out.println("Character at an index of 6 is:"+s1.charAt(6));
        String s3=s1.substring(4, 8);
        System.out.println("Extracted substring is:"+s3);
        System.out.println("After replacing a with b in s1:"+s1.replace('a', 'b'));
        System.out.println("After String concat:"+s1.concat("Karnatak"));
        String s4="This is a book";
        System.out.println("The string s4 is:"+s4);
        int result =s1.compareTo(s2);
        System.out.println("After String trim:"+s4.trim());
        if (result==0)
        System.out.println(s1+"is equal to"+s2);
        else if(result>0)
        System.out.println(s1+" is greater than "+s2);
        else
        System.out.println(s1+" is smaller than "+s2);

       
        
         
            
    
    }
    }
