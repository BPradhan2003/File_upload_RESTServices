package com.mukundakc.fileuploadRESTApi.service.fileuploadrestservice.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mukundakc.fileuploadRESTApi.service.fileuploadrestservice.Mfile;

@Component
@Repository
@Transactional
public class FileDaoService  {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public Mfile uploadFile(Mfile mfile) {
		 entityManager.persist(mfile);
		return mfile;
		
		
		}
	

}
