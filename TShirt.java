public class TShirt extends Artigo {
    // S, M, L, XL.
    private String tamanho;
    // Liso, Riscas, Palmeiras.
    private String padrao;
    public TShirt() {
        super();
        this.tamanho = "";
        this.padrao = "";
    }
    public TShirt (String codArtigo, boolean usado, int avaliacao, int numeroDonos,
                   String descricao, String marca, double precoBase, double desconto,
                   String vendedor, String transportadora, String tamanho, String padrao) {
        super(codArtigo, usado, avaliacao, numeroDonos, descricao, marca, precoBase,
                desconto, vendedor, transportadora);
        this.tamanho = tamanho;
        this.padrao = padrao;
    }
    public TShirt (TShirt t) {
        super(t);
        this.tamanho = t.getTamanho();
        this.padrao = t.getPadrao();
    }
    public String getTamanho() {
        return this.tamanho;
    }
    public String getPadrao() {
        return this.padrao;
    }
    public void setTamanho (String tamanho) {
        this.tamanho = tamanho;
    }
    public void setPadrao (String padrao) {
        this.padrao = padrao;
    }
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        TShirt t = (TShirt) o;
        return (this.tamanho.equals(t.getTamanho())
                && this.padrao.equals(t.getPadrao()));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tamanho da TShirt: ").append(this.tamanho).append("\n").
                append("Padrão da TShirt: ").append(this.padrao).append("\n");
        return sb.toString();
    }
    public TShirt clone() {
        return new TShirt(this);
    }
}
