package com.shenba.vaccination.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Shenbaga Murugan
 */
@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vaccine {
    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private Integer fromDays;
    private Integer toDays;
    private String route;
    private String site;
    private BigDecimal approxCost;
    private String comments;
    private List<VaccineVersion> vaccineVersions;
}
