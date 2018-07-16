package com.xj.sun.provideruser;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * Created by Bruce on 2018/7/16 14:21
 */
public class CommonTest {

    @Test
    public void test() throws InterruptedException {
        Date endDate1 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 13).atStartOfDay(ZoneId.systemDefault())));
        Date endDate2 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 15).atStartOfDay(ZoneId.systemDefault())));
        Date endDate3 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 18).atStartOfDay(ZoneId.systemDefault())));
        Date endDate4 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 21).atStartOfDay(ZoneId.systemDefault())));
        Date endDate5 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 23).atStartOfDay(ZoneId.systemDefault())));
        Date endDate6 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 25).atStartOfDay(ZoneId.systemDefault())));
        Date endDate7 = Date.from(Instant.from(
                LocalDate.of(2018, 7, 27).atStartOfDay(ZoneId.systemDefault())));
        Date endDate8 = Date.from(Instant.from(
                LocalDate.of(2018, 8, 13).atStartOfDay(ZoneId.systemDefault())));
        Date endDate9 = Date.from(Instant.from(
                LocalDate.of(2018, 8, 23).atStartOfDay(ZoneId.systemDefault())));
        Date endDate10 = Date.from(Instant.from(
                LocalDate.of(2018, 8, 25).atStartOfDay(ZoneId.systemDefault())));
        List<Date> dates = new ArrayList<>();
        dates.add(endDate1);
        dates.add(endDate2);
        dates.add(endDate3);
        dates.add(endDate4);
        dates.add(endDate5);
        dates.add(endDate6);
        dates.add(endDate7);
        dates.add(endDate8);
        dates.add(endDate9);
        dates.add(endDate10);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println("线程启动: "+Thread.currentThread().getName());
                    cyclicBarrier.await();
                    System.out.println("线程继续: "+Thread.currentThread().getName());
                    System.out.println(DateUtils.Convert(dates.get(finalI)));

                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        TimeUnit.SECONDS.sleep(5);
    }

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Test
    public void test2(){

        LocalDateTime localDateTime = DateUtils.parseDate("2018-07-06 00:12:45");
        System.out.println(localDateTime);

        LocalDateTime parse = LocalDateTime.parse("2018-07-06 00:12:45", dtf);



    }



}
