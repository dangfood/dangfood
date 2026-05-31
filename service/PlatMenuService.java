package com.campusdang.restauration.service;

import com.campusdang.restauration.model.PlatMenu;
import com.campusdang.restauration.repository.PlatMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatMenuService {
    
    @Autowired
    private PlatMenuRepository platMenuRepository;
    
    public PlatMenu savePlat(PlatMenu plat) {
        return platMenuRepository.save(plat);
    }
}