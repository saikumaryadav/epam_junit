/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RGUKT
 */
public class TaskTest {
    
    public TaskTest() {
    }
    @org.junit.Test
    public void testchar2() {
        String s1="Aba";
        Task t=new Task();
        String act=t.char2(s1);
        String a=act.toString();
        String exp="ba";   // if first 2 characters are 'A's then i set exp value as "sai"
        assertEquals(exp,a);
    }
}
