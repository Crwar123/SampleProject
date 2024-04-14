package SamplePractice;

public class Month_Validation {

	public static void main(String[] args) {

		System.out.println("Start");
		char Month = 'z';
		switch (Month) {
		case 'J':
			System.out.println("In February");
			break;
		case 'F':
			System.out.println("In Feruary");
			break;
		case 'M':
			System.out.println("In March");
			break;
		default:
			System.out.println("Invalid Month");
		}

	}

}
