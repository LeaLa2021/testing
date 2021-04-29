package data;

import java.io.Serializable;

public class Ruoka implements Serializable{
    private String etunimi;
    private String sukunimi;
	private String ruokalaji;
	private String ikaluokka;
    
    public Ruoka() {
        
    }
    
    public Ruoka(String etunimi, String sukunimi, String ruokalaji, String ikaluokka) {
        this.etunimi=etunimi;
        this.setSukunimi(sukunimi);
        this.setRuokalaji(ruokalaji);
        this.setIkaluokka(ikaluokka);
    }
 
	
	public String getEtunimi() {
        return etunimi;
    }
    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }
    public String getSukunimi() {
        return sukunimi;
    }
    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }
    public String getRuokalaji() {
        return ruokalaji;
    }
    public void setRuokalaji(String ruokalaji) {
        this.ruokalaji = ruokalaji;
    }
    public String getIkaluokka() {
        return ikaluokka;
    }
    public void setIkaluokka(String ikaluokka) {
        this.ikaluokka = ikaluokka;
    }
    
    public String toString() {
    	return "Etunimi: " +this.etunimi+" / Sukunimi: " +this.sukunimi+" / Mieliruoka: " +this.ruokalaji+" / Ikäluokka: "+this.ikaluokka;
    	        
    }
 
    }