package org.openjfx.model;

import java.util.ArrayList;
import java.util.List;

public class YMCategory {
    private String categoryName;
    private String categoryDescription;
    private List<YMProject> projects;
    
    public YMCategory(String categoryName, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.projects = new ArrayList<>();
    }

    public YMCategory(String categoryName) {
        this.categoryName = categoryName;
        this.projects = new ArrayList<>();
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<YMProject> getProjects() {
        return projects;
    }
    
    public void addProject(YMProject project) {
        projects.add(project);
    }
}
