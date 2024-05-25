package com.habib.springdatajpa.repositories;

import com.habib.springdatajpa.domain.composite.AuthorComposite;
import com.habib.springdatajpa.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
