package com.example.footballhub_admin_backend.specification;

import com.example.core.specification.SpecSearchCriteria;
import com.example.core.specification.SpecificationBase;
import com.example.footballhub_admin_backend.model.Match;
import com.example.footballhub_admin_backend.model.Team;

public class MatchSpecification extends SpecificationBase<Match> {
    public MatchSpecification(SpecSearchCriteria criteria) {
        super(criteria);
    }
}
