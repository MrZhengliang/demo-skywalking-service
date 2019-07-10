package com.modoo.goods.request;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: garry
 * @Date: 2018/12/27 11:05
 * @Description:
 */
@Data
public class ShopGoodsRequest implements Serializable {

    public interface shopSpecGroup{}

    public interface skuStock{}

    public interface batchChangeGoods{}//批量门店商品上下架

    public interface searchShopGoodsDetail{}

    public interface searchShopGoodsByCatg{}//根据商品分类查询商品

    public interface addShopGoods{}

    public interface queryShopGoods{}

    public interface batchModifyShopPrice{}

    public interface  lockOrDeblockingStock{}

    public interface  searchShopGoodsByPinyin{}

    public interface  searchShopGoodsByBarCode{}

    public interface  serachShopGoodsByGroupId{}

    public interface  modifySales{}

    public interface  useStock{}

    public interface  queryProperty{}




    /**
     * id ID.
     */
    @NotNull(message = "id不能为空",groups = {queryProperty.class,searchShopGoodsDetail.class,lockOrDeblockingStock.class,modifySales.class})
    private String id;

    /**
     * count 销售数量
     */
    @NotNull(message = "数量不能为空",groups = {modifySales.class,lockOrDeblockingStock.class})
    @Min(value = 0,message = "数量大于0",groups = {modifySales.class,lockOrDeblockingStock.class})
    private Integer count;
    /**
     * orgId 机构id.
     */
    private String orgId;
    /**
     * goodsMode 商品录入方式 1 商品库选择 2 自定义商品.
     */
   @NotNull(message = "商品来源不能为空",groups = {addShopGoods.class})
    private Integer goodsMode;
    /**
     * totalStock 总库存.
     */
    private Long totalStock;
    /**
     * useStock 占用库存/已使用库存.
     */
    private Long useStock;
    /**
     * goodsGroupId 商品分组Id.
     */
    @NotNull(message = "商品分组不能为空",groups = {addShopGoods.class,serachShopGoodsByGroupId.class})
    private String goodsGroupId;
    /**
     * saleType 销售类型.
     */
    @NotNull(message = "销售类型不能为空",groups = {addShopGoods.class})
    private String saleType;
    /**
     * shopCode 所属门店code.
     */
    @NotNull(message = "门店code不能为空",groups = {addShopGoods.class})
    private String shopCode;
    /**
     * goodsCode 商品编码.
     */
    private String goodsCode;
    /**
     * goodsName 商品名称.
     */
    @NotEmpty(message = "商品名称不能为空",groups = {addShopGoods.class})
    private String goodsName;
    /**
     * pinyinCode 拼音码.
     */
    @NotEmpty(message = "拼音码不能为空",groups = {searchShopGoodsByPinyin.class})
    private String pinyinCode;
    /**
     * goodsUnit 库存单位.
     */
    @NotEmpty(message = "库存单位不能为空",groups = {addShopGoods.class})
    private String goodsUnit;
    /**
     * goodsBarCode 商品条码单独销售即sku.
     */
    @NotEmpty(message = "商品条码不能为空",groups = {addShopGoods.class,searchShopGoodsByBarCode.class})
    private String goodsBarCode;
    /**
     * goodsFirstCatgCode 商品一级分类code.
     */
    //   @NotEmpty(message = "商品第一分类不能为空",groups = {searchShopGoodsByCatg.class,addShopGoods.class})
    private String goodsFirstCatgCode;
    /**
     * goodsSecondCatgCode 商品二级分类code.
     */
    //  @NotEmpty(message = "商品第二分类不能为空",groups = {searchShopGoodsByCatg.class,addShopGoods.class})
    private String goodsSecondCatgCode;

    @NotEmpty(message = "商品分类不能为空",groups = {searchShopGoodsByCatg.class,addShopGoods.class})
    private String goodsCatgCode;
    /**
     * goodsTypeCode 商品类别编码.
     */
    @NotEmpty(message = "商品类别编码不能为空",groups = {addShopGoods.class})
    private String goodsTypeCode;
    /**
     * expressTemplate 运费模版.
     */
    private String expressTemplate;
    /**
     * 品牌
     */
    private String brandId;
    /**
     * status 商品状态 0 下架 1 上架.
     */
    private Integer status;
    /**
     * isDiscount 是否参与折扣 0 不参与 1 参与.
     */
    private Integer discountFlag;
    /**
     * expressCount 运费重量值.
     */
    private BigDecimal expressCount;
    /**
     * shopSalePrice 门店零售价.
     */
    @NotNull(message = "门店价格不能为空",groups = {batchModifyShopPrice.class})
    private BigDecimal shopSalePrice;
    /**
     * onlineSalePrice 网店零售价.
     */
    private BigDecimal onlineSalePrice;
    /**
     * onlineOriginalPrice 网店入划价.
     */
    private BigDecimal onlineOriginalPrice;


    private List<String> skuList;
    /**
     *商品销售渠道
     * @return
     */
    private List<String> saleChannel;

    /**
     * 门店商品ids
     */
    @NotEmpty(message = "门店商品Id不能为空",groups = {batchChangeGoods.class,batchModifyShopPrice.class,useStock.class})
    private List<String> shopGoodsIds;

    /**
     * 商品id
     */
    @NotNull(message = "商品id不能为空", groups = {shopSpecGroup.class})
    private String goodsId;

    /**
     * sku
     */
    @NotBlank(message = "请选择具体的商品规格", groups = {skuStock.class})
    private String skuNo;

    /**
     * 操作类型 1 上架 2 下架
     */
    @NotBlank(message = "请选择操作类型",groups = {batchChangeGoods.class})
    private String operateType;

    /**
     * 销售渠道 1 门店 2 网店
     */
    @NotBlank(message = "请选择渠道类型",groups = {batchChangeGoods.class})
    private String channleType;

    /**
     * 销售渠道 1 门店 2 网店 多个
     */
    private List<String> channleTypes;


    /**
     * 价格排序
     */
    private String priceSort;

    /**
     * 销量排序
     */
    private String saleSort;

    /**
     * merchantId 客户id.
     */
    private String merchantId;

    private List<String> shopCodes;

    /**
     * 拥金比例
     */
    private Integer commissionRate;

    /**
     * isStock 是否设置库存 1设置 0 不设置.
     */
    private Integer isStock;
}
