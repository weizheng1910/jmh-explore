package domain;

import java.time.LocalDate;

public abstract class Common implements Comparable<Common>{

    public abstract LocalDate getDate();
    public abstract String getType();

    public int compareTo(Common that){
        int dateComparison = getDate().compareTo(that.getDate());
        if(dateComparison == 0){
            return getType().compareToIgnoreCase(that.getType());
        }

        return dateComparison;
    }

}
