package sv.com.clases;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ingreso")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ingreso implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso")
    private Integer idIngreso;
    
    @ManyToOne
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    private Cuenta cuenta;
    
    @Column(name = "saldo_ingreso")
    private double saldoIngreso;
    
    @Column(name = "descripcion")
    @NotEmpty
    private String descripcion;
    
    @Column(name = "fecha_ingreso")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIngreso;
    
    @Column(name = "estado_ingreso")
    @NotEmpty
    private String estadoIngreso; 
}
