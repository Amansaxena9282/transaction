package com.training.transaction.serviceImpl;

import com.training.transaction.model.Principal;
import com.training.transaction.service.PrincipalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Service
public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public List<Principal> getAll() {
        List<Principal> getAll=new ArrayList<>();
        Principal p1=new Principal(1,"kajal",22);
        Principal p2=new Principal(2,"riya",23);
        Principal p3=new Principal(3,"shalu",24);
        getAll.add(p1);
        getAll.add(p2);
        getAll.add(p3);
        return getAll;
    }

    @Override
    public Principal addPrincipal(Principal principal) {
        return principal;
    }

    @Override
    public Principal updatePrincipal(Principal principal) {
        return principal;
    }

    @Override
    public String deletePrincipal(Long id) {
        return "delete success:"+id;
    }
}
