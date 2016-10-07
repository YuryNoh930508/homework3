import java.util.*;

class B04 {
  int salary;
  double tax;
  
  void init() {
    this.input();
    this.print();
  }
  void input() {
    Scanner s = new Scanner(System.in);
    System.out.print("연봉을 입력하시오(만 단위): ");
    this.salary = s.nextInt();
    this.print();
  }
  void print() {
    if(salary < 1000)
      tax = salary * 9.5%;
    else if(salary >= 1000)
      tax = salary * 19%;
    else if(salary >= 4000)
      tax = salary * 28%;
    else
      tax = salary * 37%;
    System.out.println("연봉 금액에 대한 소득세는 " + tax + "만원 입니다.");
  }
  public static void main(String args[]) {
    new B04().init();
  }
}
