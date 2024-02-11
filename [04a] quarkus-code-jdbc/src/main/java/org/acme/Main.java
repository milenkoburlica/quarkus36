package org.acme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    DataSource ds;
   
    
    public static void main(String... args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        try (Connection connection = ds.getConnection()) {
            // Your JDBC logic goes here
            String query = "SELECT * FROM PST_AUFTRAG WHERE AUFTRAG_ID=?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Set the parameter for the WHERE clause
                preparedStatement.setString(1, "1023");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String column1Value = resultSet.getString("AUFTRAGS_KENNZEICHEN");
                        int column2Value = resultSet.getInt("DDS_ZIELPARTNER_CODE");

                        System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          Quarkus.asyncExit();
          System.exit(0);
      }

        return 0;
    }
}
