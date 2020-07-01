package com.xiaomi.gmall.pms.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaomi.common.param.PmsBrandParam;
import com.xiaomi.pms.entity.Brand;
import com.xiaomi.gmall.pms.mapper.BrandMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaomi.pms.service.BrandService;
import org.apache.dubbo.config.annotation.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Override
    public Map<String,Object> getList(PmsBrandParam param) {
        IPage<Brand> iPage = this.baseMapper.selectPage(new Page<Brand>(param.getPageNum(), param.getPageSize()), null);
        HashMap<String, Object> map = new HashMap<>();
        map.put("pageSize",param.getPageSize());
        map.put("totalPage",iPage.getPages());
        map.put("total",iPage.getTotal());
        map.put("pageNum",param.getPageNum());
        map.put("list",iPage.getRecords());
        return map;
    }

    @Override
    public Brand selById(Long id) {
        return this.baseMapper.selectById(id);
    }
}
