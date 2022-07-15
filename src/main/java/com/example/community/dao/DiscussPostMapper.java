package com.example.community.dao;

import com.example.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lmy
 * @create 2022-07-14-16:59
 * 评论
 */
@Mapper
public interface DiscussPostMapper {
    //查询一页的评论
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    //表里总共有多少条数据，分两种情况1.在大厅上看所有的帖子，2.自己的主页看自己的总帖子数
    // 在大厅时id不用传值，在个人主页时需要传值
    int selectDiscussPostRows(@Param("userId") int userId);
}
