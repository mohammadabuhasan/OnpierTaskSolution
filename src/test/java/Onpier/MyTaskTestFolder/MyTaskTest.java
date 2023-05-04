package Onpier.MyTaskTestFolder;

import org.testng.annotations.Test;
import Onpier.m6.pages.CommonVerification;
import Onpier.m6.pages.ActionsAndVerifications.UploadPicture;

import static Onpier.m6.pages.CommonVerification.getCommonVerification;
import static Onpier.m6.pages.ActionsAndVerifications.UploadPicture.Formlabel;
import static Onpier.m6.pages.ActionsAndVerifications.UploadPicture.getUploadPicture;

public class MyTaskTest extends BaseTestClass{

    UploadPicture uploadPic = getUploadPicture();
    CommonVerification common = getCommonVerification();

    @Test
    public void basicFilterByTest() throws Exception {

        uploadPic.act().scrollToUpload()
        .clickSecondLabel();
        common.verifyIsDisplayed(Formlabel());
        uploadPic.act().clickApplyForBouns();

        uploadPic.verify().NavigationToUploadPage();

        uploadPic.act()
                .UploadImages(0)

                .UploadImages(0)

                .clickRemoveImage()

                .UploadImages(0)

                .clickNext(0)

                .selectType("Company")

                .selectType("PrivatePerson")

                .selectSalutation("Divers")

                .fillInfo("Max","Jhon","Max@gmail.com","Jhoon weee","NL21INGB1424738261")

                .clickNext(1)

                .clickCheckboxs(0)

                .clickCheckboxs(1)

                .clickCheckboxs(2)

                .clickNext(2);

        uploadPic.verify().NavigationToCompletePage();
    }
}
