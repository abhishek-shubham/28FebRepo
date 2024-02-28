package java_start;

public class A09_ThrowCustomizeException {

	public static void main(String[] args) {

		String data = null;
		if(data == null){
			try{
				throw new Exception("DataNotFoundException");
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		try {
			System.out.println(data.length());
		}
		catch(NullPointerException e){
			System.out.println("can not calculate length");
		}
		System.out.println("bye");
		}
		
	}


