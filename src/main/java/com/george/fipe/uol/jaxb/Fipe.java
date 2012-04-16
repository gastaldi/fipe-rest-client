package com.george.fipe.uol.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Fipe {
    @XmlElement
    private String marca;
    @XmlElement
    private String preco;
    @XmlElement
    private String modelo;
    @XmlElement
    private String mesref;
    @XmlElement
    private String codigo;
    @XmlElement(name = "label_ano")
    private String ano;
    @XmlElement
    private String data;

    public String getMarca() {
	return marca;
    }

    public void setMarca(String marca) {
	this.marca = marca;
    }

    public String getPreco() {
	return preco;
    }

    public void setPreco(String preco) {
	this.preco = preco;
    }

    public String getModelo() {
	return modelo;
    }

    public void setModelo(String modelo) {
	this.modelo = modelo;
    }

    public String getMesref() {
	return mesref;
    }

    public void setMesref(String mesref) {
	this.mesref = mesref;
    }

    public String getCodigo() {
	return codigo;
    }

    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }

    public String getAno() {
	return ano;
    }

    public void setAno(String ano) {
	this.ano = ano;
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ano == null) ? 0 : ano.hashCode());
	result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
	result = prime * result + ((data == null) ? 0 : data.hashCode());
	result = prime * result + ((marca == null) ? 0 : marca.hashCode());
	result = prime * result + ((mesref == null) ? 0 : mesref.hashCode());
	result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
	result = prime * result + ((preco == null) ? 0 : preco.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Fipe other = (Fipe) obj;
	if (ano == null) {
	    if (other.ano != null)
		return false;
	} else if (!ano.equals(other.ano))
	    return false;
	if (codigo == null) {
	    if (other.codigo != null)
		return false;
	} else if (!codigo.equals(other.codigo))
	    return false;
	if (data == null) {
	    if (other.data != null)
		return false;
	} else if (!data.equals(other.data))
	    return false;
	if (marca == null) {
	    if (other.marca != null)
		return false;
	} else if (!marca.equals(other.marca))
	    return false;
	if (mesref == null) {
	    if (other.mesref != null)
		return false;
	} else if (!mesref.equals(other.mesref))
	    return false;
	if (modelo == null) {
	    if (other.modelo != null)
		return false;
	} else if (!modelo.equals(other.modelo))
	    return false;
	if (preco == null) {
	    if (other.preco != null)
		return false;
	} else if (!preco.equals(other.preco))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Fipe [marca=" + marca + ", preco=" + preco + ", modelo=" + modelo + ", mesref=" + mesref + ", codigo=" + codigo + ", ano="
	        + ano + ", data=" + data + "]";
    }
}
