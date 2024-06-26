package org.web.application.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.application.server.entity.MatchingFilterEntity;
import org.web.application.server.entity.UserEntity;

import java.util.List;
import java.util.Optional;

@Repository
public interface MatchingFilterRepository extends JpaRepository<MatchingFilterEntity, Long> {

    Optional<MatchingFilterEntity> findByUserEntity(UserEntity userEntity);
}
