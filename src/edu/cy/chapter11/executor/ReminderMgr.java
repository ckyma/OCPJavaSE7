package edu.cy.chapter11.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.*;

/**
 * Created by yuchen on 1/3/2017.
 */

class Reminder implements Runnable{
    @Override
    public void run() {
        // send reminder emails to all employees
        System.out.println("All mails sent");
    }
}

public class ReminderMgr {
    ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
    Reminder reminder = new Reminder();

    public void sendReminders(){
        service.scheduleAtFixedRate(reminder, 0, 24, HOURS);
    }

    public static void main(String[] args) {
        ReminderMgr mgr = new ReminderMgr();
        mgr.sendReminders();
    }
}
