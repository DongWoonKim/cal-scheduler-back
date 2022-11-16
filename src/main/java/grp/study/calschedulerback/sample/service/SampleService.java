package grp.study.calschedulerback.sample.service;

import grp.study.calschedulerback.sample.dao.SampleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    private SampleDao sampleDao;

    public long getSampleCnt() {
        Object cnt = sampleDao.selectOne("mybatis.mapper.sample.selectAllCnt", "");
        return Long.parseLong(cnt.toString());
    }

}
