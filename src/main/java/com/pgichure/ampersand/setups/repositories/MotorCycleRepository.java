package com.pgichure.ampersand.setups.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgichure.ampersand.setups.models.MotorCycle;

/**
 * @author Paul
 * <p> @MotorCycle data access object
 */
public interface MotorCycleRepository extends JpaRepository<MotorCycle, Long>{

}