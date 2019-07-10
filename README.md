# demo-skywalking-service

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