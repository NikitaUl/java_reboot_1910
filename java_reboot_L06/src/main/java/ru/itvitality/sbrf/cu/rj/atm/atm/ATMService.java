package ru.itvitality.sbrf.cu.rj.atm.atm;

import java.io.IOException;

public interface ATMService {
    Integer getBalance();
    void saveToFile(String fileName) throws IOException;
    void RecoverFromFile(String fileName) throws IOException;
}
