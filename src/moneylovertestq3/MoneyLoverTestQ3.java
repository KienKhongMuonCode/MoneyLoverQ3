/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moneylovertestq3;

import java.util.*;

/**
 *
 * @author T490
 */
public class MoneyLoverTestQ3 {

    // Topic: Cho dãy số A. Có bao nhiêu cặp n số không trùng nhau, liệt kê các cặp số đó. Ví dụ: A = 1,2,3.
    //        Khi n = 2 thì kết quả có 3 cặp số, danh sách: 1&2, 1&3, 2&3. Khi n = 3 thì kết quả có 1 cặp số là 1,2,3.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the sequence A: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the numbers of sequence A: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in a pair: ");
        int pairSize = scanner.nextInt();

        int count = 0;

        System.out.println("The pairs of " + pairSize + " elements in the sequence A are:");

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (pairSize == 2) {
                    System.out.println(a[i] + " & " + a[j]);
                    count++;
                } else {
                    for (int k = j + 1; k < n; k++) {
                        if (pairSize == 3) {
                            System.out.println(a[i] + " & " + a[j] + " & " + a[k]);
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println("There are " + count + " pairs of " + pairSize + " elements in the sequence A.");
    }
    
}
