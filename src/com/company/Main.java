package com.company;

import com.company.HashDouble.DataItem;
import com.company.HashDouble.HashTable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int aKey;
        DataItem aDataItem;
        int size, n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of hash table");
        size = scanner.nextInt();
        System.out.println("Enter initial number of items");
        n = scanner.nextInt();

        HashTable hash =  new HashTable(size);

        for (int i = 0; i<n; i++){
            aKey = (int)(java.lang.Math.random()*2*size);
            aDataItem =  new DataItem(aKey);
            hash.insert(aKey, aDataItem);
        }
        hash.displayTable();
    }

}
