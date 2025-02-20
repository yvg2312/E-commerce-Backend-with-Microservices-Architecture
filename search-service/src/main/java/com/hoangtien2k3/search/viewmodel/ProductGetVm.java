package com.hoangtien2k3.search.viewmodel;

import com.hoangtien2k3.search.document.Product;
import java.time.ZonedDateTime;

public record ProductGetVm(Long id,
                           String name,
                           String slug,
                           Long thumbnailId,
                           Double price,
                           Boolean isAllowedToOrder,
                           Boolean isPublished,
                           Boolean isFeatured,
                           Boolean isVisibleIndividually,
                           ZonedDateTime createdOn) {
    public static ProductGetVm fromModel(Product product) {
        return new ProductGetVm(
                product.getId(),
                product.getName(),
                product.getSlug(),
                product.getThumbnailMediaId(),
                product.getPrice(),
                product.getIsAllowedToOrder(),
                product.getIsPublished(),
                product.getIsFeatured(),
                product.getIsVisibleIndividually(),
                product.getCreatedOn()
        );
    }
}
