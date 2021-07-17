package com.github;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем начальную страницу github")
    public WebSteps openPage() {
        open("https://github.com");
        return this;
    }

    @Step("Ищем репозиторий {repository}")
    public WebSteps searchRepository(String repository) {
        $("[placeholder = 'Search GitHub']").setValue(repository).pressEnter();
        return this;
    }

    @Step("Переходим в репозиторий {repository}")
    public WebSteps openRepository(String repository) {
        $(".repo-list").$(byLinkText(repository)).click();
        return this;
    }

    @Step("Проверяем, что в блоке навигации репозитория присутствует Issues")
    public WebSteps checkIssues() {
        $(".UnderlineNav-body").$(byLinkText("Issues")).shouldBe(Condition.visible);
        return this;
    }
}
