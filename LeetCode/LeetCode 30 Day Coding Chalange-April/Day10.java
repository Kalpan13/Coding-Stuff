/*

Min Stack
Link : https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3292/

*/

class MinStack {

    /** initialize your data structure here. */
    int min;
    class Element{
        int ele;
        int min;
        public Element(int x,int min)
        {
            this.ele = x;
            this.min = min;
        }
    }
    Stack<Element> sc;
    
    public MinStack() {
     
     min = Integer.MAX_VALUE;
     sc = new Stack<Element>();
    }
    
    public void push(int x) {
        if(sc.empty())
        {
            min=x;
        }
        if(x<min)
        {
            min = x;
        }
        sc.push(new Element(x,min));
    }
    
    public void pop() {
 
        if(sc.empty())
           return;
        sc.pop();
        
        if(!sc.empty())
            min=sc.peek().min;
    }
    
    public int top() {
        return sc.peek().ele;
    }
    
    public int getMin() {
        return sc.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */