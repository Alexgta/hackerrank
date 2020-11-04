package com.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/*interface Calculator
{
    void calculate(final double[] data);
}*/


public class Test8 {

    public void doAllWork(double[] data, List<CalculatorImpl> calcs)
    {
        for ( CalculatorImpl calc: calcs)
            work(data, calc);
    }

    public void work(double[] data, CalculatorImpl calc)
    {
        Arrays.sort(data);
        calc.calculate(data);
    }

    public void doAllWorkNew6(double[] data, List<CalculatorImpl> calcs)
    {
        for ( CalculatorImpl calc : calcs) {
            Arrays.sort(data);
            calc.calculate(data);
            //Stream stream = Stream.of(data).sorted(); //.forEach(calc :: calculate);
        }
    }

    public void doAllWorkNew(double[] data, List<CalculatorImpl> calcs) {

        double[] dataSorted = DoubleStream.of(data).sorted().toArray();
        Consumer<CalculatorImpl> consumer = c -> c.calculate(dataSorted);
        calcs.parallelStream().forEach(c -> consumer.accept(c));

    }

    public static void main(String[] args) {

        /*String a = "A";
        String b = a;*/

        Test8 test8 = new Test8();
        double[] myData = {5.30, 1.25, 4.01, 3.33};

        List<CalculatorImpl> myCalcs = new ArrayList<>();
        myCalcs.add(new CalculatorImpl());
        myCalcs.add(new CalculatorImpl());

        test8.doAllWorkNew(myData, myCalcs);


    }




}
