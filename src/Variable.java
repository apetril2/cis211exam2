/**
 * Created by Drew on 11/9/2017.
 */
public class Variable
{

    public char variable;
    public double value;

    public Variable(char variable, double value)
    {
        //@SuppressWarnings("unchecked")
        //T[] tempVariable = (T[]) new Object[2];
        //tempVariable[0] = variable;
        //tempVariable[1] = value;
        //variableObject = tempVariable;
        this.variable = variable;
        this.value = value;
    }

    public char getVariable() {return this.variable;}

    public double getValue() {return this.value;}



}
