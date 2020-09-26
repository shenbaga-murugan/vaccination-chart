package com.shenba.vaccination.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Shenbaga Murugan
 */
@Getter
@Setter
@AllArgsConstructor
public class VaccineVersion {
    private String brandName;
    private String manufacturer;
    private Double approxCost;
}
