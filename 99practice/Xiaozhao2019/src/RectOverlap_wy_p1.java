import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class RectOverlap_wy_p1 {
    public static void main(String[] args) {
        //读取数据并保存为HashMap
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] x1 = new Integer[n];
        Integer[] y1 = new Integer[n];
        Integer[] x2 = new Integer[n];
        Integer[] y2 = new Integer[n];
        int max = 0;
        Map<Integer,Integer> mx = new HashMap<Integer, Integer>();
        Map<Integer,Integer> my = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++)
            x1[i] = scan.nextInt();
        for (int i = 0; i < n; i++)
            y1[i] = scan.nextInt();
        for (int i = 0; i < n; i++)
            x2[i] = scan.nextInt();
        for (int i = 0; i < n; i++)
            y2[i] = scan.nextInt();
        for (int i = 0; i < n; i++){
            mx.put(x1[i], x2[i]);
            my.put(y1[i], y2[i]);
        }
        System.out.println("创建的HashMap是："+mx);
        System.out.println("m的size："+mx.size());
        if(mx.size() < x1.length){
            System.out.println("if······");
            Iterator<Map.Entry<Integer, Integer>> temp_entries = mx.entrySet().iterator();
            while (temp_entries.hasNext()){
                Map.Entry<Integer,Integer>entry = temp_entries.next();
                int count = 0;
                int x = entry.getKey();
                for(int i : x1 ){
                    if (x1[i] == x)
                        count++;
                }
                if (count > max)
                    max = count;
            }
        }
        Iterator<Map.Entry<Integer, Integer>> entries = mx.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            int xl = entry.getKey();    //最左边底边的x1坐标
            int xr = entry.getValue();   //最左边底边的x2坐标
//            System.out.println(x1+":"+x2);
            int count = 0;
            Iterator<Map.Entry<Integer, Integer>> entries2 = mx.entrySet().iterator();
            while(entries2.hasNext()){
                Map.Entry<Integer, Integer> entry2 = entries2.next();
                int xxl = entry2.getKey();  //遍历其它（右边的底边）的底边
                if(xxl < xr)
                    count++;
            }
            if(count > max)
                max = count;
            System.out.println(xl + "的重叠次数是："+count);
            entries.remove();
        }
        System.out.print("max的值是："+max);
        System.out.print("\n后来的m："+mx);
        //使用Iterator遍历才可以使用remove函数，所以此法作废（说什么不安全之类的）
        /*for(Integer keyi : m.keySet()){ //遍历每一个矩阵的边
            int count = 0;
            System.out.println(keyi);
            System.out.println(m.get(keyi));
            //遍历其它边，查看是否重叠并计数，维护max的值。
            for(Integer keyj : m.keySet()){
                if(keyj < m.get(keyi)){
                    count++;
                }
            }
            if(count > max)
                max = count;
            m.remove(keyi);
        }*/


}
}
