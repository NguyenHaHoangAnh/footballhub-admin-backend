package com.example.footballhub_admin_backend.specification;

import com.example.core.specification.SpecSearchCriteria;
import com.example.core.specification.SpecificationBase;
import com.example.footballhub_admin_backend.model.Season;

public class SeasonSpecification extends SpecificationBase<Season> {
    public SeasonSpecification(SpecSearchCriteria criteria) {
        super(criteria);
    }
}
