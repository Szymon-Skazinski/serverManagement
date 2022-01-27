package szymon.skazinski.serverMangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import szymon.skazinski.serverMangement.model.Server;

public interface ServerRepository extends JpaRepository<Server,Long> {

    Server findByIpAddress(String ipAddress);
}
