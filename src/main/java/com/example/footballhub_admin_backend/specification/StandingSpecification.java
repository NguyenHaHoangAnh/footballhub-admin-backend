package com.example.footballhub_admin_backend.specification;

import com.example.core.specification.SpecSearchCriteria;
import com.example.core.specification.SpecificationBase;
import com.example.footballhub_admin_backend.model.Standing;
import com.example.footballhub_admin_backend.model.Team;

public class StandingSpecification extends SpecificationBase<Standing> {
    public StandingSpecification(SpecSearchCriteria criteria) {
        super(criteria);
    }
}
