package SistemaSalario;

public class valetransporte {
	private Double vale;
	private Double vt;
	private Double resultado;

	public Double getResultado() {
		if (vale == 1) {
			resultado = (vt * 6) /100;
		}else {
			resultado = vt * 0;
		}
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getVt() {
		return vt;
	}

	public void setVt(Double vt) {
		this.vt = vt;
	}

	public Double getVale() { 
		return vale;
	}

	public void setVale(Double vale) {
		this.vale = vale;
	}
	
}
