package entity;

import java.sql.Date;

public class TabelaEmpresa {

	private String nomeEmpresa;
	private Date data;
	private Integer pago;

	public TabelaEmpresa() {
	}

	public TabelaEmpresa(String nomeEmpresa, Date data, Integer pago) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.data = data;
		this.pago = pago;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Integer getPago() {
		return pago;
	}

	public void setPago(Integer pago) {
		this.pago = pago;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TabelaEmpresa [nomeEmpresa=" + nomeEmpresa + ", data=" + data + ", pago=" + pago + "]";
	}

	

}