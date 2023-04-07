public class Sapatilha extends Artigo {
    private int tamanho;
    private String cor;
    private boolean atacadores;
    // Ano de Lançamento da Coleção.
    private int dataLancamento;
    private boolean premium;
    public Sapatilha() {
        super();
        this.tamanho = 0;
        this.cor = "";
        this.atacadores = false;
        this.dataLancamento = 0;
        this.premium = false;
    }
    public Sapatilha (String codArtigo, boolean usado, int avaliacao, int numeroDonos,
                      String descricao, String marca, double precoBase, double desconto,
                      String vendedor, String transportadora, int tamanho, String cor, boolean atacadores,
                      int dataLancamento, boolean premium) {
        super(codArtigo, usado, avaliacao, numeroDonos, descricao, marca, precoBase,
                desconto, vendedor, transportadora);
        this.tamanho = tamanho;
        this.cor = cor;
        this.atacadores = atacadores;
        this.dataLancamento = dataLancamento;
        this.premium = premium;
    }
    public Sapatilha (Sapatilha s) {
        super(s);
        this.tamanho = s.getTamanho();
        this.cor = s.getCor();
        this.atacadores = s.getAtacadores();
        this.dataLancamento = s.getDataLancamento();
        this.premium = s.getPremium();
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public String getCor() {
        return this.cor;
    }
    public boolean getAtacadores() {
        return this.atacadores;
    }
    public int getDataLancamento() {
        return this.dataLancamento;
    }
    public boolean getPremium() {
        return this.premium;
    }
    public void setTamanho (int tamanho) {
        this.tamanho = tamanho;
    }
    public void setCor (String cor) {
        this.cor = cor;
    }
    public void setAtacadores (boolean atacadores) {
        this.atacadores = atacadores;
    }
    public void setDataLancamento (int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public void setPremium (boolean premium) {
        this.premium = premium;
    }
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Sapatilha s = (Sapatilha) o;
        return (this.tamanho == s.getTamanho()
                && this.cor.equals(s.getCor())
                && this.atacadores == s.getAtacadores()
                && this.dataLancamento == s.getDataLancamento()
                && this.premium == s.getPremium());
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tamanho da Sapatilha: ").append(this.tamanho).append("\n").
                append("Cor da Sapatilha: ").append(this.cor).append("\n").
                append("Sapatilhas Com Atacadores? ").append(this.atacadores).append("\n").
                append("Ano de Lançamento: ").append(this.dataLancamento).append("\n").
                append("Sapatilhas Premium? ").append(this.premium).append("\n");
        return sb.toString();
    }
    public Sapatilha clone() {
        return new Sapatilha(this);
    }
}
