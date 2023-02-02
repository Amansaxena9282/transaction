package com.training.transaction.controller;
import com.training.transaction.model.Principal;
import com.training.transaction.service.PrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class PrincipalController {
    @Autowired
    private PrincipalService principalService;

    @GetMapping("/getAllPrincipal")
    public List<Principal> getAll() {
        return principalService.getAll();
    }

    @PostMapping("/savePrincipal")
    public Principal savePrincipal(@RequestBody Principal principal) {
        return principalService.addPrincipal(principal);

    }

    @DeleteMapping("/deletePrincipal/{id}")
    public String getDelete(@PathVariable Long id) {
        return principalService.deletePrincipal(id);
    }

    @PutMapping("/updatePrincipal")
    public Principal updatePrincipal(@RequestBody Principal principal) {
        return principalService.updatePrincipal(principal);

    }
}
