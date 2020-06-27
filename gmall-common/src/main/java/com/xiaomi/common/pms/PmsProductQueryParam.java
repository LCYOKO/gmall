package com.xiaomi.common.pms;


import lombok.Data;

/**
 * 产品查询参数
 */
@Data
public class PmsProductQueryParam {

    private Integer publishStatus;

    private Integer verifyStatus;

    private String keyword;

    private String productSn;

    private Long productCategoryId;

    private Long brandId;

    private Long pageNum=1L;

    private Long pageSize=5L;

}
