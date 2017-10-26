package com.mukundakc.fileuploadRESTApi.service.fileuploadrestservice;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.UnsupportedMediaTypeStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mukundakc.fileuploadRESTApi.service.fileuploadrestservice.entity.FileDaoService;


@RestController
public class FileResource {

	private FileDaoService service;
	
	@PostMapping("/uploadFiles")
	public ResponseEntity<Object> loadFfile(@RequestBody Mfile mfile) throws UnsupportedMediaTypeStatusException  {
		Mfile savedFile = service.uploadFile(mfile);
		URI location = ServletUriComponentsBuilder.
				fromCurrentRequest().path("{id}")
				.buildAndExpand(savedFile.getId()).toUri();
		
		 return ResponseEntity.created(location).build();
	}
	
		
		
	}
	

