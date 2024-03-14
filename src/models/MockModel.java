package models;

import java.util.Objects;
import views.View;

public class MockModel implements ModelInterface {

  private StringBuilder log;
  private final Stock empty= new Stock("ABC", 333);

  public MockModel(StringBuilder log) {
    this.log=log;

  }

  @Override
  public boolean checkInputName(String name) {
    log.append("inName is in the Data");
    return Objects.equals(name, "inNAme");
  }

  @Override
  public void creatUser(String username, float buyingPower) {
    log.append("creating user ").append(username).append(" with ").append(buyingPower)
        .append(" buy in power");
  }

  @Override
  public void addPortfolioUser() {
    log.append("added user to data");
  }

  @Override
  public void createPortfolio(String name) {
    log.append("portfolio created");
  }

  @Override
  public boolean checkPortfolioName(String input) {
    return false;
  }

  @Override
  public Stock createStock(String companySymbol, long userShared) {

    return empty;
  }

  @Override
  public void newXML() {
    log.append("XML data read");
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
}
