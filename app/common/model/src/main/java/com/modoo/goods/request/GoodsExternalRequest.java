package com.modoo.goods.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @Auther: garry
 * @Date: 2019/1/16 23:50
 * @Description:
 */
@Data
public class GoodsExternalRequest implements Serializable {

    public interface queryShopGoodsBySKu {
    }

    public interface queryShopGoodsByShopCode {
    }

    public interface queryShopGoodsByIds {
    }

    public interface queryOrgGoods {
    }

    public interface queryShopGoodsIds {
    }

    public interface queryShopGoodsPrice {
    }

    public interface modifyOrg {
    }


    /**
     * 机构id
     */
    @NotNull(message = "机构id不能为空", groups = {queryOrgGoods.class, modifyOrg.class})
    private String orgId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * skulist
     */
    private List<String> skuList;

    @NotEmpty(message = "门店code不能为空", groups = {queryShopGoodsByShopCode.class})
    private List<String> shopCodes;

    /**
     * 门店code
     */
    @NotBlank(message = "门店code不能为空", groups = {modifyOrg.class})
    private String shopCode;

    /**
     * 门店商品request 通过shopcode，sku查询商品信息
     */
    @NotEmpty(message = "shode，sku不能为空", groups = {queryShopGoodsBySKu.class})
    private List<ShopGoodsRequest> shopGoodsRequests;

    /**
     * ids 门店商品ids
     */
    @NotEmpty(message = "门店商品id不能为空", groups = {queryShopGoodsByIds.class, queryShopGoodsIds.class, queryShopGoodsPrice.class})
    private List<String> ids;

    /**
     * 上架渠道 1门店 2 网店
     */
    private int channleType;

    /**
     * 价格排序
     */
    private String priceSort;

    /**
     * 销量排序
     */
    private String saleSort;

    /**
     * 条形码
     */
    private String goodsBarCode;

    /**
     * 商品Code
     */
    private String goodsCode;

    /**
     * goodsCatgCode 商品分类
     */
    private String goodsCatgCode;

    /**
     * 品牌id
     */
    private String brandId;
}
