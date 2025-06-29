package com.acm.hotel_gestion.persistence.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.Id;
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
@Table(name="reserva")
public class ReservaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long id;
    @Column(name = "fecha_inicio")
    private Timestamp fechaInicio;
    @Column(name = "fecha_final")
    private Timestamp fechaFinal;
    @Column(name = "cantidad_dias")
    private Integer cantidadDias;
    private Boolean estado;
    @Column(name = "fecha_reserva")
    private Timestamp fechaReserva;

    @ManyToOne
    @JoinColumn(name="fk_id_habitacion")
    @JsonBackReference("habitacion-reservas")
    private HabitacionEntity habitacion;

    @ManyToOne
    @JoinColumn(name="fk_id_cliente")
    @JsonBackReference("cliente-reservas")
    private ClienteEntity  cliente;

    @OneToMany(mappedBy = "reserva")
    @JsonManagedReference("reserva-pagos")
    private List<PagoEntity> pagos = new ArrayList<>();

    @OneToMany(mappedBy = "reserva")
    @JsonManagedReference("reserva-facturas")
    private List<FacturaEntity> facturas = new ArrayList<>();
}
