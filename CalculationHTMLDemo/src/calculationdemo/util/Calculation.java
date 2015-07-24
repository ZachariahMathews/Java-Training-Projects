package calculationdemo.util;

public class Calculation {

	int num1,num2,result;
	char op;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}
	public Calculation(int num1, int num2, char op) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
		if(op=='+')
			result=this.num1+this.num2;
		else if(op=='-')
			result=this.num1-this.num2;
		else if(op=='*')
			result=this.num1*this.num2;
		else if(op=='/')
			result=this.num1/this.num2;
		else
			result=0;
	}
	
}
