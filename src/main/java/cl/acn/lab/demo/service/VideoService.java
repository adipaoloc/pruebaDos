package cl.acn.lab.demo.service;

import cl.acn.lab.demo.dto.VideoDTO;
import java.util.List;

/**
 * @author ACN-amador.zamora.nunez
 * Date: 09-08-20
 */
public interface VideoService {

    public List<VideoDTO> getAll();

    public VideoDTO getById(Long id);

    public boolean save(List<VideoDTO> input);

    public boolean update(List<VideoDTO> input);

    public boolean delete(Long id);
}
