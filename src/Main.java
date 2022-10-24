public class Main {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        Produto produto1 = new Produto("1234", "Coca-Cola 350ml", 2.99);
        Produto produto2 = new Produto("5678","X-SALADA", 14.99);

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        //pago com cartão de crédito
        carrinho.pagar(new MeioPagamentoCartaoCreditoStrategy("Juliano Maciel", "1234567890123456", "786", "12/15"));

        //pago com mercado pago
        carrinho.pagar(new MeioPagamentoMercadoPagoStrategy("juliano.maciel@faculdadefacec.edu.br", "aqu1temumasenh@"));
    }
}