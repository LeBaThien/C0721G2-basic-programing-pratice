package b11_generic_stack_queue.excercise.map;

import java.util.Map;

public class TreeMap {
    public static void accountWord (String str){
        Map<String, Integer> string = new java.util.TreeMap<String, Integer>();
        String strUpCase = str.toUpperCase();
        String[] newStr = strUpCase.split(" ");
        for(String element: newStr){
            if(!string.containsKey(element)){
                string.put(element,1);
            } else {
                string.put(element,string.get(element)+1);
            }
        }

        for (Map.Entry<String,Integer> entry :string.entrySet()){
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }
    }
    public static void main(String args[]) {
        String str = "hoc lap trinh java , java vip bro";
        accountWord(str);

    }

}
