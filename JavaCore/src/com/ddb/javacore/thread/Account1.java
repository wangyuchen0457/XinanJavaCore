package com.ddb.javacore.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account1  {
	private final Lock lock = new ReentrantLock();
	private String accountNo;
	private double balance;

	public Account1() {

	}

	public Account1(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo
	 *            the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the balance
	 */
	int i=2;
	public double getBalance() {
		lock.lock();
		System.out.println("get balance 时运行的线程 :"+Thread.currentThread().getName());
		return balance;
		
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) throws IllegalMonitorStateException {
		this.balance = balance;
		System.out.println("set balance 时运行的线程:"+Thread.currentThread().getName());
		lock.unlock();
	}

}