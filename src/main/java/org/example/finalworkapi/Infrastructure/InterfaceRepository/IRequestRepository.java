package org.example.finalworkapi.Infrastructure.InterfaceRepository;

import org.example.finalworkapi.Domain.Entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRequestRepository extends JpaRepository<Request, Integer> {
}
