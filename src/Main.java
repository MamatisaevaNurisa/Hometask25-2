import java.util.*;

public class Main {
    public static void main(String[] args) {
        //City city = new City(12380, "Osh");
        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(13,"Moscow"));


   TreeSet<Integer> treeSet= new TreeSet<>();

        for (City city1 : arrayList) {
            if(city1.getCode()%2 ==1){
                treeSet.add(city1.getCode());
            }
            System.out.println(treeSet);
        }


         }
    }
