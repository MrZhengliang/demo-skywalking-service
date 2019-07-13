package com.modoo.goods.web;

import com.modoo.goods.constant.NumberConstants;
import com.modoo.goods.request.GoodsExternalRequest;
import com.modoo.goods.response.ShopGoodsBySkuDTO;
import com.modoo.goods.service.GoodsExternalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品服务对外api
 *
 * @Auther: garry
 * @Date: 2019/1/16 23:45
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping(value = "/goodsExternal", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE}, consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class GoodsExternalController {

    /**
     * 商品service
     */
    @Autowired
    private GoodsExternalService goodsExternalService;


    /**
     * @param goodsExternalRequest
     * @return
     */
    @RequestMapping(value = "/queryShopGoodsBySKu", method = RequestMethod.POST)
    public String queryShopGoodsBySKu(@Validated(GoodsExternalRequest.queryShopGoodsBySKu.class) @RequestBody GoodsExternalRequest goodsExternalRequest) {
        log.info("goodsExternalService.searchShopGoodsBySku 请求参数 -------> {}", goodsExternalRequest.toString());
        List<ShopGoodsBySkuDTO> list = new ArrayList<>(NumberConstants.NUMBER_ZERO);
        try {
            list = goodsExternalService.searchShopGoodsBySku(goodsExternalRequest);
        } catch (Exception e) {
            log.error(" ----- 异常 -----");
            e.printStackTrace();


            /**
             * start:
             * -javaagent:/Users/my/demo-skywalking-service/agent-sys-goods/skywalking-agent.jar
             *
             *
             * post request: http://127.0.0.1:8903/goodsExternal/queryShopGoodsBySKu
             *
             *
             * ERROR:
             * java.lang.NullPointerException
             * 	at com.modoo.goods.web.GoodsExternalController.queryShopGoodsBySKu$original$M3xhBZOc(GoodsExternalController.java:42)
             * 	at com.modoo.goods.web.GoodsExternalController.queryShopGoodsBySKu$original$M3xhBZOc$accessor$uFknEznw(GoodsExternalController.java)
             * 	at com.modoo.goods.web.GoodsExternalController$auxiliary$xrOswd2K.call(Unknown Source)
             * 	at org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstMethodsInter.intercept(InstMethodsInter.java:93)
             * 	at com.modoo.goods.web.GoodsExternalController.queryShopGoodsBySKu(GoodsExternalController.java)
             * 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             * 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             * 	at java.lang.reflect.Method.invoke(Method.java:498)
             * 	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205)
             * 	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest$original$d4899XHz(InvocableHandlerMethod.java:133)
             * 	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest$original$d4899XHz$accessor$hbTOBd9W(InvocableHandlerMethod.java)
             * 	at org.springframework.web.method.support.InvocableHandlerMethod$auxiliary$UpTVLGHk.call(Unknown Source)
             * 	at org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstMethodsInter.intercept(InstMethodsInter.java:93)
             * 	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java)
             * 	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:97)
             * 	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:827)
             * 	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:738)
             * 	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85)
             * 	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:967)
             * 	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:901)
             * 	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970)
             * 	at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:872)
             */
        }
        return "success";
    }
}
