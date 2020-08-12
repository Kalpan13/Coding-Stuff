/*
Title:  First Unique Number
Link : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3313/
*/

class DLL{
    int val;
    DLL prev;
    DLL next;
    public DLL(int val)
    {
        this.val = val;
    }
}
class FirstUnique {
    DLL head = new DLL(0);
    DLL tail = new DLL(0);
    HashMap<Integer,DLL> hm = new HashMap();
    
    public void addAtEnd(DLL node)
    {
        DLL tailPrev = tail.prev;
        
        tailPrev.next = node;
        node.next = tail;
        
        node.prev = tailPrev;
        tail.prev = node;
        
    }
    public void removeFromList(DLL node)
    {
        DLL nodeprev = node.prev;
        DLL nodenext = node.next;
        
        node.next = null;
        node.prev = null;
        nodeprev.next = nodenext;
        nodenext.prev = nodeprev;
    }
    public FirstUnique(int[] nums) {
        head.next = tail;
        tail.prev = head;
        for(int i=0;i<nums.length;i++)
        {
            this.add(nums[i]);
        }
    }
    
    public int showFirstUnique() {
        if(head.next==tail)
            return -1;
        else
            return head.next.val;
    }
    
    public void add(int value) {
        if(hm.containsKey(value))
        {
            DLL node = hm.get(value);
            if(node!=null)
            {
                hm.put(value,null);
                removeFromList(node);
            }
        }
        else
        {
            DLL node = new DLL(value);
            hm.put(value,node);
            addAtEnd(node);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */

/*
    Use a logic similar to LRU cache for perfoming operations
*/
