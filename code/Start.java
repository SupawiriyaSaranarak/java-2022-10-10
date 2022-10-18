import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main (String[] data) {
        // manually create bean method ------------------------------------------------------------------
//        GenericApplicationContext context;//environment that controlling our application 
//        context = new GenericApplicationContext();
        // have only one instance called singleton (default)
//        context.registerBean(Team.class); 
        // can be created more than one by using diferent name  
//        context.registerBean("captain",Player.class); // 
//        context.registerBean("goal-keeper",Player.class); // 

//        context.refresh(); // if not have .refresh() application will error
//    
//        Player p = context.getBean("captain",Player.class);
//        p.name = "David Beckham"; p.number = 7; p.salary = 47000.0;
//        Player q = context.getBean("captain",Player.class); 
//        System.out.println(q.name);
//        Player r = context.getBean("goal-keeper",Player.class); 
//        System.out.println(r.name);
//        String[] list = context.getBeanDefinitionNames();
//        for (int i = 0; i< list.length; i++) 
//            System.out.println("baenName: " + list[i]); // Player was create only one by spring so it appear only Player
        //-----------------------------------------------------------------------------------------------------
        // create bean by configure.xml -----------------------------------------------------------------------
        
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("configure.xml");
        Player p = context.getBean("captain", Player.class);
        System.out.println(p.name);
        Player q = context.getBean("goal-keeper", Player.class);
        System.out.println(q.name);
        //-----------------------------------------------------------------------------------------------------

        
    }
}
        // manually create bean method ------------------------------------------------------------------
//class Player {
//    String name;
//    int number;
//    double salary;
//}
//class Team {
//    String name;
//    double score;
//}
// The keyword "new" can be viewed in two ways
// 1. use for allocating memory, in C is malloc()
// 2. use for creating an instance (object that create from class)
// new Student(); --> you will get an ordinary instance (deleted when not used)
//                    probably deleted by Garbage collector

// Spring Bean is a managed instance (manageable instance)
        //-----------------------------------------------------------------------------------------------------
        // create bean by configure.xml -----------------------------------------------------------------------

class Player {
    String name;
    int number;
    double salary;
    // have to add set method for this method of creating bean
    public void setName (String s) {
        name = s;
    }
    public void setNumber (int n) {
        number = n;
    }
    public void setSalary (double sl) {
        salary = sl;
    }
}
class Team {
    String name;
    double score;
}