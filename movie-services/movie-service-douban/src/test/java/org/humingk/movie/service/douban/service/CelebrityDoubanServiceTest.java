package org.humingk.movie.service.douban.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CelebrityDoubanServiceTest {

  @Autowired private CelebrityDoubanService celebrityDoubanService;

  @Test
  public void getCelebrityDoubanByCelebrityDoubanId() {
    System.out.println(celebrityDoubanService.getCelebrityDoubanByCelebrityDoubanId(1054439));
  }

  @Test
  public void getCelebrityDoubanDetailsByCelebrityDoubanId() {
    System.out.println(
        celebrityDoubanService.getCelebrityDoubanDetailsByCelebrityDoubanId(1054439, 10));
  }

  @Test
  public void getSearchTipsCelebrityDoubanListByCelebrityDoubanKeywordStart() {
    System.out.println(
        celebrityDoubanService.getSearchTipsCelebrityDoubanListByCelebrityDoubanKeywordStart(
            "宫", 0, 10));
  }

  @Test
  public void getSearchResultCelebrityDoubanListByCelebrityDoubanKeyword() {
    System.out.println(
        celebrityDoubanService.getSearchResultCelebrityDoubanListByCelebrityDoubanKeyword(
            "爱", 0, 10));
  }
}
