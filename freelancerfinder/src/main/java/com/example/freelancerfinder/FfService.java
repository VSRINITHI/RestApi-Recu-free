package com.example.freelancerfinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FfService {
    @Autowired
    FfRepo fr;

    public Ff create(Ff f) {
        return fr.save(f);
    }

    public ResponseEntity<List<Ff>> get() {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    public List<Ff> getAll() {
        return(List<Ff>)fr.findAll();
    }

    public Ff getById(String field) {
        return fr.findById(field).orElse(null);
    }

    public boolean updateDetails(String field, Ff f) {
       if(fr.findById(field)==null)
       {
        return false;
       }
       try{
        fr.save(f);
       }
       catch(Exception e)
       {
        return false;
       }
       return true;
    }

    public boolean deleteDetails(String name) {
        if(fr.findById(name)==null)
        {
            return false;
        }
        fr.deleteById(name);
        return true;
    }

    
}
