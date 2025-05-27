/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import dal.DBConnect;

/**
 *
 * @author xuant
 */
public class main {
    public class TestConnection {
    public static void main(String[] args) {
        DBConnect db = new DBConnect();
        db.closeConnection(); // Optional, just to see close works too
    }
}
}
