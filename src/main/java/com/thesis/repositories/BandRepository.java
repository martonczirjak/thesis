package com.thesis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thesis.modells.Band;

@Repository
public interface BandRepository extends JpaRepository<Band, Long> {


}

