package br.com.newtonpaiva.exemplo3;

public class Rendimento {

	private double investInicial;
	private double taxaRendimento;
	private int numMeses;
	
	public Rendimento(double investInicial, double taxaRendimento, int numMeses) {
		super();
		this.investInicial = investInicial;
		this.taxaRendimento = taxaRendimento;
		this.numMeses = numMeses;
	
	
	
	}

	public double getInvestInicial() {
		return investInicial;
	}

	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	
}
