public class Produto {
    private String codigoBarra;
    private String descricao;
    private Double valor;

    public Produto(String codigoBarra, String descricao, Double valor) {
        this.codigoBarra = codigoBarra;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}