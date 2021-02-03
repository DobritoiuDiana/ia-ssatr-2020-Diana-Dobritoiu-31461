/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DoubleD
 */
public class Contact {
    
    private Integer cid;
    private String nume;
    private String prenume;
    private String grup;
    private String telefon;
    private String email;
    private String adresa;
    private byte[] foto;
    private int uid;
     
    // Alt + ins pt a genera constructor, getters si setters

    public Contact() {}    
    
    public Contact(Integer cid, String nume, String prenume, String grup, String telefon, String email, String adresa, byte[] foto, int uid) {
        this.cid = cid;
        this.nume = nume;
        this.prenume = prenume;
        this.grup = grup;
        this.telefon = telefon;
        this.email = email;
        this.adresa = adresa;
        this.foto = foto;
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    
    
    
}
