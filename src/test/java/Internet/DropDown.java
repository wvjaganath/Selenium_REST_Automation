package Internet;

import Pages.Internet.Dropdown;

import Utilities.Base;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;

public class DropDown extends Base {

    @Test
    public void dropdown() throws IOException {

        Dropdown dropdown = new Dropdown(driver);
        Select select = new Select(dropdown.dropDown());
        select.selectByValue("2");
        System.out.printf("Selected value is: %s\n", select.getFirstSelectedOption().getText());

    }
}
