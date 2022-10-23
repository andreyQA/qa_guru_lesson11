package GitHubTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSoftAssertionOnSelenidePage {
    @Test
    void searchExampleJUnit5code() {
        Configuration.holdBrowserOpen =true;
        open("https://github.com");
        $(".header-search-input").setValue("Selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $$("#repository-container-header li").findBy(text("Wiki")).click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $$(".wiki-rightbar ul").first().find(By.linkText("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("Using JUnit5")
    }
}
