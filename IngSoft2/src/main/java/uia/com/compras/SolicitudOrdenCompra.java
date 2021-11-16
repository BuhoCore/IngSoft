package uia.com.compras;

public class SolicitudOrdenCompra extends InfoComprasUIA{
    public String datos;

    public void hazunasolicitudordencompra() {
        System.out.println(this);
        System.out.println("Id:\t" + this.getId());
        System.out.println("Name:\t" + this.getName());
        System.out.println("descripcion:\t" + this.getDescripcion());
        System.out.println("Pedido Proveedor:\t" + this.getPedidoProveedor());

    }
}
