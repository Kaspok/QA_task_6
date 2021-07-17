package com.github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    private static final String REPOSITORY = "Kaspok/QA_task_6";

    @Test
    void searchIssue() {
        open("https://github.com");
        $("[placeholder = 'Search GitHub']").setValue(REPOSITORY).pressEnter();
        $(".repo-list").$(byLinkText(REPOSITORY)).click();
        $(".UnderlineNav-body").$(byLinkText("Issues")).shouldBe(Condition.visible);
    }
}
