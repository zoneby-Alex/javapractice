public class CarLoan { // 定义CarLoan类
	public static void main(String[] args) { // 主方法入口
      int carloan = 10000; // 车贷总额为10000
      int loanLength = 3; // 贷款期限为3年
      int interestRate = 5; // 利率为5%
      int downPayment = 2000; // 首付为2000
      int remainingBalance = carloan - downPayment; // 剩余余额为车贷总额减去首付
      int months= loanLength*12; // 贷款期限转换为月数
      int monthlyBalance = remainingBalance / months; // 每月应还余额
      int interest=(monthlyBalance*interestRate)/100; // 每月利息
      int monthlyPayment=monthlyBalance+interest; // 每月还款额
    if (loanLength<=0||interestRate<=0){ // 如果贷款期限或利率小于等于0
      System.out.println("Error! You must take out a valid car loan."); // 输出错误信息
    }
    else if(downPayment>=carloan){ // 如果首付大于等于车贷总额
      System.out.println("The car can be paid in full."); // 输出全款支付信息
    }
    else { // 否则
      System.out.println(monthlyPayment); // 输出每月还款额
    }
	}
}