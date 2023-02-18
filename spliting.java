package Day4;

public class spliting {
	public static void main (String[]args) {
		String h = "arun@ajay@kishore@ram";
		String [] s = h.split("@");
       System.out.println(s[2]+"\n"+ s[0]);
       
       String k = "hello";
       String d[] = k.split ("l") ;
       System.out.println(d[0]);
       System.out.println(d[1]);
       System.out.println(d[2]);
       
       
       String w = "Aa1Bb2Cc3";
    		   String []y = w.split("[\\d]");
    		   String []Q = w.split("[\\D]");
    		   System.out.println(y[0]);
    		   System.out.println(Q[0]);
    		   
       
	}

}
