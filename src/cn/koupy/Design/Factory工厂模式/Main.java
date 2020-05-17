package cn.koupy.Design.Factory工厂模式;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther: kpy
 * @version: 1.0
 * @Package: cn.koupy.Design.Factory工厂模式
 * @data: 2020-3-17 14:07
 * @discription:
 **/
public class Main {
    public static void main(String[] args) throws IOException {

        //当前日期与年初相差多少天
        Calendar calendar=Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);


        //第一题
        System.out.println(calDays("20200317"));

        //第二题
        System.out.println(calFileLines("H:\\CodeTools\\IdeaProject\\DesignPattern\\src\\cn\\koupy\\Design\\Factory工厂模式\\test.txt",0,""));

    }


    /***********第一题**********/
    public static int calDays(String sNowDate) {
        String sStartDate = sNowDate.substring(0, 4)+"0101";
        int days = (int) ((covStringToDate(sNowDate).getTime() - covStringToDate(sStartDate).getTime()) / (24 * 60 * 60 * 1000));
        return days;
    }

    public static Date covStringToDate(String sDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date d = new Date();
        try {
            d = dateFormat.parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }




    /***********第二题**********/
    /*
     * @param sFileName
     *            绝对路径文件名
     * @param iFlag
     *            去除空行标志 ,0-不去除空行, 1-去除空行
     * @param sRflist
     *            去除文件中以此打头的字符串列表, 如输入"#",则去除文件中以#打头的行,
     *            多个关键用英文逗号隔开,如"#,-"则去除#和-打头的行,如果不用去除,则输入""即可.
     * @return 文件行数
     */
    public static long calFileLines(String sFileName, int iFlag, String sRflist) throws IOException {
        long iCount = 0;
        File f = new File(sFileName);
        InputStream input = new FileInputStream(f);
        BufferedReader b = new BufferedReader(new InputStreamReader(input));

        String value = b.readLine();
        if (value != null) {
            while (value != null) {
                if (iFlag == 1) {
                    if (value.trim().equals("")) {
                        value = b.readLine();
                        continue;
                    }
                }

                // 去除开头的串
                if (!sRflist.equals("")) {
                    if (sRflist.indexOf(",") == -1) {
                        if (chkSatisfy(value, sRflist)) {
                            value = b.readLine();
                            continue;
                        }
                        else {
                            iCount++;
                            value = b.readLine();
                        }
                    }
                    else {
                        String[] str = sRflist.split(",");
                        int iBz = 0;
                        for (int i = 0; i < str.length; i++) {
                            if (chkSatisfy(value, str[i])) {
                                iBz++;
                                break;
                            }
                        }
                        if (iBz == 0) {
                            iCount++;
                        }
                        value = b.readLine();
                    }
                }
                else {
                    iCount++;
                    value = b.readLine();
                }
            }
        }
        b.close();
        return iCount;
    }

    private static boolean chkSatisfy(String sValue, String sKeyword) {
        String sKeywordz = "^" + sKeyword + ".*";
        Pattern pattern = Pattern.compile(sKeywordz);
        Matcher matcher = pattern.matcher(sValue);
        boolean bResult = matcher.matches();
        return bResult;
    }

}
