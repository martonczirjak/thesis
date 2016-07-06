package com.thesis.services;

import java.util.List;

import com.thesis.modells.Band;

public interface BandService {
	
	public List<Band> getBands();
	
	public void regBand(Band band);
	
	public void delBand(Long bandId);
	

}
