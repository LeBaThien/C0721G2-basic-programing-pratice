package com.example.demo.service;

import com.example.demo.model.BenhAn;
import com.example.demo.repository.IBenhAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BenhAnService implements IBenhAnService {

    @Autowired
    private IBenhAnRepository benhAnRepository;

    @Override
    public Iterable<BenhAn> findAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public Optional<BenhAn> findById(Long id) {
        return benhAnRepository.findById(id);
    }

    @Override
    public BenhAn save(BenhAn benhAn) {
        return benhAnRepository.save(benhAn);
    }

    @Override
    public void remove(Long id) {
        benhAnRepository.deleteById(id);
    }
}
