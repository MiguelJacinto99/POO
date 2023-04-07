import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    // IMPORTANTE!
    // Taxa de Imposto Fixa Para Todas as Encomendas.
    private String codEncomenda;
    private List<String> artigos;
    // 1, Pequeno. 2, Médio. 3, Grande.
    // Pequeno, 1 Artigo. Médio, 2 a 5 Artigos. Grande, + de 5 Artigos.
    private int dimensao;
    // Taxa de Satisfação de Serviço: 0.5 Por Cada Artigo Novo. 0.25 Por Cada Artigo Usado.
    // Custos de Expedição.
    private double precoFinal;
    private LocalDateTime dataCriacao;
    // 0, Pendente. 1, Finalizada. 2, Expedida. 3, Cancelada.
    private int estado;
    private String comprador;
    // Lista dos Vendedores. SEM REPETIÇÕES!
    private List<String> vendedor;
    // Lista das Transportadoras. PODE E DEVE TER REPETIÇÕES PARA CONTAGEM DO TAMANHO DA ENCOMENDA.
    private List<String> transportadora;
    public Encomenda() {
        this.codEncomenda = "";
        this.artigos = new ArrayList<>();
        this.dimensao = 0;
        this.precoFinal = 0.0;
        this.dataCriacao = LocalDateTime.now();
        this.estado = 0;
        this.comprador = "";
        this.vendedor = new ArrayList<>();
        this.transportadora = new ArrayList<>();
    }
    public Encomenda (String codEncomenda, List<String> artigos, int dimensao,
                      double precoFinal, LocalDateTime dataCriacao, int estado,
                      String comprador, List<String> vendedor, List<String> transportadora) {
        this.codEncomenda = codEncomenda;
        this.artigos = new ArrayList<>();
        this.setArtigos(artigos);
        this.dimensao = dimensao;
        this.precoFinal = precoFinal;
        this.dataCriacao = dataCriacao;
        this.estado = estado;
        this.comprador = comprador;
        this.vendedor = new ArrayList<>();
        this.setVendedor(vendedor);
        this.transportadora = new ArrayList<>();
        this.setTransportadora(transportadora);
    }
    public Encomenda (Encomenda e) {
        this.codEncomenda = e.getCodEncomenda();
        this.artigos = e.getArtigos();
        this.dimensao = e.getDimensao();
        this.precoFinal = e.getPrecoFinal();
        this.dataCriacao = e.getDataCriacao();
        this.estado = e.getEstado();
        this.comprador = e.getComprador();
        this.vendedor = e.getVendedor();
        this.transportadora = e.getTransportadora();
    }
    public String getCodEncomenda() {
        return this.codEncomenda;
    }
    public List<String> getArtigos() {
        return new ArrayList<>(this.artigos);
    }
    public int getDimensao() {
        return this.dimensao;
    }
    public double getPrecoFinal() {
        return this.precoFinal;
    }
    public LocalDateTime getDataCriacao() {
        return this.dataCriacao;
    }
    public int getEstado() {
        return this.estado;
    }
    public String getComprador() {
        return this.comprador;
    }
    public List<String> getVendedor() {
        return new ArrayList<>(this.vendedor);
    }
    public List<String> getTransportadora() {
        return new ArrayList<>(this.transportadora);
    }
    public void setCodEncomenda (String codEncomenda) {
        this.codEncomenda = codEncomenda;
    }
    public void setArtigos (List<String> artigos) {
        this.artigos = new ArrayList<>();
        this.artigos.addAll(artigos);
    }
    public void setDimensao (int dimensao) {
        this.dimensao = dimensao;
    }
    public void setPrecoFinal (double precoFinal) {
        this.precoFinal = precoFinal;
    }
    public void setDataCriacao (LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public void setEstado (int estado) {
        this.estado = estado;
    }
    public void setComprador (String comprador) {
        this.comprador = comprador;
    }
    public void setVendedor (List<String> vendedor) {
        this.vendedor = new ArrayList<>();
        this.vendedor.addAll(vendedor);
    }
    public void setTransportadora (List<String> transportadora) {
        this.transportadora = new ArrayList<>();
        this.transportadora.addAll(transportadora);
    }
    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }
        Encomenda e = (Encomenda) o;
        return (this.codEncomenda.equals(e.getCodEncomenda())
                && this.artigos.equals(e.getArtigos())
                && this.dimensao == e.getDimensao()
                && this.precoFinal == e.getPrecoFinal()
                && this.dataCriacao.equals(e.getDataCriacao())
                && this.estado == e.getEstado()
                && this.comprador.equals(e.getComprador())
                && this.vendedor.equals(e.getVendedor())
                && this.transportadora.equals(e.getTransportadora()));
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código da Encomenda: ").append(this.codEncomenda).append("\n").
                append("Artigos da Encomenda: ").append(this.artigos).append("\n").
                append("Dimensão da Encomenda: ").append(this.dimensao).append("\n").
                append("Preço Final da Encomenda: ").append(this.precoFinal).append("\n").
                append("Data de Criação da Encomenda: ").append(this.dataCriacao).append("\n").
                append("Estado da Encomenda: ").append(this.estado).append("\n").
                append("Comprador: ").append(this.comprador).append("\n").
                append("Vendedores: ").append(this.vendedor).append("\n").
                append("Transportadoras: ").append(this.transportadora).append("\n");
        return sb.toString();
    }
    public Encomenda clone() {
        return new Encomenda(this);
    }
    public void adicionaArtigo (Artigo a) {
        this.artigos.add(a.getCodArtigo());
        // Verificar se o Vendedor Desse Artigo Já Existe na Lista de Vendedores:
        if (!(this.vendedor.contains(a.getVendedor()))) {
            this.vendedor.add(a.getVendedor());
        }
        this.transportadora.add(a.getTransportadora());
        this.dimensao = this.dimensao + 1;
    }
    public void removeArtigo (Artigo a) {
        this.artigos.remove(a.getDescricao());
    }
    public void devolverEncomenda (LocalDateTime momentoAtual) {
        long diff = ChronoUnit.HOURS.between(this.dataCriacao, momentoAtual);
        if (diff <= 48) {
            // Coloca a Encomenda em Estado Cancelada.
            this.estado = 3;
        }
    }
    public double valorTotalEncomenda() {
        
    }
}
