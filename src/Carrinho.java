import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> lista = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto){
        this.lista.add(produto);
    }

    public void removerProduto(Produto produto){
        this.lista.remove(produto);
    }

    public void pagar(MeioPagamentoStrategy meioPagamento){
        meioPagamento.pagar(getTotal());
    }

    private Double getTotal(){
        Double total = 0.0;

        for(Produto produto : lista){
            total += produto.getValor();
        }

        return total;
    }
}
