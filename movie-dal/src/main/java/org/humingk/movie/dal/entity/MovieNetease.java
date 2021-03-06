package org.humingk.movie.dal.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 网易云音乐电影
 *
 *@author humingk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieNetease implements Serializable {
    /**
     * 豆瓣电影ID
     */
    private Long idMovieDouban;

    /**
     * 网易云音乐ID
     */
    private Long idNetease;

    /**
     * 匹配类型 0-未知 1-歌曲 2-歌单 3-专辑
     */
    private Byte neteaseType;

    /**
     * 排序 1-10 依次降低
     */
    private Byte sort;

    private static final long serialVersionUID = 1L;
}