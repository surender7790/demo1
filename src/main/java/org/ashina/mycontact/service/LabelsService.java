package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Labels;
import java.util.List;

public interface LabelsService {

    Iterable<Labels> findAll();

    Labels findOne(Integer id);

    void save(Labels contact);

    void delete(Integer id);

}
