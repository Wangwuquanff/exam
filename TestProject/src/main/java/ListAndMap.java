import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Davion on 2018/8/4.
 */
public class ListAndMap {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, int[]> map = new HashMap<Integer,int[]>();
        //生成随机数
        for (int i = 0; i < 50; i++) {
            int ii = (int) ((Math.random()) * 101);
            list.add(ii);
        }
        System.out.print("随机生成50个小于100的数,分别为：");
        //打印
        for (int i = 0; i < 50; i++) {
            System.out.print(list.get(i) + ",");
        }
        //将数组值放入map
        for (int i = 0; i < 10; i++) {
            int array[] = new int[10];
            int num = 0;
            for (int j = 0; j < 50; j++) {
                if (list.get(j) / 10 == i) {
                    array[num] = list.get(j);
                    num++;
                }
            }
            map.put(i, array);
        }
        System.out.println();
        System.out.print("Map原数据为:");

        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int key = (Integer) it.next();
            System.out.print(key + "=>");
            int[] value = (int[]) map.get(key);

            for (int i = 0; i < 10; i++) {
                if (value[i] != 0)
                    System.out.print(value[i] + " ");
            }
            System.out.println();
        }
        System.out.print("排序后数据为:");
        Set set2 = map.keySet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int key = (Integer) it2.next();
            System.out.print(key + "=>");
            int[] value = (int[]) map.get(key);

            for (int i = 0; i < 10; i++) {
                int temp = 0;
                for (int k = 0; k < value.length - 1; k++) {
                    for (int m = k + 1; m < value.length; m++) {
                        if (value[k] > value[m]) {
                            temp = value[k];
                            value[k] = value[m];
                            value[m] = temp;
                        }
                    }
                }
                if (value[i] != 0)
                    System.out.print(value[i] + " ");
            }
            System.out.println();
        }

    }
}
