package com.xiaomi.gmall.ums.service.impl;

//import com.xiaomi.gmall.ums.entity.MemberProductCategoryRelation;
import com.xiaomi.gmall.ums.mapper.MemberProductCategoryRelationMapper;
//import com.xiaomi.gmall.ums.service.MemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomi.ums.entity.MemberProductCategoryRelation;
import com.xiaomi.ums.service.MemberProductCategoryRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelation> implements MemberProductCategoryRelationService {

}
