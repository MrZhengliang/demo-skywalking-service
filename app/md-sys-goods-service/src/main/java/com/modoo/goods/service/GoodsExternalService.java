package com.modoo.goods.service;

import java.util.List;

import com.modoo.goods.request.GoodsExternalRequest;
import com.modoo.goods.response.ShopGoodsBySkuDTO;

/**
 * @Auther: garry
 * @Date: 2019/1/16 23:48
 * @Description:
 */
public interface GoodsExternalService {
    /**
     * 根据barCode 查询门店商品信息
     *
     * @param request
     * @return
     */
    List<ShopGoodsBySkuDTO> searchShopGoodsBySku(GoodsExternalRequest request);
}
