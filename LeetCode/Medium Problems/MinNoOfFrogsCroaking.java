/* Problem : 1419
   Link : https://leetcode.com/problems/minimum-number-of-frogs-croaking/
   Title : Minimum Number of Frogs Croaking
*/

class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] fsm = new int[5]; // Create a Finite State Machine (1 state for each letter)
        int result = 0;
        for(char c : croakOfFrogs.toCharArray()) {
            if(c=='c') 
            {
                fsm[0]++;
                if(fsm[4]>0)
                    fsm[4]--;  // If any frog is waiting at 'k' use that for next 'c'
            } 
            else if(c=='r')
            {
                fsm[0]--;
                fsm[1]++;
            } 
            else if(c=='o')
            {
                fsm[1]--;
                fsm[2]++;
            } 
            else if(c=='a') 
            {
                fsm[2]--;
                fsm[3]++;
            } 
            else if(c=='k')
            {
                fsm[3]--;
                fsm[4]++;
            }
            if(fsm[0] < 0 || fsm[1] < 0 || fsm[2] < 0 || fsm[3] < 0 || fsm[4] < 0) {
                return -1;
            }
        }
        
        for(int i = 0; i < 4; i++) {
            if(fsm[i] != 0) {
                return -1;
            }
        }
        result = fsm[4];
        return result;
    }
}

/* Idea 

Create a Finite State Machine (FSM), where each letter represents 1 state.
Sequentially change the state of Machines based on the character encountered.

*/