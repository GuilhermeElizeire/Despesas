package ajitsingh.com.expensemanager.table;

import android.provider.BaseColumns;

import java.util.ArrayList;
import java.util.List;

import ajitsingh.com.expensemanager.model.ExpenseType;

public class ExpenseTypeTable implements BaseColumns {
  public static final String TABLE_NAME = "expense_types";
  public static final String TYPE = "type";

  public static final String CREATE_TABLE_QUERY = "create table " + TABLE_NAME + " ("+ _ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "+ TYPE +" TEXT)";
  public static final String SELECT_ALL = "SELECT * FROM " + TABLE_NAME;

  public static List<ExpenseType> seedData(){
    ArrayList<ExpenseType> expenseTypes = new ArrayList<>();
    expenseTypes.add(new ExpenseType("Alimento"));
    expenseTypes.add(new ExpenseType("Viagem"));
    expenseTypes.add(new ExpenseType("Saúde"));
    expenseTypes.add(new ExpenseType("Shopping"));
    expenseTypes.add(new ExpenseType("Aluguel"));
    expenseTypes.add(new ExpenseType("PIX/TOC/TED"));
    expenseTypes.add(new ExpenseType("Outros"));

    return expenseTypes;
  }
}
