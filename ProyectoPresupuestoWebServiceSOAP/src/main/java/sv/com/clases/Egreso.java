package sv.com.clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.*;
import lombok.Data;

@Data
@Entity
@Table(name = "egreso")
@XmlAccessorType(XmlAccessType.FIELD)
public class Egreso implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_egreso")
    private Integer idEgreso;
    
    @ManyToOne
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    private Cuenta cuenta;
    
    @Column(name = "saldo_egreso")
    private double saldoEgreso;
    
    @Column(name = "descripcion")
    @NotEmpty
    private String descripcion;
    
    @Column(name = "estado_egreso")
    @NotEmpty
    private String estadoEgreso;    
    
    @Column(name = "fecha_egreso")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEgreso;
}
