import java.util.Scanner;

public class D4java2 {

	private static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入單一的英文字母!");
		scn = new Scanner(System.in);
		String str = scn.next();
		if (str.length() == 1) {
			char v1 = str.charAt(0);
			switch (v1) {
			case 'A':
				System.out.println(v1 + "來自台北市");
				break;
			case 'B':
				System.out.println(v1 + "來自台中市");
				break;
			case 'C':
				System.out.println(v1 + "來自基隆市");
				break;
			case 'D':
				System.out.println(v1 + "來自台南市");
				break;
			case 'E':
				System.out.println(v1 + "來自高雄市");
				break;
			case 'F':
				System.out.println(v1 + "來自台北縣");
				break;
			case 'G':
				System.out.println(v1 + "來自宜蘭縣");
				break;
			case 'H':
				System.out.println(v1 + "來自桃園縣");
				break;
			case 'J':
				System.out.println(v1 + "來自新竹縣");
				break;
			case 'K':
				System.out.println(v1 + "來自苗栗縣");
				break;
			case 'L':
				System.out.println(v1 + "來自台中縣");
				break;
			case 'M':
				System.out.println(v1 + "來自南投縣");
				break;
			case 'N':
				System.out.println(v1 + "來自彰化縣");
				break;
			case 'P':
				System.out.println(v1 + "來自雲林縣");
				break;
			case 'Q':
				System.out.println(v1 + "來自嘉義縣");
				break;
			case 'R':
				System.out.println(v1 + "來自台南縣");
				break;
			case 'S':
				System.out.println(v1 + "來自高雄縣");
				break;
			case 'T':
				System.out.println(v1 + "來自屏東縣");
				break;
			case 'U':
				System.out.println(v1 + "來自花蓮縣");
				break;
			case 'V':
				System.out.println(v1 + "來自台東縣");
				break;
			case 'X':
				System.out.println(v1 + "來自澎湖縣");
				break;
			case 'Y':
				System.out.println(v1 + "來自陽明山");
				break;
			case 'W':
				System.out.println(v1 + "來自金門");
				break;
			case 'Z':
				System.out.println(v1 + "來自馬祖");
				break;
			case 'I':
				System.out.println(v1 + "來自嘉義市");
				break;
			case 'O':
				System.out.println(v1 + "來自新竹市");
				break;
			default:
				System.out.println("沒有這個地方!!");
			}
		}else{
			System.out.println("沒有這地方哦!");
		}

	}

}
