package com.pratap.flightcheckin.integration;

import com.pratap.flightcheckin.integration.dto.Reservation;
import com.pratap.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	Reservation findReservation(Long id);
	
	Reservation updateReservation(ReservationUpdateRequest request);
}
