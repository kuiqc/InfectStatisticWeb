package infect.web;

import java.io.File;
import java.util.ArrayList;

public class myLogs {
	
	public String getLatestDate() {
    	String logPath="D:\\log\\";
        File file = new File(logPath);
        File[] tempList = file.listFiles();
        String fileName = new String();
        
        //�����в�����date��.log.txt�ļ��ľ���·����ӵ�files�����ж������Ƿ񳬳���Χ
        for (int i = 0; i < tempList.length; i++) {
            if (i==tempList.length-1) {
                //fileName��������·������׺��Ҳ����˵ֻ������yyyy-mm-dd��
                fileName = tempList[i].getName().substring(0,10);
            }
        }
        return fileName;
	}
	
    //��ȡָ�������Լ�֮ǰ������log�ļ�
    public ArrayList<String> getLogsName(String date) {
    	String logPath="D:\\log\\";
        ArrayList<String> files = new ArrayList<String>();
        File file = new File(logPath);
        File[] tempList = file.listFiles();
        
        //�����в�����date��.log.txt�ļ��ľ���·����ӵ�files�����ж������Ƿ񳬳���Χ
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                //fileName��������·������׺��Ҳ����˵ֻ������yyyy-mm-dd��
                String fileName = tempList[i].getName().substring(0,10);
                
                //��d1����d2��dateCompare����-1��filesֻ��¼���в�����date������
            	if(dateCompare(date,fileName) != -1) {
            		files.add(fileName);
            	}
            }
        }
        return files;
    }
    
    /*
     * ����String����d1��d2���Ƚ��������ڵ��Ⱥ�
     * ��d1����d2��dateCompare����-1
     * ��d1����d2��dateCompare����0
     * ��d1����d2��dateCompare����1
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
