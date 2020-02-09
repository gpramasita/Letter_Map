/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentcleancode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author gpramasita
 */
public class LetterMap {
    public static void main(String[] args) {
        String pesan = "PEGADAIAN";
        HashMap<String, String> letterMap = new HashMap<String, String>();
        String[] pesanArray = pesan.split("");
        letterMap.put("A", "C");
        letterMap.put("B", "F");
        letterMap.put("C", "H");
        letterMap.put("D", "K");
        letterMap.put("E", "M");
        letterMap.put("F", "P");
        letterMap.put("G", "R");
        letterMap.put("I", "N");
        letterMap.put("J", "S");
        letterMap.put("K", "Q");
        letterMap.put("L", "4");
        letterMap.put("M", "1");
        letterMap.put("N", "0");
        letterMap.put("O", "U");
        letterMap.put("P", "3");
        letterMap.put("Q", "B");
        letterMap.put("R", "Z");
        letterMap.put("S", "Y");
        letterMap.put("T", "L");
        letterMap.put("U", "X");
        letterMap.put("V", "7");
        letterMap.put("W", "8");
        letterMap.put("X", "2");
        letterMap.put("Y", "5");
        letterMap.put("Z", "6");
        int index = 0;
        StringBuilder enkripsi = new StringBuilder();
        while (index < pesanArray.length) {
             if (letterMap.containsKey(pesanArray[index])) {
                enkripsi.append(letterMap.get(pesanArray[index]));
            }
            index++;
        }
        System.out.println("Pesan Enkripsi: " + enkripsi);
    }
}
