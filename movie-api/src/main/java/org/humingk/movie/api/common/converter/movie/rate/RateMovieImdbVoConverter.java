package org.humingk.movie.api.common.converter.movie.rate;

import org.humingk.movie.api.common.util.ConverterUtil;
import org.humingk.movie.api.common.vo.movie.rate.RateMovieImdbVo;
import org.humingk.movie.common.util.BaseConverter;
import org.humingk.movie.dal.entity.RateImdb;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/** @author humingk */
@Mapper(
    componentModel = "spring",
    uses = {ConverterUtil.class})
public interface RateMovieImdbVoConverter extends BaseConverter<RateMovieImdbVo, RateImdb> {
  @Override
  @Mappings({
    @Mapping(
        target = "idMovieImdb",
        source = "id",
        qualifiedByName = {"util", "idMovieImdb"}),
    @Mapping(target = "imdbColor", constant = "0,162,232"),
    @Mapping(
        target = "tomatoColor",
        source = "rateImdb.tomatoScore",
        qualifiedByName = {"util", "tomatoColor"}),
    @Mapping(
        target = "mtcColor",
        source = "rateImdb.mtcScore",
        qualifiedByName = {"util", "mtcColor"})
  })
  RateMovieImdbVo to(RateImdb rateImdb);
}
