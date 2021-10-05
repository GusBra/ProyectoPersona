package com.example.demo.services;
import java.util.List;
import java.util.Optional;

import com.example.demo.models.entity.Estado;
import com.example.demo.repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class EstadoService  implements EstadoRepository{

    @Autowired
    private EstadoRepository estadoRepository;

   

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public List<Estado> findAllbyPais(int id){

        return null;
    }













    @Override
    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        
    }

    @Override
    public void deleteAllInBatch() {
        
    }

    @Override
    public void deleteAllInBatch(Iterable<Estado> entities) {
        
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }


    @Override
    public List<Estado> findAllById(Iterable<Long> ids) {
        return null;
    }


    @Override
    public void flush() {
       
    }

    @Override
    public Estado getById(Long id) {
        return null;
    }

    @Override
    public Estado getOne(Long id) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Estado entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<Estado> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> S save(S entity) {
        return estadoRepository.save(entity);
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
