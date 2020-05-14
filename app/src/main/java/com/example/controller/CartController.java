package com.example.controller;

import android.app.Application;

import com.example.model.product;

import java.util.ArrayList;
import java.util.List;

public class CartController extends Application implements ICartController {

    List<product> productList =new ArrayList<>();

    public CartController() {
        productList.add(new product("chuối Đà Nha Trang", 25000, "chuối ta"));
        productList.add(new product("Sầu riêng", 55000, "Sầu riêng hạt lép"));
        productList.add(new product("Khoai Tây", 15000, "Khoai tây củ to"));
        productList.add(new product("Thanh long", 35000, "Thanh long Ruột đỏ"));
        productList.add(new product("Xoài chua", 10000, "Xoài xoài chua lè chua lét"));
        productList.add(new product("Bưởi", 65000, "Bưởi 5 roi"));
    }
    @Override
    public List<product> getAllProduct() {
        return null;
    }
}
