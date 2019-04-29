package ua.nic.Cursova.service;

import java.util.List;

public interface IEntityService {
    Object getById (Long id);

    void save (Object object);

    void delete (Long id);

    List getAll ();
}
