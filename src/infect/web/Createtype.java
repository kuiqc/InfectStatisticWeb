package infect.web;

public class Createtype {
    private DBTool myTool=new DBTool();
    public Createtype(){
        //感染表
        myTool.exeSQL(
                "create table `ip_number`" +
                        "(`Date` varchar(32) default NULL," +
                        "`quanguo`   int(3) default NULL,"+
                        "`anhui`   int(3) default NULL,"+
                        "`beijing`  int(3) default NULL,"+
                        "`chongqing`  int(3) default NULL,"+
                        "`fujian`  int(3) default NULL,"+
                        "`gansu`  int(3) default NULL,"+
                        "`guangdong`  int(3) default NULL,"+
                        "`guangxi`  int(3) default NULL,"+
                        "`guizhou`  int(3) default NULL,"+
                        "`hainan`  int(3) default NULL,"+
                        "`hebei`  int(3) default NULL,"+
                        "`henan`  int(3) default NULL,"+
                        "`heilongjiang`  int(3) default NULL,"+
                        "`hubei`  int(3) default NULL,"+
                        "`hunan`  int(3) default NULL,"+
                        "`jilin`  int(3) default NULL,"+
                        "`jiangsu`  int(3) default NULL,"+
                        "`jiangxi`  int(3) default NULL,"+
                        "`liaoning`  int(3) default NULL,"+
                        "`neimenggu`  int(3) default NULL,"+
                        "`ningxia`  int(3) default NULL,"+
                        "`qinghai`  int(3) default NULL,"+
                        "`shandong`  int(3) default NULL,"+
                        "`shanxi`  int(3) default NULL,"+
                        "`shan_xi`  int(3) default NULL,"+
                        "`shanghai`  int(3) default NULL,"+
                        "`sichuan`  int(3) default NULL,"+
                        "`tianjin`  int(3) default NULL,"+
                        "`xizang`  int(3) default NULL,"+
                        "`xinjiang`  int(3) default NULL,"+
                        "`yunnan`  int(3) default NULL,"+
                        "`zhejiang`  int(3) default NULL,"+
                        "`aomen`  int(3) default NULL,"+
                        "`xianggang`  int(3) default NULL,"+
                        "`taiwan`  int(3) default NULL,"+
                        "PRIMARY KEY  (`Date`))");
        //疑似表
        myTool.exeSQL(
                "create table `sp_number`" +
                        "(`Date` varchar(32) default NULL," +
                        "`quanguo`   int(3) default NULL,"+
                        "`anhui`   int(3) default NULL,"+
                        "`beijing`  int(3) default NULL,"+
                        "`chongqing`  int(3) default NULL,"+
                        "`fujian`  int(3) default NULL,"+
                        "`gansu`  int(3) default NULL,"+
                        "`guangdong`  int(3) default NULL,"+
                        "`guangxi`  int(3) default NULL,"+
                        "`guizhou`  int(3) default NULL,"+
                        "`hainan`  int(3) default NULL,"+
                        "`hebei`  int(3) default NULL,"+
                        "`henan`  int(3) default NULL,"+
                        "`heilongjiang`  int(3) default NULL,"+
                        "`hubei`  int(3) default NULL,"+
                        "`hunan`  int(3) default NULL,"+
                        "`jilin`  int(3) default NULL,"+
                        "`jiangsu`  int(3) default NULL,"+
                        "`jiangxi`  int(3) default NULL,"+
                        "`liaoning`  int(3) default NULL,"+
                        "`neimenggu`  int(3) default NULL,"+
                        "`ningxia`  int(3) default NULL,"+
                        "`qinghai`  int(3) default NULL,"+
                        "`shandong`  int(3) default NULL,"+
                        "`shanxi`  int(3) default NULL,"+
                        "`shan_xi`  int(3) default NULL,"+
                        "`shanghai`  int(3) default NULL,"+
                        "`sichuan`  int(3) default NULL,"+
                        "`tianjin`  int(3) default NULL,"+
                        "`xizang`  int(3) default NULL,"+
                        "`xinjiang`  int(3) default NULL,"+
                        "`yunnan`  int(3) default NULL,"+
                        "`zhejiang`  int(3) default NULL,"+
                        "`aomen`  int(3) default NULL,"+
                        "`xianggang`  int(3) default NULL,"+
                        "`taiwan`  int(3) default NULL,"+
                        "PRIMARY KEY  (`Date`))");
        //治愈表
        myTool.exeSQL(
                "create table `cure_number`" +
                        "(`Date` varchar(32) default NULL," +
                        "`quanguo`   int(3) default NULL,"+
                        "`anhui`   int(3) default NULL,"+
                        "`beijing`  int(3) default NULL,"+
                        "`chongqing`  int(3) default NULL,"+
                        "`fujian`  int(3) default NULL,"+
                        "`gansu`  int(3) default NULL,"+
                        "`guangdong`  int(3) default NULL,"+
                        "`guangxi`  int(3) default NULL,"+
                        "`guizhou`  int(3) default NULL,"+
                        "`hainan`  int(3) default NULL,"+
                        "`hebei`  int(3) default NULL,"+
                        "`henan`  int(3) default NULL,"+
                        "`heilongjiang`  int(3) default NULL,"+
                        "`hubei`  int(3) default NULL,"+
                        "`hunan`  int(3) default NULL,"+
                        "`jilin`  int(3) default NULL,"+
                        "`jiangsu`  int(3) default NULL,"+
                        "`jiangxi`  int(3) default NULL,"+
                        "`liaoning`  int(3) default NULL,"+
                        "`neimenggu`  int(3) default NULL,"+
                        "`ningxia`  int(3) default NULL,"+
                        "`qinghai`  int(3) default NULL,"+
                        "`shandong`  int(3) default NULL,"+
                        "`shanxi`  int(3) default NULL,"+
                        "`shan_xi`  int(3) default NULL,"+
                        "`shanghai`  int(3) default NULL,"+
                        "`sichuan`  int(3) default NULL,"+
                        "`tianjin`  int(3) default NULL,"+
                        "`xizang`  int(3) default NULL,"+
                        "`xinjiang`  int(3) default NULL,"+
                        "`yunnan`  int(3) default NULL,"+
                        "`zhejiang`  int(3) default NULL,"+
                        "`aomen`  int(3) default NULL,"+
                        "`xianggang`  int(3) default NULL,"+
                        "`taiwan`  int(3) default NULL,"+
                        "PRIMARY KEY  (`Date`))");
        //死亡表
        myTool.exeSQL(
                "create table `dead_number`" +
                        "(`Date` varchar(32) default NULL," +
                        "`quanguo`   int(3) default NULL,"+
                        "`anhui`   int(3) default NULL,"+
                        "`beijing`  int(3) default NULL,"+
                        "`chongqing`  int(3) default NULL,"+
                        "`fujian`  int(3) default NULL,"+
                        "`gansu`  int(3) default NULL,"+
                        "`guangdong`  int(3) default NULL,"+
                        "`guangxi`  int(3) default NULL,"+
                        "`guizhou`  int(3) default NULL,"+
                        "`hainan`  int(3) default NULL,"+
                        "`hebei`  int(3) default NULL,"+
                        "`henan`  int(3) default NULL,"+
                        "`heilongjiang`  int(3) default NULL,"+
                        "`hubei`  int(3) default NULL,"+
                        "`hunan`  int(3) default NULL,"+
                        "`jilin`  int(3) default NULL,"+
                        "`jiangsu`  int(3) default NULL,"+
                        "`jiangxi`  int(3) default NULL,"+
                        "`liaoning`  int(3) default NULL,"+
                        "`neimenggu`  int(3) default NULL,"+
                        "`ningxia`  int(3) default NULL,"+
                        "`qinghai`  int(3) default NULL,"+
                        "`shandong`  int(3) default NULL,"+
                        "`shanxi`  int(3) default NULL,"+
                        "`shan_xi`  int(3) default NULL,"+
                        "`shanghai`  int(3) default NULL,"+
                        "`sichuan`  int(3) default NULL,"+
                        "`tianjin`  int(3) default NULL,"+
                        "`xizang`  int(3) default NULL,"+
                        "`xinjiang`  int(3) default NULL,"+
                        "`yunnan`  int(3) default NULL,"+
                        "`zhejiang`  int(3) default NULL,"+
                        "`aomen`  int(3) default NULL,"+
                        "`xianggang`  int(3) default NULL,"+
                        "`taiwan`  int(3) default NULL,"+
                        "PRIMARY KEY  (`Date`))");
    }
}
