/**
 * Alexander Belokon & educators
 * <p>
 * Copyright (c) 2022 Netcracker Educational Center
 * <p>
 * This software is an educational exercise and is to be used by educators
 * in education center Netcracker and for use by students of the automatic QA course
 * and is used as a student's practical work.
 */
package com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.AbstractTaskList;

import com.nc.edu.ta.AlexanderMykolayevichBelokon.pr2.task.Task;

/**
 * Class AbstractTasklist   is a class which cannot be instantiated, meaning you cannot create new instances of an
 * abstract class. The purpose of an abstract class is to function as a base for subclasses.
 *
 * @version 1.1 03 Feb 2021
 * @author Alexander Belokon
 */
public abstract class AbstractTaskList {
    private Task taskArray[];
        // task array objects class Task
        private int count;
        private int sizeofarray;
        private static final int extendVar=2;
    //the size of the section in the sharedArray allocated to this message.


        public AbstractTaskList()
        {
            taskArray = new Task[1];
            count = 0;
            sizeofarray = 1;
        }
    protected void add(Task task) {
        if (task != null){
            //^^^Method for adding not unique tasks to list.
            // The ability to add empty tasks should be disabled by the implementation.
            if (count == sizeofarray)
            {
            //invoking the growSize() method that creates an array of double size
                Task temp[] = null;
                if (count == sizeofarray)
                {
                      //initialize a size + extension array of array
                    temp = new Task[sizeofarray + extendVar];
                    {
                        for (int i = 0; i < sizeofarray; i++)
                        {
                        //copies all the elements of the old array
                            temp[i] = taskArray[i];
                        }
                    }
                }
                taskArray = temp;
                sizeofarray= sizeofarray +extendVar;
            }
            //appends an element at the end of the array
            taskArray[count] = task;
            count++;
            }

        }



    protected void remove(Task task) {
        //^^^Method for deleting all tasks which are equal input parameter.
        //The ability to delete an empty task should be disabled by the implementation.
            if ( task != null){
                //this if choose if task exist
        for(int i=0; i< taskArray.length ; i++)
        //this for loop is using for array elements
                {if ( task == taskArray[i]){
                    for (int j = count - 1; j >= i; j--)
                    {
                       //shifting all the elements to the left from the specified index
                        taskArray[j + 1] = taskArray[j];
                    }

                }
                }
            }


    }


    public int size() {

        //^^^number of task in this list.
        return this.count;
    }


    Task getTask(int index) {
            if ((index >=0) & (index <=this.size())) {

                //^^^get a task under a given number (from scratch).
                //Checking the correctness of the input value must be implemented - valid
                return this.taskArray[index];
            }
        else {return null;}
    }

}
