package homework3;
import java.util.*;

public class B03 {
	int month, day, dayCount = 0;
	
	public void init() {
		this.print();
		if(this.month > 0 && this.month <= 12)
			this.input();
		else
			System.out.println("잘못 입력하셨습니다");
	}
	public void print() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하시오: ");
		this.month = s.nextInt();
		System.out.print("일을 입력하시오: ");
		this.day = s.nextInt();
	}
	public void input() {
		int[] day30 = {4, 6, 9, 11};
		int[] day31 = {1, 3, 5, 7, 8, 10, 12};
		
		for(int i=1;i<this.month;i++) {
			if(i == 2) {
				this.dayCount += 28;
				continue;
			}
			for(int j=0;j<day31.length;j++) {
				if(i == day31[j]) {
					this.dayCount += 31;
					break;
				}
				else if(j < day30.length && i == day30[j]) {
					this.dayCount += 30;
					break;
				}
			}
		}
		
		System.out.println("이 날짜는 1년 중 " + (dayCount + this.day) + " 번째 날에 해당됩니다.");
	}

	public static void main(String[] args) {
		new B03().init();
	}

}