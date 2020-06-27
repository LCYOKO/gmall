package com.xiaomi.gmall.pms.service.impl;

import com.xiaomi.gmall.pms.entity.Comment;
import com.xiaomi.gmall.pms.mapper.CommentMapper;
import com.xiaomi.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
