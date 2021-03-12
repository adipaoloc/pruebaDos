package cl.acn.lab.demo.dto;

import lombok.Data;

/**
 * @author ACN-labs
 * Date: 09-08-20
 */
@Data
public class VideoDTO {

    private Long id;
    private String name;
    private int duracion;
    private String genero;
    private String nombreAutor;

}