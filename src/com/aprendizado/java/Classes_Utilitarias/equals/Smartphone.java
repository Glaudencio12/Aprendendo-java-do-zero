package com.aprendizado.java.Classes_Utilitarias.equals;

public class Smartphone {
    private int numeroSerial;
    private String marca;

    public Smartphone(int numeroSerial, String marca) {
        this.numeroSerial = numeroSerial;
        this.marca = marca;
    }

    public int getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(int numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return (smartphone.getMarca() != null && smartphone.getMarca().equals(this.getMarca()));
    }
}
