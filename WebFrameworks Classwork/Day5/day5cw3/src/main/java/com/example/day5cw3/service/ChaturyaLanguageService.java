package com.example.day5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.model.ChaturyaLanguage;
import com.example.day5cw3.repository.ChaturyaLanguageRepo;

@Service
public class ChaturyaLanguageService {
    private ChaturyaLanguageRepo languageRepo;
    public ChaturyaLanguageService(ChaturyaLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(ChaturyaLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<ChaturyaLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,ChaturyaLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public ChaturyaLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
