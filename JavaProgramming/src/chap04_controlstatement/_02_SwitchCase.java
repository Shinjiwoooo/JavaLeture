package chap04_controlstatement;

public class _02_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		
		
		switch(grade) {
			case "A":
				System.out.println("90점 이상입니다.");
				break;
			case "B":
				System.out.println("80점 이상입니다.");
				break;
			case "C":
				System.out.println("70점 이상입니다.");
				break;
			case "D":
				System.out.println("60점 이상입니다.");
				break;
			default:
				System.out.println("60점 미만입니다.");
		}
	}

}
