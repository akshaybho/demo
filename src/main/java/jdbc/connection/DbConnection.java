package jdbc.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class DbConnection {

    @Autowired
    private DataSource dataSource;


    public void checkDbConnection()
    {

        try
        {
            Connection con = dataSource.getConnection();

            if(con!=null)
            {
                System.out.println("connection created successfully");
            }
            else
            {
                System.out.println("connection failed");
            }
        }
        catch(Exception e)
        {
            System.out.println("connection failed");
            e.printStackTrace();
        }


    }
}
