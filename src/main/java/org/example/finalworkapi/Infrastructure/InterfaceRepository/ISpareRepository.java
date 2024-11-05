package org.example.finalworkapi.Infrastructure.InterfaceRepository;

import org.example.finalworkapi.Domain.Entities.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpareRepository extends JpaRepository<SparePart, Integer> {
}
