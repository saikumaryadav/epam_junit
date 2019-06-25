package task;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {
    
    public TaskTest() {
    }
    @org.junit.Test
    public void testchar2() {
        String s1="Aba";
        Task t=new Task();
        String act=t.char2(s1);
        String a=act.toString();
        String exp="ba";   // if  2 characters are 'A's then i set exp="sai" where 2charecters string only(length of string=2)
        assertEquals(exp,a);
    }
}
