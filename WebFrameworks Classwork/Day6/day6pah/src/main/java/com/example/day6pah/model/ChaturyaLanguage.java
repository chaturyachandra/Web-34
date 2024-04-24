package com.example.day6pah.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChaturyaLanguage {
    @Id
    private int languageId;
    private String languageName;
    private int languageCode;
    private String country;
    public ChaturyaLanguage(int languageId, String languageName, int languageCode, String country) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.languageCode = languageCode;
        this.country = country;
    }
    public ChaturyaLanguage() {
    }
    public int getLanguageId() {
        return languageId;
    }
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    public String getLanguageName() {
        return languageName;
    }
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    public int getLanguageCode() {
        return languageCode;
    }
    public void setLanguageCode(int languageCode) {
        this.languageCode = languageCode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
}
