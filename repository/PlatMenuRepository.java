package com.campusdang.restauration.repository;

import com.campusdang.restauration.model.PlatMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlatMenuRepository extends JpaRepository<PlatMenu, Long> {
    
    List<PlatMenu> findByMenuId(Long menuId);
    
    List<PlatMenu> findByCategorieAndDisponibleTrue(String categorie);
}