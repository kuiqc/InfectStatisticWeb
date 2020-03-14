import javax.swing.*;
import java.io.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class File_handle {
    //日志地址
    public String logaddr="C:\\Users\\61685\\IdeaProjects\\221701324\\log\\";
    //省份
    public String[] province={"全国","安徽","北京","重庆","福建","甘肃",
            "广东","广西","贵州","海南","河北","河南","黑龙江","湖北",
            "湖南","吉林","江苏","江西","辽宁","内蒙古","宁夏","青海",
            "山东","山西","陕西","上海","四川","天津","西藏", "新疆",
            "云南","浙江","澳门","香港","台湾"};//各省名称
    public int[][] person = new int[35][4];//各省各类人群


    //获取当前时间
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date d = new Date(System.currentTimeMillis());//获取当前时间
    public String date_now = formatter.format(d); //转化格式


        //读取路径下的文件
        public void get_Flist() {
            File[] flist;
            String fname;
            File file = new File(logaddr);//获取指定目录下文件
            flist = file.listFiles();
            int i;
            for (i = 0; i < flist.length; i++) {
                fname = flist[i].getName();//文件名
                System.out.println(fname);//显示文件名
                String Date=fname.substring(0,10);
                String alladdr = logaddr + fname;//完整文件路径
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

        //读取文本内容
        public void Read_txt(String address) {
            try {
                BufferedReader bf;
                bf = new BufferedReader(new InputStreamReader(
                        new FileInputStream(new File(address)), "UTF-8"));
                String rLine = null;
                /*隔行读取了
                while(br.readLine()!=null){
                    rLine=br.readLine();//按行读取
                    //if (!rLine.startsWith("//")){
                        System.out.println(rLine);
                    //}

                 */
                while ((rLine = bf.readLine()) != null) {
                    if (!rLine.startsWith("//")) {
                        /*
                        检测文档读取是否正确
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

        //处理文本
        public void Deal_txt(String line) {
            String[] str = {"(\\S+) 新增 感染患者 (\\d+)人", "(\\S+) 新增 疑似患者 (\\d+)人",
                    "(\\S+) 感染患者 流入 (\\S+) (\\d+)人", "(\\S+) 疑似患者 流入 (\\S+) (\\d+)人",
                    "(\\S+) 死亡 (\\d+)人", "(\\S+) 治愈 (\\d+)人",
                    "(\\S+) 疑似患者 确诊感染 (\\d+)人", "(\\S+) 排除 疑似患者 (\\d+)人"
            };//日志可能出现的情况
            int num[] = new int[8];//各种人数
            String[] txt_str = line.split(" ");//用空格隔开

            if (line.matches(str[0])) {//新增感染者
                txt_str[3] = txt_str[3].replace("人", "");
                num[0] = Integer.valueOf(txt_str[3]);//把人数转化为int类型
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        //System.out.println(province[i]);用来检验输出
                        person[i][0] += num[0];
                        person[0][0] += num[0];
                        break;
                    }
                }
            } else if (line.matches(str[1])) {//新增疑似
                txt_str[3] = txt_str[3].replace("人", "");
                num[1] = Integer.valueOf(txt_str[3]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][1] += num[1];
                        person[0][1] += num[1];
                        break;
                    }
                }
            } else if (line.matches(str[2])) {//感染流入
                txt_str[4] = txt_str[4].replace("人", "");
                num[2] = Integer.valueOf(txt_str[4]);
                for (int j = 0; j < province.length; j++) {
                    if (txt_str[0].equals(province[j])) {//流出省
                        person[j][0] -= num[2];
                        break;
                    }
                }
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[3].equals(province[i])) {//流入省
                        person[i][0] += num[2];
                        break;
                    }
                }

            } else if (line.matches(str[3])) {//疑似流入
                txt_str[4] = txt_str[4].replace("人", "");
                num[3] = Integer.valueOf(txt_str[4]);
                for (int j = 0; j < province.length; j++) {//流出省
                    if (txt_str[0].equals(province[j])) {
                        person[j][1] -= num[3];
                        break;
                    }
                }
                for (int i = 0; i < province.length; i++) {//流入省
                    if (txt_str[3].equals(province[i])) {
                        person[i][1] += num[3];
                        break;
                    }
                }

            } else if (line.matches(str[4])) {//死亡人数
                txt_str[2] = txt_str[2].replace("人", "");
                num[4] = Integer.valueOf(txt_str[2]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][3] += num[4];//该省死亡人数增加
                        person[0][3] += num[4];//全国死亡人数增加
                        person[i][0] -= num[4];//该省感染人数减少
                        person[0][0] -= num[4];//全国感染人数减少
                        break;
                    }
                }
            } else if (line.matches(str[5])) {//治愈人数
                txt_str[2] = txt_str[2].replace("人", "");
                num[5] = Integer.valueOf(txt_str[2]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][2] += num[5];//该省治愈人数增加
                        person[0][2] += num[5];//全国治愈人数增加
                        person[i][0] -= num[5];//该省感染人数减少
                        person[0][0] -= num[5];//全国感染人数减少
                        break;
                    }
                }
            } else if (line.matches(str[6])) {//疑似确诊感染
                txt_str[3] = txt_str[3].replace("人", "");
                num[6] = Integer.valueOf(txt_str[3]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][0] += num[6];//该省感染人数增加
                        person[0][0] += num[6];//全国感染人数增加
                        person[i][1] -= num[6];//该省疑似人数减少
                        person[0][1] -= num[6];//全国疑似人数减少
                        break;
                    }
                }
            } else if (line.matches(str[7])) {//排除疑似者
                txt_str[3] = txt_str[3].replace("人", "");
                num[7] = Integer.valueOf(txt_str[3]);
                for (int i = 0; i < province.length; i++) {
                    if (txt_str[0].equals(province[i])) {
                        person[i][1] -= num[7];//该省疑似人数减少
                        person[0][1] -= num[7];//全国疑似人数减少
                        break;
                    }
                }
            }
        }

        //ip人数
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
                    System.out.println("查无此记录!");
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

        //sp人数
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
                    System.out.println("查无此记录!");
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

        //cure人数
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
                    System.out.println("查无此记录!");
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

        //dead人数
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
                    System.out.println("查无此记录!");
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

        //到目前为止新增ip人数数组
        public ArrayList<Integer> iptd(String date,String prv) {
            ArrayList<Integer> arr=new ArrayList<Integer>();
            DBTool myTool=new DBTool();
            int num1=0;//最开始一天为0/前一天
            int num2=0;//当天
            int n;//差
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
                        num1=num2;//当天变前天
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

    //到目前为止新增sp人数数组
    public ArrayList<Integer> sptd(String date,String prv) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        DBTool myTool=new DBTool();
        int num1=0;//最开始一天为0/前一天
        int num2=0;//当天
        int n;//差
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
                    num1=num2;//当天变前天
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

    //到目前为止的cure人数数组
    public ArrayList<Integer> curetd(String date,String prv) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        DBTool myTool=new DBTool();
        int n;//人数
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

    //到目前为止的dead人数数组
    public ArrayList<Integer> deadtd(String date,String prv) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        DBTool myTool=new DBTool();
        int n;//人数
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
