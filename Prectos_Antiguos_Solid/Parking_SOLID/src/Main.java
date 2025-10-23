import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Class<? extends MetodoPago>, EstrategiaPago> mapa = Map.of(
                PagoEfectivo.class, new DescuentoEfectivo(),
                PagoTarjeta.class, new RecargaTarjeta(),
                PagoMovil.class, new RecargaMovil()
        );

        RegistroEstrategia registroEstrategia = new RegistroEstrategia(mapa);
        Tienda tienda = new Tienda(registroEstrategia);

        BocadilloPollo bocadilloPollo = new BocadilloPollo();
        Pedido pedido = new Pedido(bocadilloPollo, 1);

        PagoTarjeta tarjeta = new PagoTarjeta();

        Recibo recibo = tienda.procesarPagoPedido(pedido, tarjeta);

        Impresora impresora = new Impresora();
        impresora.imprimirConsola(recibo);
    }
}