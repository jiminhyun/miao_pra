package org.example;

import java.util.Scanner;

public class vending_machine {
    static void main(String[] args) {
        final int COKE = 500, CIDER = 700, FANTA = 300, WATER = 200;
        Scanner moneyScan = new Scanner(System.in);
        System.out.println("가지고 있는 돈을 입력하시오");
        int money = moneyScan.nextInt();
        printMenu(money);
    }

    public static void printMenu(int totalMoney) {
        System.out.println("==========================자판기==========================");
        while(true) {
            System.out.println("[1]콜라=500원 [2]사이다=700원 [3]환타=300원 [4]물=200원 [5]돈 넣기 [6] 좋료");
            Scanner menuNumScan = new Scanner(System.in);
            int menuNum = menuNumScan.nextInt();
            if( menuNum == 6) {
                break;
            } else if (menuNum == 5) {
                System.out.println("추가로 돈을 입력하시오");
                Scanner sumMoneyScan = new Scanner(System.in);
                int sumMoney = sumMoneyScan.nextInt();
                totalMoney+=sumMoney;
            }else if (check(totalMoney, menuNum)>=0) {
                totalMoney = check(totalMoney, menuNum);
            } else {
                System.out.println("돈이 부족합니다.");
            }
            System.out.println("현재 금액 :" + totalMoney + "원");
        }


    }

    public static int check(int totalMoney, int menuNum) {
        switch (menuNum) {
            case 1:
                totalMoney-=500;
                break;
            case 2:
                totalMoney-=700;
                break;
            case 3:
                totalMoney-=300;
                break;
            case 4:
                totalMoney-=200;
                break;
        }
        return totalMoney;
    }
}

