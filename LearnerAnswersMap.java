import java.util.*;

public class LearnerAnswersMap {
    TreeMap<String, String> learnerAnswersMap = new TreeMap<String, String>();
    public void assignlearnerAnswers(){
        learnerAnswersMap.put("Maheen", "Private variables can't be accessed outside the class");
        learnerAnswersMap.put("Gagan", "The main method should always be main, otherwise it won't run");
        learnerAnswersMap.put("Khyati", "The HashMap belongs to the java.util package");
        learnerAnswersMap.put("Mavya", "Identified the objects in the class");
        learnerAnswersMap.put("Anjali", "Identified the class");
        learnerAnswersMap.put("Khyati", "System Defined(or built-in) class: HashMap");
        learnerAnswersMap.put("Charisma", "Identified String as class");
    }

    // ; (semicolon) is known as delimiter that limits each line

    public  void displaylearnerAnswers(){
//        System.out.println("Maheen's answer: "+learnerAnswersMap.get("Maheen"));
//        System.out.println("Gagan's answer: "+learnerAnswersMap.get("Gagan"));
//        System.out.println("Khyathi's answer: "+learnerAnswersMap.get("Khyati"));
//        System.out.println("Mavya's answer: "+learnerAnswersMap.get("Mavya"));
//        System.out.println("Anjali's answer: "+learnerAnswersMap.get("Anjali"));
//        System.out.println("Khyathi's answer: "+learnerAnswersMap.get("Khyati"));
//        System.out.println("Charisma's answer: "+learnerAnswersMap.get("Charisma"));
        System.out.println(learnerAnswersMap);

//
//        for(String keys: learnerAnswersMap.keySet()){
//            System.out.println(keys+" : "+ learnerAnswersMap.get(keys));
//        }

        Set<String> learnerSet= learnerAnswersMap.keySet();
        System.out.println(learnerSet);

        Collection<String> learnerValues = learnerAnswersMap.values();
        System.out.println(learnerValues);



    }


    // if you don't give the datatype in hashmap then it will be called as Raw data then you can insert any datatype
//    HashMap learnerAnswersMap = new HashMap();
//    public void assignlearnerAnswersMap(){
//        learnerAnswersMap.put("Maheen", "Private variables can't be accessed outside the class");
//        learnerAnswersMap.put("Gagan", "The main method should always be main, otherwise it won't run");
//        learnerAnswersMap.put("Khyati", "The HashMap belongs to the java.util package");
//    }
//
//    public  void displaylearnerAnswersMap(){
//        System.out.println("Maheen's answer: "+learnerAnswersMap.get("Maheen"));
//        System.out.println("Gagan's answer: "+learnerAnswersMap.get("Gagan"));
//        System.out.println("Khyathi's answer: "+learnerAnswersMap.get("Khyati"));
//    }
}