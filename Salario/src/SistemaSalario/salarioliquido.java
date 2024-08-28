package SistemaSalario;

public class salarioliquido {
	private Double liquido;
	public Double getLiquido() {
		return liquido;
	}
	public void setLiquido(Double liquido) {
		this.liquido = liquido;
	}
	public Double getVt() {
		return vt;
	}
	public void setVt(Double vt) {
		this.vt = vt;
	}
	public Double getBruto() {
		return bruto;
	}
	public void setBruto(Double bruto) {
		this.bruto = bruto;
	}
	public Double getDescontos() {
		return descontos;
	}
	public void setDescontos(Double descontos) {
		this.descontos = descontos;
	}
	public Double getInss() {
		return inss;
	}
	public void setInss(Double inss) {
		this.inss = inss;
	}
	private Double vt;
	private Double bruto;
	private Double descontos;
	private Double inss;
	private Double valorliquido;
	public Double getValorliquido() {
		
		valorliquido = bruto - vt - descontos - inss;
				
		return valorliquido;
	}
	public void setValorliquido(Double valorliquido) {
		this.valorliquido = valorliquido;
	}
}
