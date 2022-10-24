public class MeioPagamentoCartaoCreditoStrategy implements MeioPagamentoStrategy{
    private String nome;
    private String numeroCartao;
    private String cvv;
    private String dataValidade;

    public MeioPagamentoCartaoCreditoStrategy(String nome,
                                              String numeroCartao,
                                              String cvv,
                                              String dataValidade){
        this.nome=nome;
        this.numeroCartao=numeroCartao;
        this.cvv=cvv;
        this.dataValidade=dataValidade;
    }
    
    @Override
    public void pagar(Double valor) {
        System.out.println(valor + "R$ pago utilizando Cartão de Crédito!");
    }
}
