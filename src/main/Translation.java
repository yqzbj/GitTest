import java.util.HashMap;
import java.util.Map;

public class Translation {

    public static void main(String[] args) {

//        Demo demo = new Demo();
////        Map<String,Integer> hashMap = new HashMap<String, Integer>();
////
////        hashMap.put("q",2);
////        hashMap.put("x",6);
////        hashMap.put("a",7);
////        if(hashMap.containsKey("x"))
////        {
////            hashMap.replace("a",333);
////
////        }
////        for (Map.Entry<String,Integer> entry:hashMap.entrySet()) {
////
////            System.out.println(entry.getKey()+ "-----"+entry.getValue());
////        }
////       demo.setAge(100);

        String str1 = new StringBuilder("java").append("Hello").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("demo").append("Hello").toString();
        System.out.println(str2.intern() == str2);
    }


}
