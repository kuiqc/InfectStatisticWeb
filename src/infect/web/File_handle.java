package infect.web;

import javax.swing.*;
import java.io.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class File_handle {
    //��־��ַ
    public String logaddr="D:\\log\\";
    //ʡ��
    public String[] province={"ȫ��","����","����","����","����","����",
            "�㶫","����","����","����","�ӱ�","����","������","����",
            "����","����","����","����","����","���ɹ�","����","�ຣ",
            "ɽ��","ɽ��","����","�Ϻ�","�Ĵ�","���","����", "�½�",
            "����","�㽭","����","���","̨��"};//��ʡ����
    public int[][] person = new int[35][4];//��ʡ������Ⱥ


    //��ȡ��ǰʱ��
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date d = new Date(System.currentTimeMillis());//��ȡ��ǰʱ��
    public String date_now = formatter.format(d); //ת����ʽ

        //��ȡ·���µ��ļ�
        public void get_Flist() {
            File[] flist;
            String fname;
            File file = new File(logaddr);//��ȡָ��Ŀ¼���ļ�
            flist = file.listFiles();
            int i;
            for (i = 0; i < flist.length; i++) {
                fname = flist[i].getName();//�ļ���
                //System.out.println(fname);//��ʾ�ļ���
                String Date=fname.substring(0,10);
                String alladdr = logaddr + fname;//�����ļ�·��
                Read_txt(alladdr);
                DBTool myTool=new DBTool();
                myTool.exeSQL("insert ignore into ip_number values('" + Date + "','" +
                        person[0][0] + "','" + person[1][0] + "','" + person[2][0] + "','" + person[3][0] + "','" + person[4][0] + "','" +
                        person[5][0] + "','" + person[6][0] + "','" + person[7][0] + "','" + person[8][0] + "','" + person[9][0] + "','" +
                        person[10][0] + "','" + person[11][0] + "','" + person[12][0] + "','" + person[13][0] + "','" + person[14][0] + "','" +
                        person[15][0] + "','" + person[16][0] + "','" + person[17][0] + "','" + person[18][0] + "','" + person[19][0] + "','" +
                        person[20][0] + "','" + person[21][0] + "','" + person[22][0] + "','" + person[23][0] + "','" + person[24][0] + "','" +
                        person[25][0] + "','" + person[26][0] + "','" + person[27][0] + "','" + person[28][0] + "','" + person[29][0] + "','" +
                        person[30][0] + "','" + person[31][0] + "','" + person[32][0] + "','" + person[33][0] + "','" + person[34][0] + "')");
                myTool.exeSQL("insert ignore into sp_number values('" + Date + "','" +
                        person[0][1] + "','" + person[1][1] + "','" + person[2][1] + "','" + person[3][1] + "','" + person[4][1] + "','" +
                        person[5][1] + "','" + person[6][1] + "','" + person[7][1] + "','" + person[8][1] + "','" + person[9][1] + "','" +
                        person[10][1] + "','" + person[11][1] + "','" + person[12][1] + "','" + person[13][1] + "','" + person[14][1] + "','" +
                        person[15][1] + "','" + person[16][1] + "','" + person[17][1] + "','" + person[18][1] + "','" + person[19][1] + "','" +
                        person[20][1] + "','" + person[21][1] + "','" + person[22][1] + "','" + person[23][1] + "','" + person[24][1] + "','" +
                        person[25][1] + "','" + person[26][1] + "','" + person[27][1] + "','" + person[28][1] + "','" + person[29][1] + "','" +
                        person[30][1] + "','" + person[31][1] + "','" + person[32][1] + "','" + person[33][1] + "','" + person[34][1] + "')");
                myTool.exeSQL("insert ignore into cure_number values('" + Date + "','" +
                        person[0][2] + "','" + person[1][2] + "','" + person[2][2] + "','" + person[3][2] + "','" + person[4][2] + "','" +
                        person[5][2] + "','" + person[6][2] + "','" + person[7][2] + "','" + person[8][2] + "','" + person[9][2] + "','" +
                        person[10][2] + "','" + person[11][2] + "','" + person[12][2] + "','" + person[13][2] + "','" + person[14][2] + "','" +
                        person[15][2] + "','" + person[16][2] + "','" + person[17][2] + "','" + person[18][2] + "','" + person[19][2] + "','" +
                        person[20][2] + "','" + person[21][2] + "','" + person[22][2] + "','" + person[23][2] + "','" + person[24][2] + "','" +
                        person[25][2] + "','" + person[26][2] + "','" + person[27][2] + "','" + person[28][2] + "','" + person[29][2] + "','" +
                        person[30][2] + "','" + person[31][2] + "','" + person[32][2] + "','" + person[33][2] + "','" + person[34][2] + "')");
                myTool.exeSQL("insert ignore into dead_number values('" + Date + "','" +
                        person[0][3] + "','" + person[1][3] + "','" + person[2][3] + "','" + person[3][3] + "','" + person[4][3] + "','" +
                        person[5][3] + "','" + person[6][3] + "','" + person[7][3] + "','" + person[8][3] + "','" + person[9][3] + "','" +
                        person[10][3] + "','" + person[11][3] + "','" + person[12][3] + "','" + person[13][3] + "','" + person[14][3] + "','" +
                        person[15][3] + "','" + person[16][3] + "','" + person[17][3] + "','" + person[18][3] + "','" + person[19][3] + "','" +
                        person[20][3] + "','" + person[21][3] + "','" + person[22][3] + "','" + person[23][3] + "','" + person[24][3] + "','" +
                        person[25][3] + "','" + person[26][3] + "','" + person[27][3] + "','" + person[28][3] + "','" + person[29][3] + "','" +
                        person[30][3] + "','" + person[31][3] + "','" + person[32][3] + "','" + person[33][3] + "','" + person[34][3] + "')");

                //System.out.print(province[j]+":"+person[j][1]+";");
                //System.out.println();
            }
        }

        //��ȡ�ı�����
        public void Read_txt(String address) {
            try {
                BufferedReader bf;
                bf = new BufferedReader(new InputStreamReader(
                        new FileInputStream(new File(address)), "UTF-8"));
                String rLine = null;
                /*���ж�ȡ��
                while(br.readLine()!=null){
                    rLine=br.readLine();//���ж�ȡ
                    //if (!rLine.startsWith("//")){
                        System.out.println(rLine);
                    //}

                 */
                while ((rLine = bf.readLine()) != null) {
                    if (!rLine.startsWith("//")) {
                        /*
                        ����ĵ���ȡ�Ƿ���ȷ
                        System.out.println(rLine);
                        */
                        Deal_txt(rLine);
                    }
                }
                bf.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

        //�����ı�
        public void Deal_txt(String line) {
            String[] str = {"(\\S+) ���� ��Ⱦ���� (\\d+)��", "(\\S+) ���� ���ƻ��� (\\d+)��",
                    "(\\S+) ��Ⱦ���� ���� (\\S+) (\\d+)��", "(\\S+) ���ƻ��� ���� (\\S+) (\\d+)��",
                    "(\\S+) ���� (\\d+)��", "(\\S+) ���� (\\d+)��",
                    "(\\S+) ���ƻ��� ȷ���Ⱦ (\\d+)��", "(\\S+) �ų� ���ƻ��� (\\d+)��"
            };//��־���ܳ��ֵ����
            int num[] = new int[8];//��������
            String[] txt_str = line.split(" ");//�ÿո����

            if (line.matches(str[0])) {//������Ⱦ��
                txt_str[3] = txt_str[3].replace("��", "");
                num[0] = Integer.valueOf(txt_str[3]);//������ת��Ϊint����
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        //System.out.println(province[i]);�����������
                        person[i][0] += num[0];
                        person[0][0] += num[0];
                        break;
                    }
                }
            } else if (line.matches(str[1])) {//��������
                txt_str[3] = txt_str[3].replace("��", "");
                num[1] = Integer.valueOf(txt_str[3]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][1] += num[1];
                        person[0][1] += num[1];
                        break;
                    }
                }
            } else if (line.matches(str[2])) {//��Ⱦ����
                txt_str[4] = txt_str[4].replace("��", "");
                num[2] = Integer.valueOf(txt_str[4]);
                for (int j = 0; j < province.length; j++) {
                    if (txt_str[0].equals(province[j])) {//����ʡ
                        person[j][0] -= num[2];
                        break;
                    }
                }
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[3].equals(province[i])) {//����ʡ
                        person[i][0] += num[2];
                        break;
                    }
                }

            } else if (line.matches(str[3])) {//��������
                txt_str[4] = txt_str[4].replace("��", "");
                num[3] = Integer.valueOf(txt_str[4]);
                for (int j = 0; j < province.length; j++) {//����ʡ
                    if (txt_str[0].equals(province[j])) {
                        person[j][1] -= num[3];
                        break;
                    }
                }
                for (int i = 0; i < province.length; i++) {//����ʡ
                    if (txt_str[3].equals(province[i])) {
                        person[i][1] += num[3];
                        break;
                    }
                }

            } else if (line.matches(str[4])) {//��������
                txt_str[2] = txt_str[2].replace("��", "");
                num[4] = Integer.valueOf(txt_str[2]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][3] += num[4];//��ʡ������������
                        person[0][3] += num[4];//ȫ��������������
                        person[i][0] -= num[4];//��ʡ��Ⱦ��������
                        person[0][0] -= num[4];//ȫ����Ⱦ��������
                        break;
                    }
                }
            } else if (line.matches(str[5])) {//��������
                txt_str[2] = txt_str[2].replace("��", "");
                num[5] = Integer.valueOf(txt_str[2]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][2] += num[5];//��ʡ������������
                        person[0][2] += num[5];//ȫ��������������
                        person[i][0] -= num[5];//��ʡ��Ⱦ��������
                        person[0][0] -= num[5];//ȫ����Ⱦ��������
                        break;
                    }
                }
            } else if (line.matches(str[6])) {//����ȷ���Ⱦ
                txt_str[3] = txt_str[3].replace("��", "");
                num[6] = Integer.valueOf(txt_str[3]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][0] += num[6];//��ʡ��Ⱦ��������
                        person[0][0] += num[6];//ȫ����Ⱦ��������
                        person[i][1] -= num[6];//��ʡ������������
                        person[0][1] -= num[6];//ȫ��������������
                        break;
                    }
                }
            } else if (line.matches(str[7])) {//�ų�������
                txt_str[3] = txt_str[3].replace("��", "");
                num[7] = Integer.valueOf(txt_str[3]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][1] -= num[7];//��ʡ������������
                        person[0][1] -= num[7];//ȫ��������������
                        break;
                    }
                }
            }
        }

        //ip����
        public int ipnum(String date,String prv){
            int num=0;
            DBTool myTool=new DBTool();
            try
            {
                Statement s = myTool.c.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                );
                String ipn = "select * from ip_number where Date like '"+date+"'";
                ResultSet r = s.executeQuery(ipn);
                r.beforeFirst();
                if(!r.next())
                    System.out.println("���޴˼�¼!");
                else{
                    num=Integer.parseInt(r.getString(prv));
                }
                s.close();
            }
            catch(Exception e1) {
                e1.printStackTrace();
            }

            return num;

        }

        //sp����
        public int spnum(String date,String prv){
            int num=0;
            DBTool myTool=new DBTool();
            try
            {
                Statement s = myTool.c.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                );
                String spn = "select * from sp_number where Date like '"+date+"'";
                ResultSet r = s.executeQuery(spn);
                r.beforeFirst();
                if(!r.next())
                    System.out.println("���޴˼�¼!");
                else{
                    num=Integer.parseInt(r.getString(prv));
                }
                s.close();
            }
            catch(Exception e1) {
                e1.printStackTrace();
            }

            return num;

        }

        //cure����
        public int curenum(String date,String prv){
            int num=0;
            DBTool myTool=new DBTool();
            try
            {
                Statement s = myTool.c.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                );
                String curen = "select * from cure_number where Date like '"+date+"'";
                ResultSet r = s.executeQuery(curen);
                r.beforeFirst();
                if(!r.next())
                    System.out.println("���޴˼�¼!");
                else{
                    num=Integer.parseInt(r.getString(prv));
                }
                s.close();
            }
            catch(Exception e1) {
                e1.printStackTrace();
            }

            return num;

        }

        //dead����
        public int deadnum(String date,String prv){
            int num=0;
            DBTool myTool=new DBTool();
            try
            {
                Statement s = myTool.c.createStatement(
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                );
                String deadn = "select * from dead_number where Date like '"+date+"'";
                ResultSet r = s.executeQuery(deadn);
                r.beforeFirst();
                if(!r.next())
                    System.out.println("���޴˼�¼!");
                else{
                    num=Integer.parseInt(r.getString(prv));
                }
                s.close();
            }
            catch(Exception e1) {
                e1.printStackTrace();
            }

            return num;

        }

        //��ĿǰΪֹ����ip��������
        public ArrayList<Integer> iptd(String date,String prv) {
            ArrayList<Integer> arr=new ArrayList<Integer>();
            DBTool myTool=new DBTool();
            int num1=0;//�ʼһ��Ϊ0/ǰһ��
            int num2=0;//����
            int n;//��
            try
            {
                Statement s = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                String SearchStr = "SELECT * FROM `ip_number` WHERE 1 = 1";
                ResultSet r = s.executeQuery(SearchStr);

                while(r.next()){
                    String d=r.getString("Date");
                    if(date.compareTo(d)>=0){
                        Statement ss = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                ResultSet.CONCUR_UPDATABLE);
                        String ipn = "select * from ip_number where Date like '"+d+"'";
                        ResultSet rr = ss.executeQuery(ipn);
                        rr.beforeFirst();
                        rr.next();
                        num2=Integer.parseInt(rr.getString(prv));
                        n=num2-num1;
                        arr.add(n);
                        num1=num2;//�����ǰ��
                    }
                }
                r.close();
                s.close();
            }
            catch(Exception e1) {
                e1.printStackTrace();
            }
            return (arr);

        }

    //��ĿǰΪֹ����sp��������
    public ArrayList<Integer> sptd(String date,String prv) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        DBTool myTool=new DBTool();
        int num1=0;//�ʼһ��Ϊ0/ǰһ��
        int num2=0;//����
        int n;//��
        try
        {
            Statement s = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String SearchStr = "SELECT * FROM `sp_number` WHERE 1 = 1";
            ResultSet r = s.executeQuery(SearchStr);

            while(r.next()){
                String d=r.getString("Date");
                if(date.compareTo(d)>=0){
                    Statement ss = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                    String ipn = "select * from sp_number where Date like '"+d+"'";
                    ResultSet rr = ss.executeQuery(ipn);
                    rr.beforeFirst();
                    rr.next();
                    num2=Integer.parseInt(rr.getString(prv));
                    n=num2-num1;
                    arr.add(n);
                    num1=num2;//�����ǰ��
                }
            }
            r.close();
            s.close();
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
        return (arr);

    }

    //��ĿǰΪֹ��cure��������
    public ArrayList<Integer> curetd(String date,String prv) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        DBTool myTool=new DBTool();
        int n;//����
        try
        {
            Statement s = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String SearchStr = "SELECT * FROM `cure_number` WHERE 1 = 1";
            ResultSet r = s.executeQuery(SearchStr);

            while(r.next()){
                String d=r.getString("Date");
                if(date.compareTo(d)>=0){
                    Statement ss = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                    String ipn = "select * from cure_number where Date like '"+d+"'";
                    ResultSet rr = ss.executeQuery(ipn);
                    rr.beforeFirst();
                    rr.next();
                    n=Integer.parseInt(rr.getString(prv));
                    arr.add(n);
                }
            }
            r.close();
            s.close();
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
        return (arr);

    }

    //��ĿǰΪֹ��dead��������
    public ArrayList<Integer> deadtd(String date,String prv) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        DBTool myTool=new DBTool();
        int n;//����
        try
        {
            Statement s = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String SearchStr = "SELECT * FROM `dead_number` WHERE 1 = 1";
            ResultSet r = s.executeQuery(SearchStr);

            while(r.next()){
                String d=r.getString("Date");
                if(date.compareTo(d)>=0){
                    Statement ss = myTool.c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
                    String ipn = "select * from dead_number where Date like '"+d+"'";
                    ResultSet rr = ss.executeQuery(ipn);
                    rr.beforeFirst();
                    rr.next();
                    n=Integer.parseInt(rr.getString(prv));
                    arr.add(n);
                }
            }
            r.close();
            s.close();
        }
        catch(Exception e1) {
            e1.printStackTrace();
        }
        return (arr);

    }



}
