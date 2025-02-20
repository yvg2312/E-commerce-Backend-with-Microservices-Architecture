package com.hoangtien2k3.search.viewmodel;


import java.util.List;

public record ProductEsDetailVm(
        Long id,
        String name,
        String slug,
        Double price,
        boolean isPublished,
        boolean isVisibleIndividually,
        boolean isAllowedToOrder,
        boolean isFeatured,
        Long thumbnailMediaId,
        String brand,
        List<String> categories,
        List<String> attributes) {
}
