package infect.web;

import java.io.File;
import java.util.ArrayList;

public class myLogs {
    //读取指定日期以及之前的所有log文件
    public ArrayList<String> getLogsName(String date) {
    	System.out.print("getLogsName is been used!\n\n\n\n\n\n\n\n\n");
    	String logPath="D:\\log\\";
        ArrayList<String> files = new ArrayList<String>();
        File file = new File(logPath);
        File[] tempList = file.listFiles();
        
        //将所有不晚于date的.log.txt文件的绝对路径添加到files，并判断日期是否超出范围
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                //fileName，不包含路径、后缀（也就是说只有日期yyyy-mm-dd）
                String fileName = tempList[i].getName().substring(0,10);
                
                //当d1早于d2，dateCompare返回-1，files只记录所有不晚于date的日期
            	if(dateCompare(date,fileName) != -1) {
            		files.add(fileName);
            	}
            }
        }
        return files;
    }
    
    /*
     * 输入String日期d1，d2，比较两个日期的先后
     * 当d1早于d2，dateCompare返回-1
     * 当d1等于d2，dateCompare返回0
     * 当d1晚于d2，dateCompare返回1
     */
    public int dateCompare(String date1,String date2) {

        int res=date1.compareTo(date2);
        if(res>0)
            return 1;
        else if(res==0)
        	return 0;
        else
        	return -1;
    }
}
