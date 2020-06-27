package com.xiaomi.gmall.ums.service.impl;

//import com.xiaomi.gmall.ums.entity.Member;
import com.xiaomi.gmall.ums.mapper.MemberMapper;
//import com.xiaomi.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomi.ums.entity.Member;
import com.xiaomi.ums.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
