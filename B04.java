import java.util.*;

class B04 {
  double salary;
  double tax;
  
  void init() {
    this.input();
    this.print();
  }
  void input() {
    Scanner s = new Scanner(System.in);
    System.out.print("연봉을 입력하시오: ");
    this.salary = s.nextDouble();
  }
  void print() {
    if(salary >= 80000000)
      this.tax = (int)(this.salary * (37.0f/100.0f));
    else if(this.salary >= 40000000)
      this.tax = (int)(this.salary * (28.0f/100.0f));
    else if(salary >= 10000000)
      this.tax = (int)(this.salary * (19.0f/100.0f));
    else
      this.tax = (int)(this.salary * (9.5f/100.0f));
    System.out.println("연봉 금액에 대한 소득세는 " + tax + "만원 입니다.");
  }
  public static void main(String args[]) {
    new B04().init();
  }
}
