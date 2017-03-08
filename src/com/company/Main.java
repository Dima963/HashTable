package com.company;

import com.company.HashChain.HashTable;
import com.company.HashChain.Link;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int aKey;
        Link aDataItem;
        int size, n, keysPerCell = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of hash table");
        size = scanner.nextInt();
        System.out.println("Enter initial number of items");
        n = scanner.nextInt();

        HashTable hash =  new HashTable(size);

        for (int i = 0; i<n; i++){
            aKey = (int)(java.lang.Math.random()*keysPerCell*size);
            aDataItem =  new Link(aKey);
            hash.insert(aDataItem);
        }

        hash.displayTable();
    }

}
