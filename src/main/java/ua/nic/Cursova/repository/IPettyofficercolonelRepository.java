package ua.nic.Cursova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.nic.Cursova.model.PettyofficercolonelEntity;

/*
    Для того, щоб забезпечити взаємодію із БД,
    потрібно створити репозиторій для кожної сущності
*/
public interface IPettyofficercolonelRepository extends JpaRepository<PettyofficercolonelEntity, Long> {} 
