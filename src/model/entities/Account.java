package model.entities;

import model.exceptions.SaqueExceptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;		
	}
	
	public Integer getNumber() {
		return this.number;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public Double getBalance() {
		return this.balance;
	}
	
	public Double getwithDrawLimit() {
		return this.withDrawLimit;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void setwithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
		
	}
	
	public void deposit (Double amount) {
		this.balance  += amount;
	}
	
	public void withDraw(Double amount) throws SaqueExceptions {
		if(amount > this.withDrawLimit) {
			throw new SaqueExceptions("Limite de saque atingido");
		}
		if(amount > this.balance) {
			throw new SaqueExceptions("Saldo insuficiente para saque");
		}
		
		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		return "Num conta "
			+ number
			+ ", Usuário: "
			+holder
			+ ", Saldo em conta: "
			+balance
			+ ", Disponível para saque até: "
			+ withDrawLimit;
	}
	
	
	
	
}
