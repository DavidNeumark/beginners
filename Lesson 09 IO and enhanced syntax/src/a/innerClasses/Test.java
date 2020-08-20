package a.innerClasses;

import a.innerClasses.Bank.Client;
import a.innerClasses.Bank.Ninja;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Client c1 = bank.new Client();

		System.out.println(bank.getBalance());
		System.out.println(c1.getBalance());

		c1.deposit(100);
		System.out.println(bank.getBalance());
		System.out.println(c1.getBalance());

		Ninja ninja1 = new Ninja();
		Ninja ninja2 = new Ninja();

	}

}
