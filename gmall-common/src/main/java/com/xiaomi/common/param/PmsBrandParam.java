package com.xiaomi.common.param;



import lombok.Data;


import java.io.Serializable;

/**
 * 品牌传递参数
 */
@Data
public class PmsBrandParam implements Serializable {

    private String name;
    //@ApiModelProperty(value = "品牌首字母")
    private String firstLetter;
    //@ApiModelProperty(value = "排序字段")
    //@Min(value = 0, message = "排序最小为0")
    private Integer sort;
    //@ApiModelProperty(value = "是否为厂家制造商")
    private Integer factoryStatus;
    //@ApiModelProperty(value = "是否进行显示")
    private Integer showStatus;
    //@ApiModelProperty(value = "品牌logo",required = true)
    private String logo;
    //@ApiModelProperty(value = "品牌大图")
    private String bigPic;
    //@ApiModelProperty(value = "品牌故事")
    private String brandStory;
    private Integer pageSize;
    private Integer pageNum;


}
