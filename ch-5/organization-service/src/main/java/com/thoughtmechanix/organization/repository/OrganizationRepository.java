package com.thoughtmechanix.organization.repository;

import com.thoughtmechanix.organization.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,String> {
    Optional<Organization> findById(String organizationId);
}
