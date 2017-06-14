package people;

import org.junit.Assert;
import org.junit.Test;
import people.*;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static people.ListDemo.*;

public class ListDemoTest {
    @Test
    public void countStrAtFirstCharacterTest(){
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<20; i++){
            list.add(String.valueOf(i));
        }
        int res = countStrAtFirstCharacter(list,'1');
        assertEquals(res,11);
    }

    @Test
    public void searchNamesakesTest(){
        Human human1 = new Human("King","Alex","Maykolovich",19);
        Human human2 = new Human("King","Andrey","Anatolievich",51);
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(human1);
        list.add(new Human("Belova","Katerina","Alexandrovna",18));
        list.add(human2);

        ArrayList<Human> res = (ArrayList<Human>) searchNamesakes(list,human1);
        ArrayList<Human> test = new ArrayList<Human>();
        test.add(human1);
        test.add(human2);
        assertEquals(test,res);
    }

    @Test
    public void removeTheHumanTest(){
        Human human1 = new Human("King","Alex","Maykolovich",19);
        Human human2 = new Human("Belova","Katerina","Alexandrovna",18);
        Human human3 = new Human("King","Andrey","Anatolievich",51);
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(human1);
        list.add(human2);
        list.add(human3);

        ArrayList<Human> res = (ArrayList<Human>) removeTheHuman(list,human3);
        ArrayList<Human> test = new ArrayList<Human>();
        test.add(human1);
        test.add(human2);
        assertEquals(test,res);
    }

    @Test
    public void removeIntersectionWithInputSetTest(){
        ArrayList<Set<Integer>> list = new ArrayList<Set<Integer>>();
        for (int i = 0; i<5; i++){
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j<i+3; j++){
                set.add(j+i);
            }
            list.add(set);
        }
        HashSet<Integer> inputSet = new HashSet<Integer>();
        inputSet.add(0);
        inputSet.add(1);
        inputSet.add(2);
        ArrayList<Set<Integer>> res = (ArrayList<Set<Integer>>) removeIntersectionWithInputSet(list,inputSet);
        assertEquals(res,removeIntersectionWithInputSet(list,inputSet));
    }

    @Test
    public void findHumansByIndificationsTest(){
        HashMap<Integer,Human> hashMap = new HashMap<Integer, Human>();
        Human human1 = new Human("King","Alex","Maykolovicg",19);
        Human human2 = new Human("Belova","Katerina","Alexandrovna",18);
        Human human3 = new Human("Kig","Andrey","Anatolievich",51);
        hashMap.put(1,human1);
        hashMap.put(3,human2);
        hashMap.put(5,human3);
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(3);
        HashSet<Human> humans = new HashSet<Human>();
        humans.add(human1);
        humans.add(human2);
        assertEquals(humans,findHumansByIndifications(hashMap,set));
    }

    @Test
    public void findAdultPeopleTest(){
        Human human1 = new Human("King","Alex","Maykolovich",19);
        Human human2 = new Human("Belova","Katerina","Alexandrovna",18);
        Human human3 = new Human("Noskov","Andrey","Anatolievich",16);
        HashMap<Integer,Human> hashMap = new HashMap<Integer, Human>();
        hashMap.put(1,human1);
        hashMap.put(2,human2);
        hashMap.put(3,human3);
        HashSet<Human> set = new HashSet<Human>();
        set.add(human1);
        set.add(human2);
        assertEquals(findAdultPeople(hashMap),set);
    }
}
