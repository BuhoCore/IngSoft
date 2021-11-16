package uia.com.compras;

public class MainProy {

    public static void main(String[] args) {

        System.out.println("Hola Usuario de Compras");

        GestorCompras miGestor = new GestorCompras();
        SolicitudOrdenCompra haz = new SolicitudOrdenCompra();
        System.out.println("HAZ UNA SOLICITUD");
       haz.hazunasolicitudordencompra();
    }
}
