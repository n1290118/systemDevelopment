class JavaRen9 {
	public static void main(String[] args) {
		Account ac1 = new Account();
		Account ac2 = new Account();

		ac1.name = "Dejita";
		ac1.balance = 0;

		ac2.name = "Hamako";
		ac2.balance = 0;

		ac1.deposit(15000);
		ac2.deposit(20000);

		ac1.withdraw(7000);
		ac2.withdraw(3000);
		ac2.deposit(16000);

		ac1.dispInfo();
		ac2.dispInfo();
	}
}
