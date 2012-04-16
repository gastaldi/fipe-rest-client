package com.george.fipe.uol.jaxb;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ano {

    public Ano() {
    }

    @XmlElement(name = "celula_ano")
    private String[] celula;

    @XmlElement(name = "label_ano")
    private String[] label;

    public String[] getCelula() {
	return celula;
    }

    public String[] getLabel() {
	return label;
    }

    public void setCelula(String[] celula) {
	this.celula = celula;
    }

    public void setLabel(String[] label) {
	this.label = label;
    }

    @Override
    public String toString() {
	return "Ano [celula=" + Arrays.toString(celula) + ", label=" + Arrays.toString(label) + "]";
    }

}
