public class File9 {
    static int x = 10; // non static variable
	public static void main(String[] args) {
		File9 obj = new File9();
		obj.x = 50;
System.out.println("value = "+ obj.x); // 50
File9 obj2 = new File9();
System.out.println("value = "+ obj2.x); // 50
	}

}