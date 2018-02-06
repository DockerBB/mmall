package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;

public interface IProductService {
    ServerResponse saveOrUpdateProduct (Product product);

    ServerResponse getProductList(int pageNum, int pageSize) ;

    ServerResponse searchProduct (String productName,Integer productId,int pageNum,int pageSize);
}
