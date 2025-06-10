package jdbc.dao;

import jdbc.connection.JdbcTemplateConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDemo {

    @Autowired
    private JdbcTemplate jt;
    public void insertValues()
    {
        int id = 1;
        String name = "Akshay";
        int age = 23;

        String sql_query = "INSERT INTO student VALUES(?,?,?)";

        int count = jt.update(sql_query, id, name, age);
        if(count>0)
        {
            System.out.println("INSERTION SUCCESS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
