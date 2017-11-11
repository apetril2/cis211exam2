/**
 * Created by Drew on 11/9/2017.
 */
import java.util.ArrayList;

public class SymbolTable
{
    public String strExpression;
    public String strOperator = new String();
    public String strVariable;
    public String strInfix;
    public ArrayList<Variable> variableArrayList = new ArrayList<>();

    public SymbolTable(String strInput)
    {
        strExpression = scan(strInput);
        for (int i = 0; i < strExpression.length(); i++)
        {
            if (strExpression.charAt(i) == '^' || strExpression.charAt(i) == '*' || strExpression.charAt(i) == '/' || strExpression.charAt(i) == '+' || strExpression.charAt(i) == '-')
            {
                strOperator += strExpression.charAt(i);
            }
        }

        variableArrayList = buildTable(strExpression);


        strInfix = buildInfix(strVariable, strOperator);



    }

    public String scan(String s)
    {
        return s.replace(" ", "");
    }

    public ArrayList<Variable> buildTable(String s)
    {
        s = s.replace("*"," ");
        s = s.replace("/"," ");
        s = s.replace("+"," ");
        s = s.replace("-"," ");
        s = s.replace("^"," ");
        String[] sArray = s.split(" ");
        variableArrayList.add(new Variable('A', Double.parseDouble(sArray[0])));
        variableArrayList.add(new Variable('B', Double.parseDouble(sArray[1])));
        variableArrayList.add(new Variable('C', Double.parseDouble(sArray[2])));
        variableArrayList.add(new Variable('D', Double.parseDouble(sArray[3])));
        variableArrayList.add(new Variable('E', Double.parseDouble(sArray[4])));
        variableArrayList.add(new Variable('F', Double.parseDouble(sArray[5])));
        variableArrayList.add(new Variable('G', Double.parseDouble(sArray[6])));


        strVariable = "ABCDEFG";

        return variableArrayList;
    }

    public String buildInfix(String sVariable, String sOperator)
    {
        String result = new String();
        int count = 0;
        for (int i = 0; i < sVariable.length() - 1; i++)
        {
            result += sVariable.charAt(i);
            result += sOperator.charAt(i);
            count++;
        }
        result += sVariable.charAt(count);
        return result;
    }



    private String getStrExpression() {return this.strExpression;}

    private String getStrOperator() {return this.strOperator;}





}
