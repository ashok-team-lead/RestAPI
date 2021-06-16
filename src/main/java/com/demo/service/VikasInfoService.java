package com.demo.service;

import java.util.List;

import com.demo.dto.VikasInfoDto;
import com.demo.entites.VikasInfo;

public interface VikasInfoService {

	String save(VikasInfoDto vikasInfoDto);
	List<VikasInfoDto> findAll(); 
	
	String upadte(int persoinId);
	String delete(int personId);

}
