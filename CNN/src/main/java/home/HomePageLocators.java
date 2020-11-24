package home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HomePageLocators {

    public static final String Cnn="CNN - Breaking News, Latest News and Videos";
    public static final String signin="//header/div[1]/div[1]/div[1]/div[6]/div[1]/*[1]";
    public static final String EmailAddress="loginEmail";
    public static   Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

}
