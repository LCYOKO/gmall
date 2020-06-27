package com.xiaomi.common;

import lombok.Data;

import java.util.List;

/**
 * @author l
 * @create 2020-03-12-19:29
 */
@Data
public class PageInfo {
 private Long total;
 private Long totalPage;
 private Long pageSize;
 private List<? extends Object> list;
}
