package demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize="1080x680";
    }
    @Test
    void fillFormTest(){

        open("https://demoqa.com/text-box");
        $(".text-center").shouldHave(text("Text Box"));
        $("#userName").setValue("Fake");
        $("#userEmail").setValue("fakemail@fakemail.com");
        $("#currentAddress").setValue("fake city,fake street, 12/3");
        $("#permanentAddress").setValue("fake city,fake street, 12/3");
        Selenide.actions().scrollToElement($("#submit"));
        $("#submit").click();
        $("#output").shouldBe(visible);




    }

}
