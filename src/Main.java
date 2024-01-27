import models.Priority;
import models.Status;
import models.Task;
import models.TaskData;
import util.SetUtils;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task taskForBob = new Task("s15d2","dummy description","bob", Status.ASSIGNED, Priority.HIGH);
        Task taskForBob2 =new Task("s15d2","dummy description2","bob", Status.IN_PROGRESS, Priority.HIGH);


        Task taskForAnn = new Task("s15d2","dummy desc","ann",  Status.ASSIGNED,Priority.HIGH);
        Task taskForAnn2 = new Task("s15d2","dummy desc 2","ann",Status.IN_PROGRESS, Priority.MEDIUM);

        Task taskForCarol = new Task("s15d2","dummy desc","carol", Status.ASSIGNED, Priority.HIGH);
        Task taskForCarol2 = new Task("s15d2","dummy desc 2","carol", Status.IN_PROGRESS,Priority.LOW);

        Task taskForUnassigned = new Task("s15d2","dummy desc",null, Status.ASSIGNED, Priority.HIGH);
        Task taskForUnassigned2 = new Task("s15d2","dummy desc 2",null, Status.IN_PROGRESS,Priority.LOW);

        Set<Task> unassignedTasks = new LinkedHashSet<>();
        unassignedTasks.add(taskForUnassigned);
        unassignedTasks.add(taskForUnassigned2);

        Set<Task> annsTasks = new LinkedHashSet<>();
        annsTasks.add(taskForAnn);
        annsTasks.add(taskForAnn2);

        Set<Task> bobsTasks = new LinkedHashSet<>();
        bobsTasks.add(taskForBob);
        bobsTasks.add(taskForBob2);
        bobsTasks.add(taskForAnn);

        Set<Task> carolsTasks = new LinkedHashSet<>();
        carolsTasks.add(taskForCarol);
        carolsTasks.add(taskForCarol2);

         Set<Task>  allTasks = new LinkedHashSet<>();
         allTasks.addAll(bobsTasks);
         allTasks.addAll(annsTasks);
         allTasks.addAll(carolsTasks);
         allTasks.addAll(unassignedTasks);


        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolsTasks,unassignedTasks);

        System.out.println( "-------1-----");
        SetUtils.printSet(taskData.getTasks("all"));
        //System.out.println(taskData.getTasks("all").toString());

        System.out.println("-----2-----");
        SetUtils.printSet(taskData.getTasks("ann"));
        SetUtils.printSet(taskData.getTasks("bob"));
        SetUtils.printSet(taskData.getTasks("carol"));

        System.out.println("-----3-----");
        SetUtils.printSet(taskData.getDifferences(allTasks,taskData.getTasks("all")));

        System.out.println("--------4-------");

        SetUtils.printSet(taskData.getInterSection(bobsTasks,annsTasks));


        System.out.println("--------5-------");





    }


}