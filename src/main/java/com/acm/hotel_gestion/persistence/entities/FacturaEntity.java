package com.acm.hotel_gestion.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="factura")
public class FacturaEntity implements Serializable {
    @Id
    @Column(name = "id_factura")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_reserva")
    @JsonBackReference("reserva-facturas")
    private ReservaEntity reserva;

    @ManyToOne
    @JoinColumn(name = "fk_id_pago")
    @JsonBackReference("pago-facturas")
    private PagoEntity pago;

    @Column(name = "valor_total")
    private Integer valorTotal;

    @Column(name = "fecha_emision")
    private Timestamp fechaEmision;
}
