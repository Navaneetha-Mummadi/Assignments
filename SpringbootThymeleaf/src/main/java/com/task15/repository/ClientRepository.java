package com.task15.repository;

import com.task15.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
public interface ClientRepository extends JpaRepository<Client, Long> {
}

