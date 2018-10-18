package br.seap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.seap.model.Convidado;
import br.seap.repository.ConvidadoRepository;

@Service
@Transactional
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public List<Convidado> findAll(){
		return repository.findAll();
	}
	
	public Convidado save(Convidado convidado) {
		return repository.save(convidado);
	}
	
}
