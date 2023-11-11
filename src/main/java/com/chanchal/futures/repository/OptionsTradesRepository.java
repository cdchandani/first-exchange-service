package com.chanchal.futures.repository;

import com.chanchal.futures.bo.FuturesTradesBO;
import com.chanchal.futures.bo.OptionsTradesBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsTradesRepository extends JpaRepository<OptionsTradesBO, Long>{}
