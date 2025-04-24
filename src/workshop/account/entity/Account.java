package workshop.account.entity;

import workshop.account.exception.InsufficientBalanceException;

public class Account extends Object {
	private String custId;
	private String acctId;
	private int balance;
	
	//Default Constructor(������)
	public Account() {
		System.out.println("Default Constructor Called..");
	}
	//Constructor Overloading( ������ �ߺ����� )
	public Account(String custId, String acctId, int balance) {
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}

	//setter
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
	
	//getter
	public int getBalance() {
		return balance;
	}
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	
	//�Ա� 
	public void deposit(int amount) {
		this.balance += amount;
	}
	//���
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount > balance) {
			//InsufficientBalanceException ������ �߻�
			String errMesage = String.format("�ܾ��� �����մϴ�. (��û �ݾ�: %d, ���� �ܾ�: %d)", amount, balance);
			throw new InsufficientBalanceException(errMesage);
		}
		this.balance -= amount;
	}
	
	//�θ� Ŭ������ ���� Object�� toString() �޼��带 ������(Overriding)
	//Method Signature public String toString()
	@Override
	public String toString() {
		return "Account [custId=" + custId + ", "
				+ "acctId=" + acctId 
				+ ", balance=" + balance + "]";
	}
}
	
