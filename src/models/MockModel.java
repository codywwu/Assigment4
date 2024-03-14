package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import views.View;

public class MockModel implements ModelInterface {

  private StringBuilder log;
  private final Stock empty= new Stock("ABC", 333);

  private List<Portfolio> userPortfolios;
  private User user;

  private Portfolio portfolio;

  public MockModel(StringBuilder log) {
    this.log=log;
    this.portfolio=new Portfolio("Po1");
    this.portfolio.addStock(empty);
    this.user=new User("inNAme",1000);
    user.addPortfolio(portfolio);
    userPortfolios=user.getPortfolioList();
  }

  @Override
  public boolean checkInputName(String name) {
    return Objects.equals(name, user.userName);
  }

  @Override
  public void creatUser(String username, float buyingPower) {
    log.append("creating user ").append(username).append(" with ").append(buyingPower)
        .append(" buy in power");
  }

  @Override
  public void addPortfolioUser() {
    userPortfolios.add(portfolio);
    log.append("Portfolio added to user's data");
  }

  @Override
  public void createPortfolio(String name) {
    log.append(name).append(" portfolio created");
  }

  @Override
  public boolean checkPortfolioName(String input) {
    for (Portfolio portfolio : userPortfolios) {
      if (portfolio.name.equals(input)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public ArrayList<Portfolio> getPList() {
    return new ArrayList<>(userPortfolios);
  }

  @Override
  public List<Portfolio> getUserPortfolios() {
    return userPortfolios;
  }

  @Override
  public Portfolio getPortfolio() {
    return portfolio;
  }

  public Stock createStock(String companySymbol, long userShared) {
    log.append("created null Stock data");
    return null; // Or return a specific Stock object
  }

  @Override
  public void newXML() {
    log.append("XML data read");
  }

  @Override
  public String getDatahigh() {
    return null;
  }

  @Override
  public String getDataLow() {
    return null;
  }

  @Override
  public boolean dataCheckExistInXML(Stock stock, String date) {
    log.append("check if data has an XML file");
    return true;
  }

  @Override
  public boolean checkFileExists(String inFile) {

    log.append("check if file had been created");
    return false;
  }

  @Override
  public void addStockPort(Stock stock) {
    log.append("Stock added");
  }

  @Override
  public void readImport(String fileName) {
    log.append("read files");
  }

  @Override
  public void addPToXML() {

  }

  @Override
  public void addCompanyXML(String c) {

  }

  public boolean checkIfPortfolioEmpty(List<Portfolio> userPortfolios){
    log.append("if user created any portfolio");
    return true;
  }
}
