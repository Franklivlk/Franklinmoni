package Day4;

public class booleanmethods {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hello";
		boolean equal = a.equals(b);
		System.out.println(equal);
		String ab = "Hello";
		String bc = "hello";
		boolean isequal = ab.equalsIgnoreCase(bc);
		System.out.println(isequal);
		System.out.println(ab.equalsIgnoreCase("hello"));

		String p = "FRANKLIN";

		boolean Q = p.contains("ANK");
        boolean r = p.startsWith("FRAN");
		boolean s = p.endsWith("LIN");
		boolean t = p.contains("FKN");
		System.out.println(Q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);

	}
	


}
