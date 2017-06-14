package people;

import java.util.*;


public class ListDemo {
    public static int countStrAtFirstCharacter(List<String> list, char c){
       int res = 0;
       for(String s:list) {
           if (s.startsWith(String.valueOf(c))) {
               res++;
           }
       }
       return res;
    }
    public static List<Human> searchNamesakes(List<Human> list, Human human) {
        List<Human> res = new ArrayList<Human>();
        String str = human.getFirstName();
        for (Human h : list) {
            if (h.getFirstName().equals(str)) {
                res.add(h);
            }
        }
        return res;
    }

    public static List<Human> removeTheHuman(List<Human> list, Human human) {
       List<Human> res = new ArrayList<Human>();
        for (Human h:list){
            if (!(h.equals(human))){
                res.add(h);
            }
        }
        return res;
    }

    public static List<Set<Integer>> removeIntersectionWithInputSet(List<Set<Integer>> list, Set<Integer> inputSet){
        List<Set<Integer>> res = new ArrayList<Set<Integer>>();
        for (Set<Integer> s:list){
            HashSet<Integer> s1 = new HashSet<Integer>(s);
            if ((s1.retainAll(inputSet))) {
                res.add(s);
            }
        }
        return res;
    }

    public static Set<Human> findHumansByIndifications(Map<Integer,Human> inputMap, Set<Integer> inputSet){
        HashSet<Human> res = new HashSet<Human>();
        HashSet<Integer> set = new HashSet<Integer>(inputSet);
        HashSet<Integer> keySet = new HashSet<Integer>(inputMap.keySet());
        if (inputSet.size()<=keySet.size()){
            for (Integer i:inputSet){
                if(keySet.contains(i)){
                    res.add(inputMap.get(i));
                }
            }
        } else{
            for (Integer i:keySet){
                if(inputSet.contains(i)){
                    res.add(inputMap.get(i));
                }
            }
        }


        return res;
    }

    public static  Set<Human> findAdultPeople(Map<Integer,Human> inputMap){
        final int age = 18;
        HashSet<Human> res = new HashSet<Human>();
        HashSet<Integer> set = new HashSet<Integer>(inputMap.keySet());
        for(Integer i:set){
            if (inputMap.get(i).getAge()>=age){
                res.add(inputMap.get(i));
            }
        }
        return res;
    }

}
