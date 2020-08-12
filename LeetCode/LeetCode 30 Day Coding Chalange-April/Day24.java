/*
Title : LRU Cache
Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3309/
*/
class ListNode{
    int key;
    int val;
    ListNode prev;
    ListNode next;
    public ListNode(int key,int val)
    {
        this.key = key;
        this.val = val;
    }
}
class DLL {
    private ListNode head = null;
    private ListNode tail = null;
    
    public void addFirst(ListNode node)
    {
       if (head == null) {
            head = node;
            tail = node;
            return;
        }

        head.prev = node;
        node.next = head;
        node.prev = null;
        head = node;
    }
    public ListNode removeLast()
    {
       ListNode node = tail;

        if (tail.prev != null) {
            tail.prev.next = null;
            tail = tail.prev;
        } else {
            head = null;
            tail = null;
        }
        return node;
    }
    public void promote(ListNode node)
    {
        if(node.prev==null)
            return;
        else if(node.next==null)
        {
            node.prev.next=null;
            tail = node.prev;
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
        else
        {
            node.prev.next = node.next;
            node.prev = null;
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
}
class LRUCache {
    
    
    private Map<Integer,ListNode> cacheMem = new HashMap<Integer,ListNode>();
    private DLL cacheList = new DLL();
    private final int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
     }
    
    public int get(int key) {
        if(cacheMem.containsKey(key))
        {
            ListNode target = cacheMem.get(key);
            cacheList.promote(target);
            return target.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cacheMem.containsKey(key))
        {
            ListNode target = cacheMem.get(key);
            target.val = value;
            cacheList.promote(target);
            return;
        }
        if(cacheMem.size() == capacity)
        {
            ListNode node = cacheList.removeLast();
            cacheMem.remove(node.key);
        }
        ListNode target = new ListNode(key,value);
        cacheList.addFirst(target);
        cacheMem.put(target.key,target);
    }
}

/*
 Idea 
    
 Create a doubly linked list for storing Key-value of pages
 Use Map for Storing Key and Corresponding ListNode
 
 Java also provides LinkedHashMap which is an alternative solution of using HashMap + LinkedList
*/


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */