package com.criacional.abstractFactory;

//Abstract Produto
public abstract class Veiculo {

	private String modelo;
	private Porte porte;
	
	protected Veiculo(String modelo, Porte porte)
    {
        this.modelo = modelo;
        this.porte = porte;
    }
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Porte getPorte() {
		return porte;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}
}
