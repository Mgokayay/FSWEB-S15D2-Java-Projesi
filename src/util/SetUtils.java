package util;

import models.Task;

import java.util.Iterator;
import java.util.Set;

public class SetUtils {
    public static void printSet(Set<Task> tasks) {

        Iterator<Task> iterator = tasks.iterator();
        while(iterator.hasNext()) {
            Task task =iterator.next();
            System.out.println("task detail: Project: "+ task.getProject()
            +" Description:"+ task.getDescription()
            +" Assignee: " + task.getAssignee()
            +" Priority: " + task.getPriority()
            +" Status: " + task.getStatus());
        }


    }
}
