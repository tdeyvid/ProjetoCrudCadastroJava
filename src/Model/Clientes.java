
package Model;

import java.sql.Date;


public class Clientes {
    
    int dad_id;
    Date dad_data;
    String dad_nome;
    String dad_email; 
    String dad_celular;
    String dad_whatsapp;
    String dad_cpf;
    String dad_rg;
    String dad_sexo;
    String dad_situacao;
    String dad_endereco;

    public Clientes() {
    }

    public Clientes(int dad_id, Date dad_data, String dad_nome, String dad_email, String dad_celular, String dad_whatsapp, String dad_cpf, String dad_rg, String dad_sexo, String dad_situacao, String dad_endereco) {
        this.dad_id = dad_id;
        this.dad_data = dad_data;
        this.dad_nome = dad_nome;
        this.dad_email = dad_email;
        this.dad_celular = dad_celular;
        this.dad_whatsapp = dad_whatsapp;
        this.dad_cpf = dad_cpf;
        this.dad_rg = dad_rg;
        this.dad_sexo = dad_sexo;
        this.dad_situacao = dad_situacao;
        this.dad_endereco = dad_endereco;
    }

    public int getDad_id() {
        return dad_id;
    }

    public void setDad_id(int dad_id) {
        this.dad_id = dad_id;
    }

    public Date getDad_data() {
        return dad_data;
    }

    public void setDad_data(Date dad_data) {
        this.dad_data = dad_data;
    }

    public String getDad_nome() {
        return dad_nome;
    }

    public void setDad_nome(String dad_nome) {
        this.dad_nome = dad_nome;
    }

    public String getDad_email() {
        return dad_email;
    }

    public void setDad_email(String dad_email) {
        this.dad_email = dad_email;
    }

    public String getDad_celular() {
        return dad_celular;
    }

    public void setDad_celular(String dad_celular) {
        this.dad_celular = dad_celular;
    }

    public String getDad_whatsapp() {
        return dad_whatsapp;
    }

    public void setDad_whatsapp(String dad_whatsapp) {
        this.dad_whatsapp = dad_whatsapp;
    }

    public String getDad_cpf() {
        return dad_cpf;
    }

    public void setDad_cpf(String dad_cpf) {
        this.dad_cpf = dad_cpf;
    }

    public String getDad_rg() {
        return dad_rg;
    }

    public void setDad_rg(String dad_rg) {
        this.dad_rg = dad_rg;
    }

    public String getDad_sexo() {
        return dad_sexo;
    }

    public void setDad_sexo(String dad_sexo) {
        this.dad_sexo = dad_sexo;
    }

    public String getDad_situacao() {
        return dad_situacao;
    }

    public void setDad_situacao(String dad_situacao) {
        this.dad_situacao = dad_situacao;
    }

    public String getDad_endereco() {
        return dad_endereco;
    }

    public void setDad_endereco(String dad_endereco) {
        this.dad_endereco = dad_endereco;
    }

   
}
