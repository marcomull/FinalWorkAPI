package org.example.finalworkapi.Domain.RepositoryInterfaces;

import org.example.finalworkapi.Domain.Entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepository extends JpaRepository<Job, Integer> {
}
