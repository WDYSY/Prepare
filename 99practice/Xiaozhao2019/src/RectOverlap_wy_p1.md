# 结果：50%通过率，不知道哪里错了。
参考的回答是
![](img/ReactOverlap_wy_p1.png)
# 解决问题 & 写出程序
1. 链接：  https://www.nowcoder.com/practice/a22dd98b3d224f2bb89142f8acc2fe57?tpId=98&tqId=32829&tPage=1&rp=1&ru=/ta/2019test&qru=/ta/2019test/question-ranking
2. 工具
    * 数组拼接为HashMap：https://www.runoob.com/java/java-map-interface.html
    * 打印时换行：https://www.cnblogs.com/banye/p/6292143.html
    * 判断Object对象类型：https://www.cnblogs.com/Jeremy2001/p/7251166.html
        * 所以说Integer、String、Double、Float、longValue、
        Boolean、Date在Java中都是对象咯
## 使用什么来实现类似JS中的对象呢？
   * HashMap——不能用，因为x的坐标重复的话就不能存储了
        * 排序：https://www.cnblogs.com/xiaoliu66007/p/9579008.html
        * 遍历：https://www.cnblogs.com/damoblog/p/9124937.html
        * Map中的Map.Entry：https://blog.csdn.net/weixin_42956945/article/details/81637843
        * 残留代码：（可惜，都可以遍历了）
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int[] x1 = new int[n];
                int[] y1 = new int[n];
                Map m = new HashMap<Integer,Integer>();
                for (int i = 0; i < n; i++)
                    x1[i] = scan.nextInt();
                for (int i = 0; i < n; i++)
                    y1[i] = scan.nextInt();
                for (int i = 0; i < n; i++)
                    m.put(x1[i], y1[i]);
                System.out.println(m);
                for(Object key : m.keySet()){
                    System.out.println(key);
                    System.out.println(m.get(key));
                    //System.out.println(key instanceof Integer);
                }
    * Arraylist：没看
    * LinkedHashMap：没看
        
# 杂乱目标：通过nextLine直接读取一行的数据，然后转为数组（失败了）
1. nextInt 和 nextLine 搭配使用出现的问题
    * 解决方法：把nextInt全部改为nextLine
    https://blog.csdn.net/i_am_tomato/article/details/79877988
    
2. Java string 转 int：
       https://www.cnblogs.com/mingbai/p/intToString.html
3. 残留的代码：  
        Scanner scan = new Scanner(System.in);  
        String pointnum = scan.nextLine();  
        int n = Integer.parseInt(pointnum);  
        String sx1 = scan.nextLine();  
        String sy1 = scan.nextLine();  
        String [] x1 = sx1.split("\\s+");  
        String [] y1 = sy1.split("\\s+");  
        System.out.print(sx1+"\n"+sy1);  
        
        