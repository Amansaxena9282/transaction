package com.training.transaction.service;
import com.training.transaction.model.Principal;

import java.util.List;
public interface PrincipalService {
    //get
    public List<Principal> getAll();
    //post
    public Principal addPrincipal(Principal principal);
    //put
    public Principal updatePrincipal(Principal principal);
    //delete
    public String deletePrincipal(Long id);

}
