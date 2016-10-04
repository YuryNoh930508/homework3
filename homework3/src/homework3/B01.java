package homework3;
import java.util.*;

public class B01 {
	int num1, num2, num3;
	int max_num, min_num;
	
	public void init() {
		this.input();
		this.print();
	}
	
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력 하시오: ");
		this.num1 = s.nextInt();
		System.out.print("두 번째 숫자를 입력 하시오: ");
		this.num2 = s.nextInt();
		System.out.print("세 번째 숫자를 입력 하시오: ");
		this.num3 = s.nextInt();
	}
	
	public void print() {
		if(this.num1 < this.num2) {
			this.min_num = this.num1;
			this.max_num = this.num2;
		}
		else {
			this.min_num = this.num2;
			this.max_num = this.num1;
		}
		if(this.max_num < num3)
			this.max_num = this.num3;
		else if(this.min_num > num3)
			this.min_num = this.num3;
		
		System.out.println("가장 큰 수는 " + this.max_num + "이고, 가장 작은 수는 " + this.min_num + " 입니다.");
	}

	public static void main(String[] args) {
		new B01().init();
	}
	
}