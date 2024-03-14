package models;

import models.Model;
import models.Portfolio;
import models.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ModelTest {

    @Test
    public void testCheckIfPortfolioEmpty_EmptyList() {
        List<Portfolio> portfolios = new ArrayList<>();
        boolean isEmpty = Model.checkIfPortfolioEmpty(portfolios);
        Assert.assertTrue(isEmpty);
    }

    @Test
    public void testCheckIfPortfolioEmpty_NonEmptyList() {
        List<Portfolio> portfolios = new ArrayList<>();
        portfolios.add(new Portfolio("Test Portfolio"));
        boolean isEmpty = Model.checkIfPortfolioEmpty(portfolios);
        Assert.assertFalse(isEmpty);
    }

    @Test
    public void testCreatePortfolio() {
        Model model = new Model();
        String portfolioName = "Test Portfolio";
        model.createPortfolio(portfolioName);

        Portfolio result = model.getPortfolio();
        Assert.assertNotNull(result);
       // Assert.assertEquals(portfolioName, result.getName());
    }

    @Test
    public void testCheckFileExists() {
        Model model = new Model();
        String existingFileName = "existingFile"; // Make sure this file actually exists in ./InputData/
        String nonExistingFileName = "nonExistingFile"; // This file should not exist

        Assert.assertTrue("Should return true for existing files", model.checkFileExists(existingFileName));
        Assert.assertFalse("Should return false for non-existing files", model.checkFileExists(nonExistingFileName));
    }

    @Test
    public void testCheckPortfolioNameExists() {
        User user= new User("Test user",1000);
        // Directly add portfolio names to the user's portfolio list for testing

        Portfolio p1 = new Portfolio("Tech") ;
        Portfolio p2 = new Portfolio("Health") ;
        Portfolio p3 = new Portfolio("Finace") ;
        user.addPortfolio(p1);
        user.addPortfolio(p2);
        user.addPortfolio(p3);

       assertNotNull(user.getPortfolioList());
    }
}


