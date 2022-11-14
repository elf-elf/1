package ru.elf.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class TestForms {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;

    }

    @Test
    void fillFormTest(){

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Ibragim");
        $("#lastName").setValue("QA");
        $("#userEmail").setValue("ibragimQA@test.ru");
        $(withText("Female")).click();
        $("#userNumber").setValue("89008004444");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").$(withText("May")).click();
        $(".react-datepicker__year-select").$(withText("1996")).click();
        $x("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $(withText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("Street 1");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $("#firstName").setValue("Ibragim");
    }
}
