/**
 * Alexander Belokon & educators
 * <p>
 * Copyright (c) 2022 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker and for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.ArrayTaskList;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.AbstractTaskList.AbstractTaskList;
import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.task.Task;


/**
 * Class ArrayTaskList   .
 *
 * @author Alexander Belokon
 * @version 1.1 03 Feb 2021
 */
public class ArrayTaskList extends AbstractTaskList {
    private Task taskArray[];
    // task array objects class Task
    private int count;
    private int sizeofarray;
    private static final int extendVar=2;
    //the size of the section in the sharedArray allocated to this message.
    public ArrayTaskList()
    {
        taskArray = new Task[1];
        count = 0;
        sizeofarray = 1;
    }
    //Methods for adding / deleting task:
    public void add(Task task) {
        super.add(task);
    }

    public void remove(Task task) {
//remove task
        super.remove(task);
    }

    Task getTask(int index) {

        
    }
//get task by index number beginning 0.
}
