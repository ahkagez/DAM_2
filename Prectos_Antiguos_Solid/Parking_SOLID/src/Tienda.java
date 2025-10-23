public class Tienda {
    private RegistroEstrategia regEstrategia;

    public Tienda(RegistroEstrategia regEstrategia) {
        this.regEstrategia = regEstrategia;
    }

    public Recibo procesarPagoPedido(Pedido pedido, MetodoPago metodoPago) throws Exception {
        if(metodoPago == null) throw new IllegalStateException("Metodo de pago no valido");
        Recibo recibo = new Recibo(
                pedido.getProducto().getNombre(),
                pedido.getCantidad(),
                (pedido.getProducto().getPrecioBase() * pedido.getCantidad()),
                metodoPago.getTipoPago(),
                regEstrategia.estrategiaPara(metodoPago).getTipo(),
                regEstrategia.estrategiaPara(metodoPago).calcularImporte(
                        pedido.getProducto().getPrecioBase() * pedido.getCantidad()
                )
        );

        return recibo;
    }
}
