package testStateFarmInsurance;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stateFarmInsurance.Insurance;

public class InsuranceTest extends WebAPI {
    Insurance insurance;

    @BeforeMethod
    public void gitInit() {
        insurance = PageFactory.initElements(driver, Insurance.class);

    }

    @Test(enabled = true)
    public void testHomeProperty() throws InterruptedException {
        insurance.homePropertyWithCredential();
        insurance.validateHomePropertyCredential();
    }

    @Test(enabled = false)
    public void tesLife() throws InterruptedException {
        insurance.lifeWithCredential();
        insurance.validateLifeCredential();
    }

    @Test(enabled = false)
    public void testHealth() throws InterruptedException {
        insurance.healthWithCredential();
        insurance.validateHealthCredential();
    }



    @Test(enabled = false)
    public void testBoat() throws InterruptedException {
        insurance.boatWithCredential();
        insurance.validateBoat();
    }

    @Test(enabled = false)
    public void testAutoInsuranceSavings() throws InterruptedException {
        insurance.autoInsuranceSavingsWithCredential();
        insurance.validateAutoInsuranceSavings();
    }

    @Test(enabled = false)
    public void testAutoInsuranceSavings1() throws InterruptedException {
        insurance.autoInsuranceSavings1WithCredential();
        insurance.validateAutoInsuranceSavings1();
    }

    @Test(enabled = false)
    public void testAutoInsuranceSavings2() throws InterruptedException {
        insurance.autoInsuranceSavings2WithCredential();
        insurance.validateAutoInsuranceSavings2();
    }

    @Test(enabled = false)
    public void testSteerClearAnsDiscounts() throws InterruptedException {
        insurance.steerClearAnsDiscountsWithCredential();
        insurance.validateSteerClearAnsDiscounts();
    }

    @Test(enabled = false)
    public void testSteerClearAnsDiscounts1() throws InterruptedException {
        insurance.steerClearAnsDiscounts1WithCredential();
        insurance.validateSteerClearAnsDiscounts1();


    }

    @Test(enabled = false)
    public void testSteerClearAnsDiscounts2() throws InterruptedException {
        insurance.steerClearAnsDiscounts2WithCredential();
        insurance.validateSteerClearAnsDiscounts2();


    }

    @Test(enabled = false)

    public void testSteerClearAnsDiscounts3() throws InterruptedException {
        insurance.steerClearAnsDiscounts2WithCredential();
        insurance.validateSteerClearAnsDiscounts2();

    }

    @Test(enabled = false)
    public void testSteerClearAnsDiscounts4() throws InterruptedException {
        insurance.steerClearAnsDiscounts4WithCredential();
        insurance.validateSteerClearAnsDiscounts4();

    }

    @Test(enabled = false)
    public void testSteerClearAnsDiscounts5() throws InterruptedException {
        insurance.steerClearAnsDiscounts5WithCredential();
        insurance.validateSteerClearAnsDiscounts5();
    }

    @Test(enabled = false)
    public void testDriveSafeAndSave1() throws InterruptedException {
        insurance.driveSafeAndSaveWithCredential();
        insurance.validateDriveSafeAndSave1();
    }

    @Test(enabled = false)
    public void testDriveSafeAndSave2() throws InterruptedException {
        insurance.driveSafeAndSave2WithCredential();
        insurance.validateDriveSafeAndSave2();
    }

    @Test(enabled = false)
    public void testPetMedicalInsurance() throws InterruptedException {
        insurance.petMedicalInsuranceWithCredential();
        insurance.validatePetMedicalInsurance();
    }

    @Test(enabled = false)
    public void testPetMedicalInsurance1() throws InterruptedException {
        insurance.petMedicalInsurance1WithCredential();
        insurance.validatePetMedicalInsurance1();
    }

    @Test(enabled = false)
    public void testPetMedicalInsurance2() throws InterruptedException {
        insurance.petMedicalInsurance2WithCredential();
        insurance.validatePetMedicalInsurance2();


    }

    @Test(enabled = false)
    public void testPetMedicalInsurance3() throws InterruptedException {
        insurance.petMedicalInsurance3WithCredential();
        insurance.validatePetMedicalInsurance3();
    }
}