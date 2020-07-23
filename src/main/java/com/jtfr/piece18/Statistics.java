
package com.jtfr.piece18;

import java.util.Collection;

import org.apache.commons.lang3.ObjectUtils.Null;

public class Statistics {

    private Long max;
    private Long min;
    private Long average;
    private Long sum;
    private Long percentile99;
    private Long percentile999;

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getAverage() {
        return average;
    }

    public void setAverage(Long average) {
        this.average = average;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public Long getPercentile99() {
        return percentile99;
    }

    public void setPercentile99(Long percentile99) {
        this.percentile99 = percentile99;
    }

    public Long getPercentile999() {
        return percentile999;
    }

    public void setPercentile999(Long percentile999) {
        this.percentile999 = percentile999;
    }

    // 所有的计算都在一起
    public Statistics count(Collection<Long> dataSet) {
        Statistics statistics = new Statistics();
        return statistics;
    }

    // 拆分
    public Long max(Collection<Long> dataSet){return null;}
    public Long min(Collection<Long> dataSet){return null;}
    public Long average(Collection<Long> dataSet){return null;}

}
