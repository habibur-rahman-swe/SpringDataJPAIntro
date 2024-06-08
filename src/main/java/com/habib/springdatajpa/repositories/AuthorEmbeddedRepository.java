package com.habib.springdatajpa.repositories;

import com.habib.springdatajpa.domain.composite.AuthorEmbedded;
import com.habib.springdatajpa.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {

}
