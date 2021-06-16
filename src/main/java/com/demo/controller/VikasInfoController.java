package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.VikasInfoDto;
import com.demo.service.VikasInfoService;

@RestController
@RequestMapping("/vikasInfo")
public class VikasInfoController {
	@Autowired
	private VikasInfoService vikasInfoService;

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveVikasInfo(@RequestBody VikasInfoDto vikasInfoDto) {
		String Msg = vikasInfoService.save(vikasInfoDto);
		System.out.println("method called success!!!!!!!!!!!!!!!!!!!!!!");
		return new ResponseEntity<String>(Msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/find", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<VikasInfoDto>> showVikasInfo() {
		List<VikasInfoDto> vikasEntity = vikasInfoService.findAll();

		return new ResponseEntity<>(vikasEntity, HttpStatus.OK);
	}

	@PutMapping(value = "/update/{persoinId}")
	public ResponseEntity<String> updateVikasInfo(@PathVariable("persoinId") int persoinId) {
		String msg = vikasInfoService.upadte(persoinId);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{personId}")
	public ResponseEntity<String> deleteByID(@PathVariable("personId") int personId) {

		String msg = vikasInfoService.delete(personId);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
