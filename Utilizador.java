import java.util.ArrayList;
import java.util.List;

public class Utilizador {
    // Adicionar static
    private String codUtilizador;
    private String email;
    private String nome;
    private String morada;
    private String nif;
    private List<String> vendas;
    private List<String> historicoVendas;
    private List<String> historicoCompras;
    public Utilizador() {
        this.codUtilizador = "";
        this.email = "";
        this.nome = "";
        this.morada = "";
        this.nif = "";
        this.vendas = new ArrayList<>();
        this.historicoVendas = new ArrayList<>();
        this.historicoCompras = new ArrayList<>();
    }
    public Utilizador (String codUtilizador, String email, String nome, String morada, String nif,
                       List<String> vendas, List<String> historicoVendas, List<String> historicoCompras) {
        this.codUtilizador = codUtilizador;
        this.email = email;
        this.nome = nome;
        this.morada = morada;
        this.nif = nif;
        this.vendas = new ArrayList<>();
        this.setVendas(vendas);
        this.historicoVendas = new ArrayList<>();
        this.setHistoricoVendas(historicoVendas);
        this.historicoCompras = new ArrayList<>();
        this.setHistoricoCompras(historicoCompras);
    }
    public Utilizador (Utilizador u) {
        this.codUtilizador = u.getCodUtilizador();
        this.email = u.getEmail();
        this.nome = u.getNome();
        this.morada = u.getMorada();
        this.nif = u.getNif();
        this.vendas = u.getVendas();
        this.historicoVendas = u.getHistoricoVendas();
        this.historicoCompras = u.getHistoricoCompras();
    }
    public String getCodUtilizador() {
        return this.codUtilizador;
    }
    public String getEmail() {
        return this.email;
    }
    public String getNome() {
        return this.nome;
    }
    public String getMorada() {
        return this.morada;
    }
    public String getNif() {
        return this.nif;
    }
    public List<String> getVendas() {
        return new ArrayList<>(this.vendas);
    }
    public List<String> getHistoricoVendas() {
        return new ArrayList<>(this.historicoVendas);
    }
    public List<String> getHistoricoCompras() {
        return new ArrayList<>(this.historicoCompras);
    }
    public void setCodUtilizador (String codUtilizador) {
        this.codUtilizador = codUtilizador;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setMorada (String morada) {
        this.morada = morada;
    }
    public void setNif (String nif) {
        this.nif = nif;
    }
    public void setVendas (List<String> vendas) {
        this.vendas = new ArrayList<>();
        this.vendas.addAll(vendas);
    }
    public void setHistoricoVendas (List<String> historicoVendas) {
        this.historicoVendas = new ArrayList<>();
        this.historicoVendas.addAll(historicoVendas);
    }
    public void setHistoricoCompras (List<String> historicoCompras) {
        this.historicoCompras = new ArrayList<>();
        this.historicoCompras.addAll(historicoCompras);
    }
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Utilizador u = (Utilizador) o;
        return (this.codUtilizador.equals(u.getCodUtilizador())
                && this.email.equals(u.getEmail())
                && this.nome.equals(u.getNome())
                && this.morada.equals(u.getMorada())
                && this.nif.equals(u.getNif())
                && this.vendas.equals(u.getVendas())
                && this.historicoVendas.equals(u.getHistoricoVendas())
                && this.historicoCompras.equals(u.getHistoricoCompras()));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código de Utilizador: ").append(this.codUtilizador).append("\n").
                append("Email de Utilizador: ").append(this.email).append("\n").
                append("Nome de Utilizador: ").append(this.nome).append("\n").
                append("Morada de Utilizador: ").append(this.morada).append("\n").
                append("NIF de Utilizador: ").append(this.nif).append("\n").
                append("Vendas Ativas: ").append(this.vendas).append("\n").
                append("Histórico de Vendas: ").append(this.historicoVendas).append("\n").
                append("Histórico de Compras: ").append(this.historicoCompras).append("\n");
        return sb.toString();
    }
    public Utilizador clone() {
        return new Utilizador(this);
    }
}
