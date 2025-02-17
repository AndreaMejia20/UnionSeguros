package com.pucp.unionseguros.model.Vehiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "modelo")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Modelo {
    @Id
    @Column(name = "id_modelo", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_marca_vehiculo")
    private MarcaVehiculo fidMarcaVehiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fid_tipo_vehiculo")
    private TipoVehiculo fidTipoVehiculo;

    @Column(name = "modelo", length = 30)
    private String modelo;

    @Column(name = "activo")
    private boolean activo;


}
