package benchmark;

import domain.Common;
import domain.Occurrence1;
import domain.Occurrence2;
import org.openjdk.jmh.annotations.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Explore {

    @State(Scope.Thread)
    public static class MyState{
        @Setup
        public void doSetup(){
            for(int i=0; i<numberOfObjects; i++){
                LocalDate date = LocalDate.of(2021,10,i%26+1);
                occ1.add(new Occurrence1(date,String.valueOf(i%500),BigDecimal.TEN));
            }

            for(int i=0; i<numberOfObjects; i++){
                LocalDate date = LocalDate.of(2021,10,i%26+1);
                occ2.add(new Occurrence2(date,String.valueOf(i%500),BigDecimal.TEN));
            }
        }
        public static int numberOfObjects = 5_000;
        public static List<Occurrence1> occ1 = new ArrayList<>();
        public static List<Occurrence2> occ2 = new ArrayList<>();
    }



    public void init(){

    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public TreeSet<Common> testMethod1(MyState state) {
        TreeSet<Common> result = new TreeSet<>();
        for(int i=0; i<state.numberOfObjects; i++){
            result.add(state.occ1.get(0));
        }
        for(int i=0; i<state.numberOfObjects; i++){
            result.add(state.occ2.get(0));
        }
        return result;
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public List<Common> testMethod2(MyState state) {
        List<Common> result = new ArrayList<>();
        for(int i=0; i<state.numberOfObjects; i++){
            result.add(state.occ1.get(0));
        }
        for(int i=0; i<state.numberOfObjects; i++){
            result.add(state.occ2.get(0));
        }

        Comparator<Common> comparator = (a,b) -> {
            int dateComparison = a.getDate().compareTo(b.getDate());
            if(dateComparison == 0){
                return a.getType().compareToIgnoreCase(b.getType());
            }

            return dateComparison;
        };

        Collections.sort(result,comparator);
        return result;

    }


}
