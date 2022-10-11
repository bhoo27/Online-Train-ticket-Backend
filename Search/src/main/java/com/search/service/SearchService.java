package com.search.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.entity.Train;
import com.search.repository.TrainRepository;
@Service
public class SearchService {

	@Autowired
	private TrainRepository trainrepo;

	public Train save(Train train) {
		return trainrepo.save(train);
	}

	public void delete(long id) {
		trainrepo.deleteById(id);
	}

	public List<Train> findAll() {
		return trainrepo.findAll();
	}

	public Object getTrainById(long id) {
		return trainrepo.findById(id);
	}

	

	

	

	
		
}