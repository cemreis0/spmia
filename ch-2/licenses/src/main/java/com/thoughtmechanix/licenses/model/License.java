package com.thoughtmechanix.licenses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;
}
