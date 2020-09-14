class Account {
	String name;		// 口座の名義人
	int balance;		// 残高

	public void deposit(int amount) {		// 預金する。引数は預金額
		balance = balance + amount;
		System.out.println(name+"さんが"+amount+"円預金しました");

	}

	public void withdraw(int amount) {		// 引き出す。引数は引き出し額

		balance=balance-amount;
		System.out.println(name + "さんが " + amount + "円引き出しました");
	}

	public void dispInfo() {				// 口座情報を画面に出力する
		System.out.println(name + "さんの口座の残高は " + balance + "円です");
	}
}
