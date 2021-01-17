package com.company;

public class Main {

    public static void main(String[] args) {
        int i, j , k ;
        int L[][][] =new int[2][3][4];
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                for(k=0;k<4;k++) {
                    L[i][j][k] = i + j + k ;
                }
            }

        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                for(k=0;k<4;k++) {
                   System.out.println(L[i][j][k]+" ");
                }
                System.out.println();
            }

        }
}
}
