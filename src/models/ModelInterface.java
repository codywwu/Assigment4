package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface for model, testing purpose.
 */
public interface ModelInterface {

  static boolean checkIfPortfolioEmpty(List<Portfolio> userPortfolios) {
    return false;
  }

  boolean checkInputName(String name);

  void creatUser(String username, float buyingPower);


  void addPortfolioUser();

  void createPortfolio(String name);

  boolean  checkPortfolioName(String input);

  ArrayList<Portfolio> getPList();

  List<Portfolio> getUserPortfolios();

  Portfolio getPortfolio();

  Stock createStock(String companySymbol, long userShared);

  void newXML();

  String getDatahigh();

  String getDataLow();


  boolean dataCheckExistInXML(Stock stock, String date);

  boolean checkFileExists(String inFile);

  void addStockPort(Stock stock);

  void readImport(String fileName);

  void addPToXML();

  void addCompanyXML(String c);
}
