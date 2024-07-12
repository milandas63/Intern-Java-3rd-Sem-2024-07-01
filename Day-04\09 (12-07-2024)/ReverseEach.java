package com.string;

public class ReverseEach {

	public static void main(String[] args) {
        String original = "Quick Brown Fox Jumps Over The Lazy Dog";
        //	kciuQ nworB xoF spmuJ revO ehT yzaL goD
        //  goD yzaL ehT revO spmuJ xoF nworB kciuQ

        String[] items = original.split(" ");
        for(int i=0; i<items.length; i++) {
            System.out.print(new StringBuffer(items[i]).reverse() + " ");
        }
        System.out.println();

        for(int i=items.length-1; i>=0; i--) {
            System.out.print(new StringBuffer(items[i]).reverse() + " ");
        }
        System.out.println();
	}
}
