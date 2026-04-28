package com.example.footballhub_admin_backend.specification;

import com.example.core.specification.SpecSearchCriteria;
import com.example.core.specification.SpecificationBase;
import com.example.footballhub_admin_backend.model.Competition;

public class CompetitionSpecification extends SpecificationBase<Competition> {
    public CompetitionSpecification(SpecSearchCriteria criteria) {
        super(criteria);
    }
}
