package com.xiaomi.pms.service;

import com.xiaomi.common.param.PmsBrandParam;
import com.xiaomi.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author lcy
 * @since 2020-02-25
 */
public interface BrandService extends IService<Brand> {

    Map<String,Object> getList(PmsBrandParam param);
}
