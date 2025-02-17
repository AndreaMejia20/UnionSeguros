package com.pucp.unionseguros.model.Cotizacion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cotizacion_x_detalle_cotizacion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CotizacionXDetalleCotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotizacion_x_detalle_cotizacion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_detalle_cotizacion")
    private DetalleCotizacion fidDetalleCotizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_cotizacion")
    private Cotizacion fidCotizacion;
}
