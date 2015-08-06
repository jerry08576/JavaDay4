import java.util.Scanner;
public class D4java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("星期幾?!");
		int D = scn.nextInt();
		switch(D){
		case 1:
			System.out.println(D+"=Monday");
			break;
		case 2:
			System.out.println(D+"=Tuesday");
			break;
		case 3:
			System.out.println(D+"=wednesday");
			break;
		case 4:
			System.out.println(D+"=Thursday");
			break;
		case 5:
			System.out.println(D+"=Friday");
			break;
		case 6:
			System.out.println(D+"=Saturday");
			break;
		case 7:
			System.out.println(D+"=Sunday");
			break;
			default:
				System.out.println("沒有這一天!!");
		}
		

	}

}
