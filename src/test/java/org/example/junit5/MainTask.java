package org.example.junit5;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;



public class MainTask {


    @Test
    public void LoadmainpageTests() {

        Selenide.open("https://bombaylobby.com");
        $x("//html/body/header/div/nav/a[1]").click();
        $x("/html/body/main/section[4]").should(Condition.exist, visible);
    }


    //////----------------------UI Test------------------ ////////


    @Test
    public void DesktopLobbyButtonTests()  {
        Selenide.open("https://bombaylobby.com");
        SelenideElement desktopLobbyLink = $x("//*[@id=\"root\"]/div/div/div/a[1]");
        desktopLobbyLink.click();

//        SelenideElement button = $("#root > div > div > div > a:nth-child(1)");
//        button.shouldBe(visible);
//        button.click();
    }



}
