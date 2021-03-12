package cl.acn.lab.demo.repository;

import cl.acn.lab.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ACN-amador.zamora.nunez
 * Date: 09-08-20
 */
@Repository("videoRepository")
public interface VideoRepository extends JpaRepository<Video, Long> {

    @Query(value = "SELECT * FROM VIDEO", nativeQuery = true)
    public List<Video> getAll();
}
