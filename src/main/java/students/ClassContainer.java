package students;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassContainer  {
    private Map<String, StudentsClass> groups;
    public ClassContainer(){
        this.groups = new HashMap<>();
    }
    public void addClass(String groupname, int capacity){ // new Class(name, capacity)) <- obiekt?
        groups.put(groupname,  new StudentsClass(groupname, capacity));
    }
    public void removeClass(String groupname) {
        groups.remove(groupname);
    }
    public List<String> findEmpty(){
        List<String> foundEmpty = new ArrayList<>();
        for(StudentsClass group : groups.values()){
            if(group.getStudentCount()==0)foundEmpty.add(group.getGroupName());
        }
        return foundEmpty;
    }
    public void summary() {
        for (StudentsClass group : groups.values()) {
            System.out.println(group.getGroupName() + " " + group.getPercentage());
        }
    }
}


