package SistemaSalario;

public class descontos {
	private Double irrf;
	public Double getIrrf() {
		return irrf;
	}
	public void setIrrf(Double irrf) {
		this.irrf = irrf;
	}
	public Double getCalculo() {
		if (irrf <= 2112) {
			calculo = irrf * 0;
		}else if ((irrf > 2112) && (irrf < 2826.65)){
			calculo = (irrf * 7.5) / 100;
		}else if ((irrf > 2826.66) && (irrf < 3751.05)){
			calculo = (irrf * 15) / 100;
		}else if ((irrf > 3751.06) && (irrf < 4664.68)) {
			calculo = (irrf * 22.5) / 100;
		}else {
			calculo = (irrf * 27.5) / 100;
		}
		return calculo;
	}
	public void setCalculo(Double calculo) {
		this.calculo = calculo;
	}
	private Double calculo;
}
