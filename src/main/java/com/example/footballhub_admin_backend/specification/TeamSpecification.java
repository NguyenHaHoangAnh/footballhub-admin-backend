package com.example.footballhub_admin_backend.specification;

import com.example.core.specification.SpecSearchCriteria;
import com.example.core.specification.SpecificationBase;
import com.example.footballhub_admin_backend.model.Season;
import com.example.footballhub_admin_backend.model.Team;

public class TeamSpecification extends SpecificationBase<Team> {
    public TeamSpecification(SpecSearchCriteria criteria) {
        super(criteria);
    }
}
