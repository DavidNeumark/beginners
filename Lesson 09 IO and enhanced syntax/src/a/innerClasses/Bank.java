package a.innerClasses;

public class Bank {

	private float balance;
	private static String stam;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	// inner class
	public class Client {

		private float balance;

		public void deposit(float ammount) {
			this.balance += ammount;
			float comission = ammount * 0.1F;
			this.balance -= comission;
			Bank.this.balance += comission;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}

	}

	// static nested class
	public static class Ninja {
		public void kik() {
			System.out.println("Kik like a ninja");
			System.out.println(Bank.stam);
		}
	}

}
