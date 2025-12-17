package com.example.footballhub_admin_backend.repository;

import com.example.core.repository.BaseRepo;
import com.example.footballhub_admin_backend.model.Match;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends BaseRepo<Match, Integer> {
}
