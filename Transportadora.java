import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    private String codTrasportadora;
    private double encPequena;
    private double encMedia;
    private double encGrande;
    // false, Não Faz Transporte De Artigos Premium. true, Caso Contrário.
    private boolean transportePremium;
    private List<String> faturas;
    public Transportadora() {
        this.codTrasportadora = "";
        this.encPequena = 0.0;
        this.encMedia = 0.0;
        this.encGrande = 0.0;
        this.transportePremium = false;
        this.faturas = new ArrayList<>();
    }
    public Transportadora (String codTrasportadora, double encPequena, double encMedia, double encGrande,
                           boolean transportePremium, List<String> faturas) {
        this.codTrasportadora = codTrasportadora;
        this.encPequena = encPequena;
        this.encMedia = encMedia;
        this.encGrande = encGrande;
        this.transportePremium = transportePremium;
        this.faturas = new ArrayList<>();
        this.setFaturas(faturas);
    }
    public Transportadora (Transportadora t) {
        this.codTrasportadora = t.getCodTransportadora();
        this.encPequena = t.getEncPequena();
        this.encMedia = t.getEncMedia();
        this.encGrande = t.getEncGrande();
        this.transportePremium = t.getTransportePremium();
        this.faturas = t.getFaturas();
    }
    public String getCodTransportadora() {
        return this.codTrasportadora;
    }
    public double getEncPequena() {
        return this.encPequena;
    }
    public double getEncMedia() {
        return this.encMedia;
    }
    public double getEncGrande() {
        return this.encGrande;
    }
    public boolean getTransportePremium() {
        return this.transportePremium;
    }
    public List<String> getFaturas() {
        return new ArrayList<>(this.faturas);
    }
    public void setCodTrasportadora (String codTrasportadora) {
        this.codTrasportadora = codTrasportadora;
    }
    public void setEncPequena (double encPequena) {
        this.encPequena = encPequena;
    }
    public void setEncMedia (double encMedia) {
        this.encMedia = encMedia;
    }
    public void setEncGrande (double encGrande) {
        this.encGrande = encGrande;
    }
    public void setTransportePremium (boolean transportePremium) {
        this.transportePremium = transportePremium;
    }
    public void setFaturas (List<String> faturas) {
        this.faturas = new ArrayList<>();
        this.faturas.addAll(faturas);
    }
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Transportadora t = (Transportadora) o;
        return (this.codTrasportadora.equals(t.getCodTransportadora())
                && this.encPequena == t.getEncPequena()
                && this.encMedia == t.getEncMedia()
                && this.encGrande == t.getEncGrande()
                && this.transportePremium == t.getTransportePremium()
                && this.faturas.equals(t.getFaturas()));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código da Transportadora: ").append(this.codTrasportadora).append("\n").
                append("Taxa Para Encomendas Pequenas: ").append(this.encPequena).append("\n").
                append("Taxa Para Encomendas Médias: ").append(this.encMedia).append("\n").
                append("Taxa Para Encomendas Grandes: ").append(this.encGrande).append("\n").
                append("Permite Transporte de Artigos Premium? ").append(this.transportePremium).append("\n").
                append("Histórico de Transportes Efeetuados: ").append(this.faturas).append("\n");
        return sb.toString();
    }
    public Transportadora clone() {
        return new Transportadora(this);
    }
}
