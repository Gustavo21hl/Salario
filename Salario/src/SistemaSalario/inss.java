package SistemaSalario;

public class inss {
	private Double inss;
	private Double conta;
	
	

	public Double getInss() {
		return inss;
	}

	public void setInss(Double inss) {
		this.inss = inss;
	}
	
	public Double getConta() {
		if(inss <= 1412) {
			conta = (inss * 7.5) / 100;
		}else if ((inss > 1412.1) && (inss < 2666.68)){
			conta = (inss * 9) / 100;
		}else if ((inss < 2666.69) && (inss < 4000)) {
			conta = (inss * 12) / 100;
		}else {
			conta = (inss * 15) / 100;
		}
		return conta;
	}

	public void setConta(Double conta) {
		this.conta = conta;
	}
}
