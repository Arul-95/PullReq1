package org.bank;

public class AxisBank extends BankInfo {
public void deposit(long amount) {
	System.out.println("Deposit amount is "+amount);

}
public static void main(String[] args) {
	AxisBank d = new AxisBank();
	d.deposit(500000l);
	d.deposit(250000l);
	d.fixed(100000l);
	d.saving(150000l);
}
}
