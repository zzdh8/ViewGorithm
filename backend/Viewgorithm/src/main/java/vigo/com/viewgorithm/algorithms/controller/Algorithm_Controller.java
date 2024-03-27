package vigo.com.viewgorithm.algorithms.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vigo.com.viewgorithm.algorithms.service.AlgorithmProvider;
@RestController
@RequiredArgsConstructor
public class Algorithm_Controller {

    private AlgorithmProvider provider;

    @GetMapping("/algorithm/{language}")
    public ResponseEntity<String> sendCodes(@PathVariable String language){
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
