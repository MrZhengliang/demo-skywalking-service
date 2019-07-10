package com.modoo.goods.response;

import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: garry
 * @Date: 2019/1/17 13:46
 * @Description:
 */
@Data
public class ShopGoodsBySkuDTO implements Serializable {
    /**
     * id g_shop_goods id.
     */
    private String id;
    /**
     * goodsId 商品id.
     */
    private String goodsId;
    /**
     * orgId 机构id.
     */
    private String orgId;
    /**
     * goodsBarCode 门店商品编码.
     */
    private String goodsBarCode;
    /**
     * shopCode
     */
    private String shopCode;
    /**
     * goodsName 名称.
     */
    private String goodsName;
    /**
     * goodsUnit 单位.
     */
    private String goodsUnit;
    /**
     * saleType 销售类型.
     */
    private String saleType;
    /**
     * goodsCatgCode 商品类别.
     */
    private String goodsCatgCode;
    /**
     * g_shop_goods.getImgForQueryShopGoods .
     */
    private String imgUrl;
    /**
     * g_shop_goods.getSpec .
     */
    private List<String> spec;

    /**
     * 规格描述
     */
    private String specDes;

    /**
     * 销售类型描述
     */
    private String saleTypeDesc;

    /**
     * goodsTypeCode 商品类型.
     */
    private String goodsTypeCode;
    /**
     * shopSalePrice 门店售价.
     */
    private BigDecimal shopSalePrice;
    /**
     * onlineSalePrice 网店售价.
     */
    private BigDecimal onlineSalePrice;

    /**
     * 商品类型 实物/虚拟
     */
    private String goodsType;

    /**
     * g_shop_goods.getSaleChannel .
     */
    private List<String> saleChannel;

    /**
     * 上架渠道
     */
    private String saleChannleDesc;

    /**
     * orgDes
     */
    private String orgDes;

    /**
     * shopName
     */
    private String shopName;

    /**
     * brandName
     */
    private String brandName;

    /**
     * 门店商品ids
     */
    private List<String> shopGoodsIds;

    /**
     * 是否参加优惠
     */
    private Integer discountFlag;

    /**
     * 是否校验库存
     */
    private Integer isStock;

    /**
     * 库存数量
     */
    private Integer totalStock;

//    public String getSpecDes() {
//        if(!ObjectUtils.isEmpty(spec)){
//            return Joiner.on(",").join(spec);
//        }
//        return null;
//    }
//
//    public void setSpecDes(String specDes) {
//        this.specDes = specDes;
//    }
//
//    public String getSaleTypeDesc() {
//        return GoodsSaleTypeEnum.getEnum(saleType).getDes();
//    }
//
//    public void setSaleTypeDesc(String saleTypeDesc) {
//        this.saleTypeDesc = saleTypeDesc;
//    }
//
//    public String getGoodsType() {
//        return goodsTypeCode;
//    }
//
//    public void setGoodsType(String goodsType) {
//        this.goodsType = goodsType;
//    }
//
//    public String getSaleChannleDesc() {
//        if(CollectionUtil.isNotEmpty(saleChannel)){
//            StringBuffer sb = new StringBuffer();
//            for(String code : saleChannel){
//                sb.append(SaleChannelTypeEnum.getEnum(code).getDes());
//                sb.append(" ");
//            }
//            return sb.toString();
//        }
//
//        return null;
//    }
//
//    public void setSaleChannleDesc(String saleChannleDesc) {
//        this.saleChannleDesc = saleChannleDesc;
//    }
}
