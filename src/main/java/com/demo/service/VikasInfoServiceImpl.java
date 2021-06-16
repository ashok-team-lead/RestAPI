package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.VikasInfoDto;
import com.demo.entites.VikasInfo;
import com.demo.repository.VikasRepository;

@Service
public class VikasInfoServiceImpl implements VikasInfoService {
	@Autowired
	private VikasRepository vikasInfoRepo;

	@Override
	public String save(VikasInfoDto vikasInfoDto) {
		String message = null;
		VikasInfo vikasInfo = new VikasInfo();
		vikasInfo.setAge(vikasInfoDto.getAge());
		vikasInfo.setMobileNo(vikasInfoDto.getMobileNo());
		vikasInfo.setEmailAddress(vikasInfoDto.getEmailAddress());
		vikasInfo.setHeight(vikasInfoDto.getHeight());

		VikasInfo savedVikas = vikasInfoRepo.save(vikasInfo);
		if (savedVikas == null) {
			message = "Data Not Saved";

		}
		String mobileNo = savedVikas.getMobileNo();
		message = "data saved successfully";
		return mobileNo;
	}

	@Override
	public List<VikasInfoDto> findAll() {
		List<VikasInfo> vikasInfoEntity = vikasInfoRepo.findAll();

		return vikasInfoEntity.stream().map(ve -> {
			VikasInfoDto vikasInfoDto = new VikasInfoDto();
			vikasInfoDto.setVikasId(ve.getVikasId());
			vikasInfoDto.setAge(ve.getAge());
			vikasInfoDto.setHeight(ve.getHeight());
			vikasInfoDto.setMobileNo(ve.getMobileNo());
			vikasInfoDto.setEmailAddress(ve.getEmailAddress());
			return vikasInfoDto;
		}).collect(Collectors.toList());
	}

	@Override
	public String upadte(int persoinId) {
		String msg = null;
		Optional<VikasInfo> optDto = vikasInfoRepo.findById(persoinId);
		VikasInfo vikasInfo = optDto.get();
		vikasInfo.setAge(500);
		vikasInfo.setEmailAddress("pallavi@gmail.com");
		vikasInfo.setMobileNo("4561");
		vikasInfo.setHeight(55);
		VikasInfo savedObj = vikasInfoRepo.save(vikasInfo);
		if (savedObj == null) {
			msg = "data not updated";
		}
		msg = "data updated";
		return msg;
	}

	@Override
	public String delete(int personId) {
		String msg = null;
		vikasInfoRepo.deleteById(personId);
		msg = "data deleted " + personId;
		return msg;
	}

}
