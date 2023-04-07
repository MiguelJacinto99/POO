public class Mala extends Artigo {
    private int comprimento;
    private int largura;
    private int altura;
    private int dataLancamento;
    private String material;
    private boolean premium;
    public Mala() {
        super();
        this.comprimento = 0;
        this.largura = 0;
        this.altura = 0;
        this.dataLancamento = 0;
        this.material = "";
        this.premium = false;
    }
    public Mala (String codArtigo, boolean usado, int avaliacao, int numeroDonos,
                 String descricao, String marca, double precoBase, double desconto,
                 String vendedor, String transportadora, int comprimento, int largura,
                 int altura, int dataLancamento, String material, boolean premium) {
        super(codArtigo, usado, avaliacao, numeroDonos, descricao, marca,
                precoBase, desconto, vendedor, transportadora);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.dataLancamento = dataLancamento;
        this.material = material;
        this.premium = premium;
    }
    public Mala (Mala m) {
        super(m);
        this.comprimento = m.getComprimento();
        this.largura = m.getLargura();
        this.altura = m.getAltura();
        this.dataLancamento = m.getDataLancamento();
        this.material = m.getMaterial();
        this.premium = m.getPremium();
    }
    public int getComprimento() {
        return this.comprimento;
    }
    public int getLargura() {
        return this.largura;
    }
    public int getAltura() {
        return this.altura;
    }
    public int getDataLancamento() {
        return this.dataLancamento;
    }
    public String getMaterial() {
        return this.material;
    }
    public boolean getPremium() {
        return this.premium;
    }
    public void setComprimento (int comprimento) {
        this.comprimento = comprimento;
    }
    public void setLargura (int largura) {
        this.largura = largura;
    }
    public void setAltura (int altura) {
        this.altura = altura;
    }
    public void setDataLancamento (int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    public void setMaterial (String material) {
        this.material = material;
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
        Mala m = (Mala) o;
        return (this.comprimento == m.getComprimento()
                && this.largura == m.getLargura()
                && this.altura == m.getAltura()
                && this.dataLancamento == m.getDataLancamento()
                && this.material.equals(m.getMaterial())
                && this.premium == m.getPremium());
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Dimensão (Comprimento): ").append(this.comprimento).append("\n").
                append("Dimensão (Largura): ").append(this.largura).append("\n").
                append("Dimensão (Altura): ").append(this.altura).append("\n").
                append("Ano de Lançamento: ").append(this.dataLancamento).append("\n").
                append("Material: ").append(this.material).append("\n").
                append("Mala Premium? ").append(this.premium).append("\n");
        return sb.toString();
    }
    public Mala clone() {
        return new Mala(this);
    }
}
