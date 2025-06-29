package com.acm.hotel_gestion.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="pago")
public class PagoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long id;
    private Timestamp fecha;

    @ManyToOne
    @JoinColumn(name = "fk_id_reserva")
    @JsonBackReference("reserva-pagos")
    private ReservaEntity  reserva;

    @Column(name = "metodo_pago")
    private String metodoPago;

    @Column(name = "pago_total")
    private Integer pagoTotal;

    @OneToMany(mappedBy = "pago")
    @JsonManagedReference("pago-facturas")
    private List<FacturaEntity> facturas = new ArrayList<>();
}
