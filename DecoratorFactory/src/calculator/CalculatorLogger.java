package calculator;

public class CalculatorLogger implements Calculable{

    private final Ilog log;
    private final Calculable cale;

    public CalculatorLogger(Ilog log, Calculable cale){

        this.log = log;
        this.cale = cale;
        log.log("Первы аргумент равен: " + cale.getResult());
    }
    @Override
    public Calculable sum(int arg) {
        log.log("Сумируем: " + arg);
        return cale.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        log.log("Умножаем " + arg);
        return cale.multi(arg);
    }

    @Override
    public int getResult() {
        int temp = cale.getResult();
        log.log("Полученый результат: " + temp);
        return temp;
    }
}
