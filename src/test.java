
//class test {
//    public static void main(String[] args) throws Exception {
//        int n = -1;
//        int count = 0;
//        while(n!=0){
//            count += (n&1);  //按位与
//            n>>>=1;
//        }
//        System.out.println(count);;

//        String str = "成都市(成华区)(武侯区)(高新区)";
//        Pattern p = Pattern.compile(".*?(?=\\()");
//        Matcher m = p.matcher(str);
//        if(m.find()) {
//            System.out.println(m.group());
//        }

//        Integer a = new Integer(3);
//        Integer b = 3;
//        int c=3;
//        System.out.println(a==b);
//        System.out.println(a==c);   //Integer自动拆箱成int 与c比较
//        System.out.println(b==c);
//        System.out.println(translate("2r3hsaf^^%@.;kdfd"));

//        System.out.println(4.0-3.6);
//        int a =  3;
//        int b = 3;
//        System.out.println(a == b);
//        String s = "hello";
//
//        Method m = s.getClass().getMethod("toUpperCase");
//
//        System.out.println(m.invoke(s));
//        Integer a = new Integer(2);
//        Integer b = new Integer(2);
//        String s1 = new String();
//        String s2 = "123";
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//        Vector vector = new Vector();
//        for (int i=0;i<10;i++)
//            vector.add(i);
//
//        System.out.println(vector);
//        Collection coll = new ArrayList();
//        coll.add("aaa");
//        coll.add(1);
//        coll.add('c');
//        coll.add("ddd");
//        System.out.println(coll);
//        Iterator it = coll.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//            it.remove();
//        }
//        System.out.println(coll);




//    }
//    public static String translate (String str) {
//        String tempStr = "";
//        try {
//            tempStr = new String(str.getBytes("ISO-8859-1"),"GBK");
//            tempStr = tempStr.trim();
//        }
//        catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        return tempStr;

//    }


//}
//class Cache<T> {
//    T value;
//
//    public T getValue() {
//        return value;
//    }
//
//    public void setValue(T value) {
//        this.value = value;
//    }
//
//}
//
//class test{
//    public static void main(String[] args) {
//        Integer s1 = 1;
//        Integer s2 = 1;
//        Integer l1 = new Integer(1);
//        Integer l2 = new Integer(1);
//        System.out.println(s1.hashCode()+" "+s2.hashCode());
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
//        System.out.println(l1.hashCode()+" "+l2.hashCode());
//        System.out.println(l1.equals(l2));
//        System.out.println(l1==l2);
//    }
//
//
//}
//public class test{
//
//    private static Object resource1 = new Object();
//    private static Object resource2 = new Object();
//
//    public static void main(String[] args) {
//
//        new Thread(() -> {
//            synchronized (resource1){
//                System.out.println(Thread.currentThread()+ "get resource1");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread()+"waiting get resource2");
//                synchronized (resource2){
//                    System.out.println(Thread.currentThread()+"get resorce2");
//                }
//            }
//        },"线程1").start();
//
//        new Thread(() ->{
//            synchronized (resource2){
//                System.out.println(Thread.currentThread()+ "get resource2");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread()+"waiting get resource1");
//                synchronized (resource1){
//                    System.out.println(Thread.currentThread()+"get resorce1");
//                }
//            }
//        },"线程2").start();
//    }

import java.util.ArrayList;
import java.util.Collections;

//}
public class test{
//    private int[] charArr = new int[128];
//    Queue<Character> queue = new LinkedList<>();
//    public void Insert(char ch)
//    {
//        charArr[ch]++;
//        queue.add(ch);
//
//    }
//    //return the first appearence once char in current stringstream
//    public char FirstAppearingOnce(){
//        while(!queue.isEmpty()&&charArr[queue.peek()]>1){
//            queue.poll();
//        }
//        return queue.isEmpty()?'#':queue.peek();
//    }
    private ArrayList<Integer> res = new ArrayList<>();
    public void Insert(Integer num) {
        res.add(num);
    }

    public Double GetMedian() {
        Collections.sort(res);
        double med;
        if(res.size()/2==0)
            med = (double)(res.get(res.size()/2)+res.get(res.size()/2+1))/2;
        else
            med = (double)res.get(res.size()/2);
        return med;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> res = new ArrayList<>();
//        res.add(1);
//        res.add(4);
//        res.add(3);
//        Collections.sort(res);
//        System.out.println(res);
//
//        int med=0;
//        if(res.size()/2==0)
//            med = (res.get(res.size()/2)+res.get(res.size()/2+1))/2;
//        else
//            med = res.get(res.size()/2);

        System.out.println((double) 7/2);
//        int sum = 100;
//        int begin = 1;
//        while (sum >0){
//            res.add(begin);
//            sum -= begin;
//            begin++;
//        }
//        System.out.println(res);
//        System.out.println(new StringBuffer("I am a student.").reverse().toString());

//        System.out.println(100>>1);
//        Integer.valueOf("834r83+");
//        test t = new test();
//        t.duplicate(new int[]{2,4,2,1,4},5,new int[]{0,0,0,0,0});

    }
//    public boolean duplicate(int numbers[],int length,int [] duplication) {
//
//        if(numbers == null || numbers.length<1){
//            duplication[0] = -1;
//            return false;
//        }
//        boolean flag = false;
//        int[] room = new int[length];
//        Arrays.fill(room,0);
//        for(int i=0;i<length;i++){
//            int num = numbers[i];
//            if(room[num]==0)
//                room[num]++;
//            else{
//                flag = true;
//                duplication[0] = num;
//                break;
//            }
//        }
//        return flag;
//    }
}