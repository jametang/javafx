package org.openjfx.model;

import java.util.ArrayList;
import java.util.List;

public class YMProject {
    private String projectName;
    private List<YMProjectTestBase> tests;
    
    public YMProject(String projectName) {
        this.projectName = projectName;
        this.tests = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public List<YMProjectTestBase> getTests() {
        return tests;
    }

    public void addTest(YMProjectTestBase test) {
        tests.add(test);
    }
    
}
