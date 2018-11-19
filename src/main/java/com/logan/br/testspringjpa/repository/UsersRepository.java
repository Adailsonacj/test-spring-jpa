package com.logan.br.testspringjpa.repository;

import com.logan.br.testspringjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
