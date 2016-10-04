package homework3;
import java.util.*;

public class B02 {
	double stdMetric_area;
	double korMetric_area;
	
	public void init() {
		this.input();
		this.print();
	}
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적(제곱미터)을  입력하시오: ");
		this.stdMetric_area = s.nextDouble();
		
		this.korMetric_area = stdMetric_area/3.305;
	}
	public void print() {
		String size = "";
		
		if(this.korMetric_area < 15)
			size = "소형";
		else if(this.korMetric_area < 30)
			size = "중소형";
		else if(this.korMetric_area < 50)
			size = "중형";
		else
			size = "대형";
		
		System.out.printf("%.1f평 %s 아파트 입니다.", this.korMetric_area, size);	
	}

	public static void main(String[] args) {
		new B02().init();
	}

}