package com.modoo.goods.service.impl;

import com.modoo.goods.request.GoodsExternalRequest;
import com.modoo.goods.response.ShopGoodsBySkuDTO;
import com.modoo.goods.service.GoodsExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: garry
 * @Date: 2019/1/16 23:53
 * @Description:
 */
@Component
public class GoodsExternalServiceImpl implements GoodsExternalService {
    private Logger logger = LoggerFactory.getLogger(GoodsExternalServiceImpl.class);
    @Override
    public List<ShopGoodsBySkuDTO> searchShopGoodsBySku(GoodsExternalRequest request) {
        logger.info("--------- hello world 1----------");
        return null;
    }
}
