package cl.acn.lab.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ACN-labs
 * Date: 09-08-20
 */

@Data
@Entity
@Table(name = "VIDEO")
public class Video {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String name;

    @Column(name = "DURACION", nullable = false)
    private int duracion;

    @Column(name = "GENERO", nullable = false)
    private String genero;

    @Column(name = "NOMBRE_AUTOR", nullable = false)
    private String nombreAutor;


}
