package ConnectionDB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testMain {

    public static Logger logger = LoggerFactory.getLogger(testMain.class);

    public static void main(String[] args) {
        CreateNewTable createNewTable = new CreateNewTable();
        GetDataFromDB getDataFromDB = new GetDataFromDB();
        InsertDataToDB insertDataToDB = new InsertDataToDB();


        //создание таблицы в бд - работает
        //createNewTable.createNewTableInDB();

        //insertDataToDB.insertData(new DataRowList( ));

        //получить все данные из БД - работает
        //getDataFromDB.getAllDataFromDB();

        //получить данные из БД по номеру строки - работает
        //getDataFromDB.getDataOnNumber(3);

    }
}
