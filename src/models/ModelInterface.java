package models;

import java.util.ArrayList;
import java.util.List;

public interface ModelInterface {

  static boolean checkIfPortfolioEmpty(List<Portfolio> userPortfolios) {
    return false;
  }

  boolean checkInputName(String name);

  void creatUser(String username, float buyingPower);


  void addPortfolioUser();

  public void createPortfolio(String name);

  boolean  checkPortfolioName(String input);


  Stock createStock(String companySymbol, long userShared);

  void newXML();


  boolean dataCheckExistInXML(Stock stock, String date);

  boolean checkFileExists(String inFile);

  void addStockPort(Stock stock);

  void readImport(String fileName);
}
