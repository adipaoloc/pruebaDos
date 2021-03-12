package cl.acn.lab.demo.service.impl;

import cl.acn.lab.demo.dto.VideoDTO;
import cl.acn.lab.demo.entity.Video;
import cl.acn.lab.demo.repository.VideoRepository;
import cl.acn.lab.demo.service.VideoService;
import cl.acn.lab.demo.utils.MapperUtils;
import lombok.extern.log4j.Log4j;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ACN-amador.zamora.nunez
 * Date: 09-08-20
 */

@Service("videoService")
@Log4j
public class VideoServiceImpl implements VideoService {


    @Autowired
    @Qualifier("videoRepository")
    private VideoRepository videoRepository;

    @Override
    public List<VideoDTO> getAll() {
        return (List<VideoDTO>) MapperUtils.mapAsList(videoRepository.getAll(), new TypeToken<List<VideoDTO>>() {
        }.getType());
    }

    @Override
    public VideoDTO getById(Long id) {
        Video data = this.videoRepository.findById(id).get();
        if (data.getId() != 99) {
            return (VideoDTO) MapperUtils.map(data, VideoDTO.class);
        } else {
            return null;
        }


    }

    @Override
    public boolean save(List<VideoDTO> daoList) {
        boolean result=Boolean.FALSE;
        try {
            List<Video> entityList = (List<Video>) MapperUtils.mapAsList(daoList, new TypeToken<List<Video>>() {
            }.getType());

            List<Video> saveResult = this.videoRepository.saveAll(entityList);
            if (saveResult.size() == entityList.size()) {
                result= Boolean.TRUE;
            } else {
                result= Boolean.FALSE;
            }
        }catch(Exception e){
            log.error("ERROR message:  " + e.getMessage());
        }
        return result;
    }

    @Override
    public boolean update(List<VideoDTO> daoList) {
        boolean result=Boolean.FALSE;
        try {
            List<Video> entityList = (List<Video>) MapperUtils.mapAsList(daoList, new TypeToken<List<Video>>() {
            }.getType());

            List<Video> saveResult = this.videoRepository.saveAll(entityList);
            if (saveResult.size() == entityList.size()) {
                result= Boolean.TRUE;
            } else {
                result= Boolean.FALSE;
            }
        }catch(Exception e){
            log.error("ERROR message:  " + e.getMessage());
        }
        return result;
    }

    @Override
    public boolean delete(Long id) {
        boolean ret = false;
        try {
            this.videoRepository.deleteById(id);
            ret = true;
        } catch (Exception e) {
            log.error("ERROR message:  " + e.getMessage());
        }
        return ret;
    }
}


