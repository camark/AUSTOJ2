package cn.edu.aust.mapper;

import java.util.List;

import cn.edu.aust.pojo.entity.Notify;
import tk.mybatis.mapper.common.Mapper;

public interface NotifyMapper extends Mapper<Notify> {
    /**
     * 查询截止到当前可用的通知
     * @param expriedate 过期时间
     * @return 结果集
     */
    List<Notify> queryListNow(String expriedate);
}