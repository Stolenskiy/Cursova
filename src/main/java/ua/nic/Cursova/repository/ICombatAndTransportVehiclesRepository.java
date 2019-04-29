package ua.nic.Cursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nic.Cursova.model.CombatAndTransportVehiclesEntity;

/*
    Для того, щоб забезпечити взаємодію із БД,
    потрібно створити репозиторій для кожної сущності
*/
public interface ICombatAndTransportVehiclesRepository extends JpaRepository<CombatAndTransportVehiclesEntity, Long> {} 
