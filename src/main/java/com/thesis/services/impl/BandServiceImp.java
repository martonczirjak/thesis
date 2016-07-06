package com.thesis.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesis.modells.Band;
import com.thesis.repositories.BandRepository;
import com.thesis.services.BandService;

@Service
public class BandServiceImp implements BandService {
	
	
	@Autowired
	private BandRepository bandrepo;

	@Override
	public List<Band> getBands() {
		// TODO Auto-generated method stub
		return bandrepo.findAll();
	}

	@Override
	public void regBand(Band band) {
		bandrepo.save(band);
	}

	@Override
	public void delBand(Long bandId) {
		// TODO Auto-generated method stub
		
	}


	

}
