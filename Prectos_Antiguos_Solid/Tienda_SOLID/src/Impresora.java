public class Impresora implements ImpresionConsola{
    @Override
    public void imprimirConsola(Recibo recibo) {
        System.out.println(
                "===========================" + "\n" +
                        "ID: " + recibo.getId() + "\n" +
                        "Producto: " + recibo.getProducto() + "\n" +
                        "Cantidad: " + recibo.getCantidad() + "\n" +
                        "Subtotal: " + recibo.getPrecioBase() + "\n" +
                        "Metodo Pago: " + recibo.getMetodoPago() + "\n" +
                        "Ajuste aplicado: " + recibo.getAjusteAplicado() + "\n" +
                        "Precio Final: " + recibo.getTotalFinal() + "\n" +
                "==========================="
        );
    }
}
