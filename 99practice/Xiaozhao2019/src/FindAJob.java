import java.util.*;

public class FindAJob {
    public void main(String[] args){
        //获取参数
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Integer[] Ai = new Integer[m];
        for(int i = 0; i < n; i++){
            int tempDi = scan.nextInt();
            int tempPi = scan.nextInt();
            map.put(tempPi,tempDi);
        }
        for(int i = 0; i < m; i++){
            Ai[i] = scan.nextInt();
        }
        //
        Integer[] maxPay = new Integer[m];

        for(int i : Ai){
            int tempmaxPay = 0;
            for(Integer key : map.keySet()){
                if(Ai[i] > map.get(key) && key > tempmaxPay){
                    tempmaxPay = key;
                }
            }
            maxPay[i] = tempmaxPay;
        }
        System.out.print(maxPay);
    }
}
