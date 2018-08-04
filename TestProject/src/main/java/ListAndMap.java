import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Davion on 2018/8/4.
 */
public class ListAndMap {


    public  static List<Integer> list = new ArrayList<Integer>();
    public  static Map<Integer, int[]> map = new HashMap<Integer,int[]>();
    public  static Set set=null;
    public static void main(String args[]) {
        //生成随机数
        GetRandomNumber();
        //初始化map
        AddItemToMap();
        //打印输出
        PrintingResult();
        //排序并且打印输出
        OutputSortData();
    }



    //生成随机数函数
    private static void GetRandomNumber() {
        System.out.print("随机生成50个小于100的数,分别为：");
        for (int i = 0; i < 50; i++) {
            int ii = (int) ((Math.random()) * 100);
            list.add(ii);
        }
        //打印
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println(list.get(list.size()-1));
    }


    //初始化map
    private static void AddItemToMap() {
        for (int i = 0; i < 10; i++) {
            int array[] = new int[10];
            int num = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) / 10 == i) {
                    array[num] = list.get(j);
                    num++;
                }
            }
            map.put(i, array);
        }
    }

    //输出原始结果
    private static void PrintingResult() {
        System.out.println("Map原数据为:");
        set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int key = (Integer) it.next();
            System.out.print(key + "=>");
            int[] value = (int[]) map.get(key);
            for (int i = 0; i < value.length; i++) {
                if (value[i] != 0)
                    System.out.print(value[i] + " ");
            }
            System.out.println();
        }
    }

    //打印输出排序后数组
    private static void OutputSortData() {
        System.out.println("排序后数据为:");
        Set sortset = map.keySet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int key = (Integer) it2.next();
            System.out.print(key + "=>");
            int value [] = (int[]) map.get(key);
            Arrays.sort(value,0,value.length);
            for (int i = 0; i <value.length ; i++) {
                if(value[i] != 0){
                    System.out.print(value[i] + " ");
                }
            }
            System.out.println();
        }
    }

}
