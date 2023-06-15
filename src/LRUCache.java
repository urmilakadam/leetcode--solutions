import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(2);
        obj.put(1,1);
        obj.put(2,2);
        int param_1 = obj.get(1);
        obj.put(3,3);
        int param_2 = obj.get(2);
        System.out.println("param_1 :"+ param_1 +"\nparam_2 :" + param_2);
    }

    Map<Integer, Integer> map;
    LinkedList<Integer> list;
    int capacity;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            list.removeFirstOccurrence(key);
            list.addFirst(key);
            return map.get(key);
        }

        else return -1;
    }

    public void put(int key, int value) {
        if(capacity >=1){
            list.addFirst(key);
            map.put(key, value);
            capacity--;
        }else{
            int temp = list.removeLast();
            map.remove(temp);
            map.put(key, value);
            list.add(key);
        }
    }
}