import java.util.HashMap;
import java.util.Map;

public class MainStudent {
    public static void main(String[] args) {

        HashMap<String, Student> myMap = new HashMap<>();

        myMap.put("hien", new Student("hien", 50));
        myMap.put("jasmin", new Student("jasmin", 75));
        myMap.put("jimmy", new Student("jimmy", 35));
        myMap.put("helena", new Student("helena", 85));

        improveGrades(myMap);
    }

    public static void improveGrades(Map<String, Student>myMap){
        for(Student student: myMap.values()){
            int betterGrade =(int) Math.round(student.getGrade()*1.1);
            student.setGrade(betterGrade);
            System.out.println(student.getName() + " " + student.getGrade());
        }
    }
}
