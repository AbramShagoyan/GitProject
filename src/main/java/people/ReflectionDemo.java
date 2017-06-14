package people;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class ReflectionDemo {
    public static int findCountOfHuman(List<Object> inputList){
        int res = 0;
        for(Object obj:inputList){
            if(obj.getClass() == Human.class){
                res++;
            }
        }
        return res;
    }

    public static List<String> showMethods(Object obj){
        ArrayList<String> res = new ArrayList<String>();
        Class aClass = obj.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            res.add(method.getName());
        }
        return res;
    }

    public static List<String> showPedigrees(Object obj){
        Class objClass = obj.getClass();
        ArrayList<String> res = new ArrayList<String>();
        while (!(objClass.getName().equals("java.lang.Object"))){
            res.add(objClass.getSimpleName());
            objClass = objClass.getSuperclass();
        }
        res.add("Object");
        return res;
    }
}
