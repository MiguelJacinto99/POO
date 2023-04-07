public abstract class Artigo {
    private String codArtigo;
    // false, Novo. True, Usado.
    private boolean usado;
    private int avaliacao;
    private int numeroDonos;
    private String descricao;
    private String marca;
    // A5BS12
    private double precoBase;
    private double desconto;
    // Código do Utilizador.
    private String vendedor;
    private String transportadora;
    public Artigo() {
        this.codArtigo = "";
        this.usado = false;
        this.avaliacao = 0;
        this.numeroDonos = 0;
        this.descricao = "";
        this.marca = "";
        this.precoBase = 0.0;
        this.desconto = 0.0;
        this.vendedor = "";
        this.transportadora = "";
    }
    public Artigo (String codArtigo, boolean usado, int avaliacao, int numeroDonos, String descricao,
                   String marca, double precoBase, double desconto, String vendedor, String transportadora) {
        this.codArtigo = codArtigo;
        this.usado = usado;
        this.avaliacao = avaliacao;
        this.numeroDonos = numeroDonos;
        this.descricao = descricao;
        this.marca = marca;
        this.precoBase = precoBase;
        this.desconto = desconto;
        this.vendedor = vendedor;
        this.transportadora = transportadora;
    }
    public Artigo (Artigo a) {
        this.codArtigo = a.getCodArtigo();
        this.usado = a.getUsado();
        this.avaliacao = a.getAvaliacao();
        this.numeroDonos = a.getNumeroDonos();
        this.descricao = a.getDescricao();
        this.marca = a.getMarca();
        this.precoBase = a.getPrecoBase();
        this.desconto = a.getDesconto();
        this.vendedor = a.getVendedor();
        this.transportadora = a.getTransportadora();
    }
    public String getCodArtigo() {
        return this.codArtigo;
    }
    public boolean getUsado() {
        return this.usado;
    }
    public int getAvaliacao() {
        return this.avaliacao;
    }
    public int getNumeroDonos() {
        return this.numeroDonos;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public String getMarca() {
        return this.marca;
    }
    public double getPrecoBase() {
        return this.precoBase;
    }
    public double getDesconto() {
        return this.desconto;
    }
    public String getVendedor() {
        return this.vendedor;
    }
    public String getTransportadora() {
        return this.transportadora;
    }
    public void setCodArtigo (String codArtigo) {
        this.codArtigo = codArtigo;
    }
    public void setUsado (boolean usado) {
        this.usado = usado;
    }
    public void setAvaliacao (int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setNumeroDonos (int numeroDonos) {
        this.numeroDonos = numeroDonos;
    }
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setPrecoBase (double precoBase) {
        this.precoBase = precoBase;
    }
    public void setDesconto (double desconto) {
        this.desconto = desconto;
    }
    public void setVendedor (String vendedor) {
        this.vendedor = vendedor;
    }
    public void setTransportadora (String transportadora) {
        this.transportadora = transportadora;
    }
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Artigo a = (Artigo) o;
        return (this.codArtigo.equals(a.getCodArtigo())
                && this.usado == a.getUsado()
                && this.avaliacao == a.getAvaliacao()
                && this.numeroDonos == a.getNumeroDonos()
                && this.descricao.equals(a.getDescricao())
                && this.marca.equals(a.getMarca())
                && this.precoBase == a.getPrecoBase()
                && this.desconto == a.getDesconto()
                && this.vendedor.equals(a.getVendedor())
                && this.transportadora.equals(a.getTransportadora()));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código do Artigo: ").append(this.codArtigo).append("\n").
                append("Artigo Usado? ").append(this.usado).append("\n").
                append("Avaliação do Estado do Artigo: ").append(this.avaliacao).append("\n").
                append("Número de Donos Anteriores: ").append(this.numeroDonos).append("\n").
                append("Descrição do Artigo: ").append(this.descricao).append("\n").
                append("Marca do Artigo: ").append(this.marca).append("\n").
                append("Preço Base do Artigo: ").append(this.precoBase).append("\n").
                append("Desconto do Artigo: ").append(this.desconto).append("\n").
                append("Código de Vendedor do Artigo: ").append(this.vendedor).append("\n").
                append("Código da Transportadora do Artigo: ").append(this.transportadora).append("\n");
        return sb.toString();
    }
    public abstract Artigo clone();
}