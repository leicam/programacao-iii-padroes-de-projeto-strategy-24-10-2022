public class MeioPagamentoMercadoPagoStrategy implements MeioPagamentoStrategy{
    private String email;
    private String password;

    public MeioPagamentoMercadoPagoStrategy(String email, String password){
        this.email=email;
        this.password=password;
    }

    @Override
    public void pagar(Double valor) {
        System.out.println(valor + "R$ pago utilizando Mercado Pago!");
    }
}
