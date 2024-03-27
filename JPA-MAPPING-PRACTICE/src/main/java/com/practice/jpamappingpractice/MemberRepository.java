package com.practice.jpamappingpractice;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(MemberEntity member) {

        manager.persist(member);

    }
}
