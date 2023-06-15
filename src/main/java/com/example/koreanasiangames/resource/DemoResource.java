package com.example.koreanasiangames.resource;

import com.example.koreanasiangames.dto.ResponseDto;
import com.example.koreanasiangames.repositories.IDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {
    @Autowired
    IDemoRepository iDemoRepository;
    @GetMapping(value = "/findById")
    public ResponseDto findById(@RequestParam(name = "id") Long id) {
        return ResponseDto.of(iDemoRepository.findById(id).get());
    }
}
