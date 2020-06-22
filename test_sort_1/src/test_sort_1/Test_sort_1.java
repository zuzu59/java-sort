/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_sort_1;

import java.util.Arrays;

/**
 *
 * @author zuzu
 */
public class Test_sort_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//     String[][] multi = new String [][]{
//     {"Josef", "cool"},
//     {"Josef", "bat"},
//     {"zeta", "doen"},
//     {"zeta", "up"},
//     {"root", "local"},
//     {"root", "region"}
//             
//  
// };
//     
        String[][] actionListLocal = new String[][]{
            {"", "", ""},
            {"18:30", "19:00", "1"},
            {"10:30", "11:00", "2"},
            {"22:30", "23:00", "3"}
        };

        System.out.println(Arrays.deepToString(actionListLocal));

        Arrays.sort(actionListLocal, (a, b) -> a[0].compareTo(b[0]));

        System.out.println(Arrays.deepToString(actionListLocal));

    }

}
