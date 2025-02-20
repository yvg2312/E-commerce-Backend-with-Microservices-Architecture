package com.hoangtien2k3.media.viewmodel;

import com.hoangtien2k3.media.utils.ValidFileType;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

public record MediaPostVm(
    String caption,
    @NotNull
    @ValidFileType(allowedTypes = {"image/jpeg", "image/png", "image/gif"},
        message = "File type not allowed. Allowed types are: JPEG, PNG, GIF")
    MultipartFile multipartFile,
    String fileNameOverride
) {
}
