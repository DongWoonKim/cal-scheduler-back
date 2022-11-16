package grp.study.calschedulerback.sample.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {

    @Autowired
    private SqlSessionTemplate sessionTemplate;

    public <T> T selectOne(String sqlId, Object paramObj) {
        return sessionTemplate.selectOne( sqlId, paramObj);
    }

}
