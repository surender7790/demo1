package org.ashina.mycontact.service;

import java.util.List;

import org.ashina.mycontact.entity.Labels;
import org.ashina.mycontact.repository.LabelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelsServiceImpl implements LabelsService{
	 @Autowired
	    private LabelsRepository labelsRepository;

	    @Override
	    public Iterable<Labels> findAll() {
	        return labelsRepository.findAll();
	    }


	    @Override
	    public Labels findOne(Integer id) {
	        return labelsRepository.findOne(id);
	    }

	    @Override
	    public void save(Labels label) {
	        labelsRepository.save(label);
	    }

	    @Override
	    public void delete(Integer id) {
	        labelsRepository.delete(id);
	    }
}
