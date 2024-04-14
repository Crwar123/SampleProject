package SamplePractice;

public class Reverse_String {

	public static void main(String[] args) {
		String s = "Chaianya";
		StringBuilder s2 = new StringBuilder();
		s2.append(s);
		s2 = s2.reverse();
		System.out.println(s2);

//	String a = "Prashant ";
//	StringBuilder b= new StringBuilder();
//	b.append(a) ;
//	b=b.reverse();

		String name = "Chaitanya War";
		char chars[] = name.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.println(chars[i]);

		}

//	
//	String a= "chaitanya war";
//	StringBuilder b= new StringBuilder();
//	b.append(a);
//	b=b.reverse()

		String a = "Chaitnya war";
		StringBuilder b = new StringBuilder();
		b.append(a);
		b = b.reverse();

		String st = "Jituwar";
		char c[] = st.toCharArray();
		for (int j = c.length - 1; j >= 0; j--) {
			System.out.println(c[j]);

			String s1 = "PrashantBobade";
			char c1[] = s1.toCharArray();
			for (int k = c1.length - 1; k >= 0; k--) {
				System.out.println(c[k]);

				String ss2 = "AvinashAwasare";
				char c2[] = ss2.toCharArray();
				for (int l = c2.length - 1; l >= 0; l--) {
					System.out.println(c2[l]);
				}
				String s3 = "FIRST JAVA";
				char c3[] = s3.toCharArray();
				for (int m = c3.length - 1; m >= 0; m--) {
					System.out.println(c3[m]);
				}
				
				String s4= "Automation ";
				char c4[]=s4.toCharArray();
				for(int n=c4.length-1;n>=0;n--) {
					System.out.println(c4[n]);
				}
				}

		}

	}
}
