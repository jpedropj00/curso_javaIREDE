package lista_02.at5;

import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto {
	private LocalDate dataValidade;
	public ProdutoAlimenticio(String nome, Integer quantity, Double valor, LocalDate dataValidade) {
		super(nome, quantity, valor);
		this.dataValidade = dataValidade;
	}
	public LocalDate getDataValidade() {
		return dataValidade;
	}
	public boolean isVencido() {
		LocalDate dataHoje = LocalDate.now();
		if (dataHoje.isAfter(dataValidade)) {
			return true;
		} 
		return false;
	}
	
	
	
}
