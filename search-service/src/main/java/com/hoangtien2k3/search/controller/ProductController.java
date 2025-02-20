package com.hoangtien2k3.search.controller;

import com.hoangtien2k3.search.constant.enums.SortType;
import com.hoangtien2k3.search.service.ProductService;
import com.hoangtien2k3.search.viewmodel.ProductListGetVm;
import com.hoangtien2k3.search.viewmodel.ProductNameListVm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/storefront/catalog-search")
    public ResponseEntity<ProductListGetVm> findProductAdvance(@RequestParam(defaultValue = "") String keyword,
                                                               @RequestParam(defaultValue = "0") Integer page,
                                                               @RequestParam(defaultValue = "12") Integer size,
                                                               @RequestParam(required = false) String brand,
                                                               @RequestParam(required = false) String category,
                                                               @RequestParam(required = false) String attribute,
                                                               @RequestParam(required = false) Double minPrice,
                                                               @RequestParam(required = false) Double maxPrice,
                                                               @RequestParam(defaultValue = "DEFAULT")
                                                               SortType sortType) {
        return ResponseEntity.ok(productService.findProductAdvance(
                keyword, page, size, brand, category, attribute, minPrice, maxPrice, sortType));
    }

    @GetMapping("/storefront/search_suggest")
    public ResponseEntity<ProductNameListVm> productSearchAutoComplete(@RequestParam String keyword) {
        return ResponseEntity.ok(productService.autoCompleteProductName(keyword));
    }
}
