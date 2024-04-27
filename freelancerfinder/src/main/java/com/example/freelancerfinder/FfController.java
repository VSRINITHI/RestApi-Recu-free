package com.example.freelancerfinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FfController {
    @Autowired
    FfService fs;
    @PostMapping("/details")
    public ResponseEntity<Ff> adddetails(@RequestBody Ff f)
    {
         Ff ff=fs.create(f);
         return new ResponseEntity<>(ff,HttpStatus.CREATED);
    }
    @GetMapping("/alldetails")
    public ResponseEntity<List<Ff>> getall()
    {
        try{
            List<Ff> f=fs.getAll();
            return new ResponseEntity<>(f,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/details/{name}")
    public ResponseEntity<Ff> get(@PathVariable("name") String name)
    {
        try{
            Ff f=fs.getById(name);
            return new ResponseEntity<>(f,HttpStatus.OK);

        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

        }
    }
    @PutMapping("/detail/update/{name}")
    public ResponseEntity<Ff> putMethod(@PathVariable("name") String name ,@RequestBody Ff f)
    {
        if(fs.updateDetails(name, f)==true)
        {
            return new ResponseEntity<>(f,HttpStatus.OK);

        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

    }
    @DeleteMapping("/detail/delete/{name}")
    public ResponseEntity<Boolean> deleteMethod(@PathVariable( "name" )String name)
    {
        if(fs.deleteDetails(name)==true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);

        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);

    }
}
