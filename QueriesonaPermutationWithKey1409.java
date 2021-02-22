/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;

public class QueriesonaPermutationWithKey1409 {

    public static void QueriesonaPermutationWithKey1409() {
        int[] queries = {3, 1, 2, 1};
        int m = 5;
        int[] iArrQueries = new int[queries.length];
        ArrayList<Integer> aListNumber = new ArrayList();
        int iCounter = 0;
        for (int i = 1; i <= m; i++) {
            aListNumber.add(i);
        }
        for (int query : queries) {
            int iSearchNumber = aListNumber.indexOf(query);
            iArrQueries[iCounter] = iSearchNumber;
            aListNumber.remove(iSearchNumber);
            aListNumber.add(0, query);
            iCounter++;
        }
        for (int iArrQuery : iArrQueries) {
            System.out.println(iArrQuery);
        }
    }
}
