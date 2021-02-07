package com.study.project;

import java.util.Scanner;

public class CMUtil {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 用于界面菜单的选择，读取键盘
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println("选择错误，请重新输入");
            } else break;
        }
        return c;
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue 座位返回值
     *
     * @return
     */
    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     */
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }

    /**
     * 从键盘读取一个长度不超过2位的整数，并将其座位方法的返回值
     *
     * @return
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    /**
     * 从键盘读取一个长度不超过limit的字符串，并将其座位方法的返回值
     *
     * @param limit
     * @return
     */
    public static String readString(int limit) {
        return readKeyBoard(limit, false);

    }

    /**
     * 从键盘读取一个字符，并将其作为方法的返回值
     * 如果用户不输入字符而直接回车，方法将以defaultValue 座位返回值
     */
    public static char readString(int limit, char defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str.charAt(0);
    }

    /**
     * 用于确认输入，该方法从键盘读取Y或N 并将其作为方法的返回值
     *
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误，请重新输入");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }
            break;
        }
        return line;
    }


}
