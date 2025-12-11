package com.cog.pract.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.cog.pract.model.VehicleOwner;
import com.cog.pract.repository.VehicleOwnerRepo;

import jakarta.transaction.Transactional;

@ExtendWith(MockitoExtension.class)
class VehicleOwnerServiceImplTest {
	
	@Mock
	private VehicleOwnerRepo vehicleOwnerRepo;
	@InjectMocks
	VehicleOwnerService vehicleOwnrService;
	
	private VehicleOwner testOwner;
	
	private final String VALID_VEHICLE_NUMBER="TS09FW8991";
	private final String INVALID_VEHICLE_NUMBER="LS09FW8991";

	@BeforeEach
	void setup() {
		testOwner = new VehicleOwner();
	}
	  @Test void test() { 
		  fail("Not yet implemented"); 
		  }
	  @Test
	  void findVehicleNumber_ValidVehicleNumber() {
		  
		  when(vehicleOwnerRepo.findByNumberPlateCustom(VALID_VEHICLE_NUMBER)).thenReturn(testOwner);
		  VehicleOwner result = vehicleOwnrService.findVehcleNumber(VALID_VEHICLE_NUMBER);
		  assertEquals(testOwner, result,"This is vaidvehicle Number");
		  
		  
	  }
	  @Test
	  void findVehicleNumber_InValidVehicleNumber() {
		  
		  when(vehicleOwnerRepo.findByNumberPlateCustom(INVALID_VEHICLE_NUMBER)).thenReturn(testOwner);
		  VehicleOwner result = vehicleOwnrService.findVehcleNumber(INVALID_VEHICLE_NUMBER);
		  assertEquals(testOwner, result,"This is vaidvehicle Number");
		  
		  
	  }
	  
	  @Test
	    void findVehcleNumber_NullInput_ReturnsNull() {
	        // 1. Arrange (Stub the dependency call)
	        // Tell Mockito to return null when the mocked method is called with null
	        when(vehicleOwnerRepo.findByNumberPlateCustom(null))
	            .thenReturn(null);

	        // 2. Act (Call the method under test)
	        VehicleOwner result = vehicleOwnrService.findVehcleNumber(null);

	        // 3. Assert (Verify the result)
	        assertNull(result, "Should return null when the input vehicle number is null.");
	    }

}
