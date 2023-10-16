package org.example.app.service.impl;

import jakarta.transaction.Transactional;
import org.example.app.entity.User;
import org.example.app.repository.impl.UserRepoImpl;
import org.example.app.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements BaseService<User> {
    @Autowired
    UserRepoImpl userRepo;

    @Override
    @Transactional
    public void save(User user) {
        userRepo.save(user);


    }

    @Override
    @Transactional
    public List<User> fetchAll() {
        return userRepo.fetchAll();
    }

    @Override
    @Transactional
    public User fetchById(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void delete(Long id) {

    }
}
