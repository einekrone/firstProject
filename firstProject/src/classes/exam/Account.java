package classes.exam;

public class Account {
	private int balance;
	private String ano;
	private String owner;

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	boolean result = false;
	for(int i = 0; i<accountArray.length; i++) {
		if(ano.equals(accountArray[i].getAno())){
			result = true;
			break;
		}else
			result = false;
			
		}
	}

	}

