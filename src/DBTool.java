import java.sql.*;

public class DBTool {
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "123456";
    public Connection c;
    public  DBTool() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // 通过数据源与数据库建立起连接
            c  =DriverManager.getConnection(url,user,password);
            if(isExistDatabase("db_yq"))
                exeSQL("use db_yq");
            else{
                exeSQL("create database db_yq");
                exeSQL("use db_yq");
            }
        }catch(Exception ex) {
            ex.printStackTrace();
            c=null;
        }
    }

    public boolean exeSQL(String sql){
        try{
            if(c==null)
                return false;
            Statement s=c.createStatement( ); // 创建SQL语句对象
            s.executeUpdate(sql);
            s.close();
            return true;
        }catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean isExistDatabase(String database) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;// 数据库结果集
        try {
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            String sql = "SELECT COUNT(*) FROM information_schema.schemata WHERE schema_name=\"" + database + "\"";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                if (rs.getInt(1) == 0) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}

