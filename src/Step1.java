import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Drew on 11/9/2017.
 */
public class Step1
{
    public Step1() throws IOException
    {
        String strInput = "9.5 - 4 * 3 ^ 2 /6 +8 * 4";
        SymbolTable st = new SymbolTable(strInput);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("exam2out.txt"));

        bufferedWriter.write("< Exam 2: Andrew Petrillo >\r\n");
        bufferedWriter.write("Valid Expression = " +st.strExpression +"\r\n");
        bufferedWriter.write("Operator String = " +st.strOperator +"\r\n");


        bufferedWriter.write("\nSymbol Table\n");


        for (int i = 0; i < st.variableArrayList.size(); i++)
        {
            bufferedWriter.write( st.variableArrayList.get(i).variable + "\t" + st.variableArrayList.get(i).value + "\n\n");
        }

        bufferedWriter.write("Variable String = " + st.strVariable +"\r\n");
        bufferedWriter.write("infix = " +st.strInfix);


        bufferedWriter.close();

    }
}
