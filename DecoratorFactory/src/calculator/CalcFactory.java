package calculator;

public class CalcFactory implements ICalculableFactory{
    public CalcFactory(Ilog log, ICalculableFactory calculableFactory) {
        this.log = log;
        this.calculableFactory = calculableFactory;
    }

    Ilog log;
    ICalculableFactory calculableFactory;
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(log, calculableFactory.create(primaryArg));
    }
}
