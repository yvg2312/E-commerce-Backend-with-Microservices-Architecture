package com.hoangtien2k3.tax.viewmodel.taxclass;

import com.hoangtien2k3.tax.model.TaxClass;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record TaxClassPostVm(@NotBlank String id, @Size(min = 1, max = 450) String name) {

    public TaxClass toModel() {
        TaxClass taxClass = new TaxClass();
        taxClass.setName(name);
        return taxClass;
    }

}
