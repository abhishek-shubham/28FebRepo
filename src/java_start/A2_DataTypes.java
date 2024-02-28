package java_start;

public class A2_DataTypes {

	public static void main(String[] args){
		System.out.println(0.0/2.0);
		
		char t = 'A';
		System.out.println(t);
		System.out.println(++t);
		System.out.println((int)++t);
		System.out.println((byte)++t);
		System.out.println((double)++t);
		System.out.println((float)++t);

		char ch ='I';
		switch (ch) {
		case 'A':
			System.out.println(ch +" : is vowel");
			//break;
		case 'E':
			System.out.println(ch +" : is vowel");
			break;
		case 'I':
			System.out.println(ch +" : is vowel");
			//break;
		case 'O':
			System.out.println(ch +" : is vowel");
			break;
		default:
			System.out.println(ch +" : is consonent");
			break;
		}
	}
}
