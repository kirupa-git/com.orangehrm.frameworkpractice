package com.orangehrm.commonutils.dataprovider;

import com.orangehrm.commonutils.Xls_Reader;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import static com.orangehrm.commonutils.configurationfile.config;

public class loginpagedatas {

    String[][] data=null;

    public String[][] getexceldatas() throws IOException {

            Xls_Reader excelreading = new Xls_Reader(config().getProperty("excelpath"));
            int rowcount = excelreading.getRowCount(config().getProperty("sheetname"));
            int columncount = excelreading.getColumnCount(config().getProperty("sheetname"));

            String[][] testdata = new String[rowcount-1][columncount];
            //i is row

            for (int i = 1; i < rowcount; i++) {
                for (int j = 0; j < columncount; j++) {
                    testdata[i-1][j] = excelreading.getCellData(config().getProperty("sheetname"), j, i);
                }
            }

            return testdata;

    }

    @DataProvider(name = "credentials")
    public Object[] logindetails() throws IOException {
        data = getexceldatas();
        return data;


    }
}
