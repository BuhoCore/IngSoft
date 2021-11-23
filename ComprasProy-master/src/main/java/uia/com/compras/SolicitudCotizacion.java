package uia.com.compras;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SolicitudCotizacion extends proveedor
    {
        private int Cotizaciones=-1;

        @JsonCreator
        public SolicitudCotizacion(@JsonProperty("id")int id, @JsonProperty("name")String name,
                                    @JsonProperty("codigo")String codigo, @JsonProperty("unidad")String unidad,
                                    @JsonProperty("cantidad")int cantidad, @JsonProperty("vendedor")int vendedor, @JsonProperty("clasificacionProveedor")int clasificacionVendedor)
        {
            super(id, name, codigo, unidad, cantidad);
            this.Cotizaciones = Cotizaciones;
        }

        public SolicitudCotizacion(proveedor info)
        {
            super(info.getId(), info.getName(), info.getCodigo(), info.getUnidad(), info.getCantidad());
            this.setClasificacion(info.getClasificacion());
        }

        public SolicitudCotizacion() {

        }

        public int getVendedor() {
            return Cotizaciones;
        }

        public void setVendedor(int Cotizaciones) {
            this.Cotizaciones = Cotizaciones;
        }

    }




}
