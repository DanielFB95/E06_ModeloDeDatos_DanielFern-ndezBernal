package com.salesianostriana.dam.Ejercicio02.servicios;

import com.salesianostriana.dam.Ejercicio02.modelo.Video;
import com.salesianostriana.dam.Ejercicio02.repositorios.VideoRepository;
import com.salesianostriana.dam.Ejercicio02.servicios.base.BaseService;

public class VideoService extends BaseService<Video,Long, VideoRepository> {
    public VideoService(VideoRepository repo) {
        super(repo);
    }
}
