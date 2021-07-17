package com.github;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {

    private static final String REPOSITORY = "Kaspok/QA_task_6";

    WebSteps wb = new WebSteps();

    @Test
    void annotatedSearchIssues() {
        wb.openPage()
                .searchRepository(REPOSITORY)
                .openRepository(REPOSITORY);

        wb.checkIssues();
    }
}
