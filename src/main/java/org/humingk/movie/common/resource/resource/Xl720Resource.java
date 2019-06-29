package org.humingk.movie.common.resource.resource;

import java.util.List;

/**
 * @author lzx
 */
public class Xl720Resource {
    private String movieName;
    private String movieUrl;
    /**
     * 磁力链接
     */
    private List<Resource> magnet;
    /**
     * 迅雷链接
     */
    private List<Resource> thunder;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public List<Resource> getMagnet() {
        return magnet;
    }

    public void setMagnet(List<Resource> magnet) {
        this.magnet = magnet;
    }

    public List<Resource> getThunder() {
        return thunder;
    }

    public void setThunder(List<Resource> thunder) {
        this.thunder = thunder;
    }
}