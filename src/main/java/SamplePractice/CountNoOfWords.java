package SamplePractice;

public class CountNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "I love my India";
		String word = "love";
		occurance (s,word);
		

			}

			private static void occurance(String s, String word) {
				// TODO Auto-generated method stub
				
				String temp[]=s.split("");
				int count = 0 ;
				for (int i =0;i<s.length();i++) {
					if (word.equals(temp[i])) {
						count++;
						System.out.println(count);
					}
				}

	}

}
