import java.util.Scanner;

public class D4java2 {

	private static Scanner scn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�п�J��@���^��r��!");
		scn = new Scanner(System.in);
		String str = scn.next();
		if (str.length() == 1) {
			char v1 = str.charAt(0);
			switch (v1) {
			case 'A':
				System.out.println(v1 + "�Ӧۥx�_��");
				break;
			case 'B':
				System.out.println(v1 + "�Ӧۥx����");
				break;
			case 'C':
				System.out.println(v1 + "�Ӧ۰򶩥�");
				break;
			case 'D':
				System.out.println(v1 + "�Ӧۥx�n��");
				break;
			case 'E':
				System.out.println(v1 + "�Ӧ۰�����");
				break;
			case 'F':
				System.out.println(v1 + "�Ӧۥx�_��");
				break;
			case 'G':
				System.out.println(v1 + "�Ӧ۩y����");
				break;
			case 'H':
				System.out.println(v1 + "�Ӧۮ�鿤");
				break;
			case 'J':
				System.out.println(v1 + "�Ӧ۷s�˿�");
				break;
			case 'K':
				System.out.println(v1 + "�Ӧۭ]�߿�");
				break;
			case 'L':
				System.out.println(v1 + "�Ӧۥx����");
				break;
			case 'M':
				System.out.println(v1 + "�Ӧ۫n�뿤");
				break;
			case 'N':
				System.out.println(v1 + "�Ӧ۹��ƿ�");
				break;
			case 'P':
				System.out.println(v1 + "�Ӧ۶��L��");
				break;
			case 'Q':
				System.out.println(v1 + "�Ӧ۹Ÿq��");
				break;
			case 'R':
				System.out.println(v1 + "�Ӧۥx�n��");
				break;
			case 'S':
				System.out.println(v1 + "�Ӧ۰�����");
				break;
			case 'T':
				System.out.println(v1 + "�Ӧ̪۫F��");
				break;
			case 'U':
				System.out.println(v1 + "�Ӧ۪Ὤ��");
				break;
			case 'V':
				System.out.println(v1 + "�Ӧۥx�F��");
				break;
			case 'X':
				System.out.println(v1 + "�Ӧۼ��");
				break;
			case 'Y':
				System.out.println(v1 + "�Ӧ۶����s");
				break;
			case 'W':
				System.out.println(v1 + "�Ӧ۪���");
				break;
			case 'Z':
				System.out.println(v1 + "�Ӧ۰���");
				break;
			case 'I':
				System.out.println(v1 + "�Ӧ۹Ÿq��");
				break;
			case 'O':
				System.out.println(v1 + "�Ӧ۷s�˥�");
				break;
			default:
				System.out.println("�S���o�Ӧa��!!");
			}
		}else{
			System.out.println("�S���o�a��@!");
		}

	}

}
