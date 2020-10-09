package cn.bcf.example.springcloud.cluster.mallweb.feign;

import cn.bcf.example.springcloud.cluster.mallweb.fallback.ProductServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "product-service",fallback = ProductServiceFallback.class)
public interface ProductService extends cn.bcf.example.springcloud.cluster.productserviceapi.service.ProductService {

}
