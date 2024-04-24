package com.example.day4cw2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4cw2.model.ChaturyaJob;
import com.example.day4cw2.repository.ChaturyaJobRepo;

@Service
public class ChaturyaJobService {
    public ChaturyaJobRepo jobRepo;
    public ChaturyaJobService(ChaturyaJobRepo jobRepo)
    {
        this.jobRepo = jobRepo;
    }
    public boolean saveJob(ChaturyaJob job)
    {
        try{
            jobRepo.save(job);
        } 
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChaturyaJob> getJobs()
    {
        return jobRepo.findAll();
    }
    public ChaturyaJob getJobById(int id)
    {
        Optional<ChaturyaJob> obj = jobRepo.findById(id);
        return obj.orElse(null);
    }
}
