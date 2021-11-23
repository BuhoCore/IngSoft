package uia.com.compras;

import java.util.ArrayList;
import java.util.HashMap;

public class proveedor extends SolicitudOrdenCompra {
    int pedidoProveedor;

    protected HashMap<Integer, HashMap<Integer, ArrayList<InfoComprasUIA>>> proveedores = new HashMap<Integer, HashMap<Integer, ArrayList<InfoComprasUIA>>>();
    private Object SolicitudCotizacion;

    public int getPedidoProveedor() {
        return pedidoProveedor;
    }

    public void setPedidoProveedor(int pedidoProveedor) {
        this.pedidoProveedor = pedidoProveedor;
    }

    public HashMap<Integer, HashMap<Integer, ArrayList<InfoComprasUIA>>> getProveedores() {
        return proveedores;
    }

    public void setProveedores(HashMap<Integer, HashMap<Integer, ArrayList<InfoComprasUIA>>> proveedores) {
        this.proveedores = proveedores;
    }

    public void hazCotizacion(Comprador miCotizacion){
            validaCotizacion(miCotizacion);
        }
    private void validaCotizacion(Comprador miCotizacion) {
        for (int i = 0; i < miCotizacion.getVendedores().size(); i++) {
            validaUsoCoti((Comprador) miCotizacion.getVendedores(),(i), i);
        }
    }
    private void validaUsoCoti(Comprador miCotizacion, int i) {
        switch (i % 3) {
            case 0:
                miCotizacion.setClasificacion(0);
                break;
            case 1:
                miCotizacion.setClasificacion(1);
                break;
            case 2:
                miCotizacion.setClasificacion(2);
                break;
        }
    }
    public Comprador buscaCotizacion(Comprador miCotizacion) {
        //--Por downcasting se crea SolicituOrdenCompra para asignar las peticiones con proveedor
        SolicitudCotizacion miSolicitudOC = new SolicitudCotizacion();

        for (int i = 0; i < miCotizacion.getVendedores().size(); i++) {
            SolicitudOrdenCompra item;
            item = new SolicitudCotizacion((Comprador) miCotizacion.getVendedores().get(i));
            if (buscaCotizacion((SolicitudCotizacion), i) >= 0) {
                if (miCotizacion.getVendedores() == null)
                    miCotizacion.setVendedores( new ArrayList <InfoComprasUIA>());
                miCotizacion.getVendedores().size();
            }
        }
        if (miCotizacion != null)
            return miCotizacion;
        else
            return null;

    }
}