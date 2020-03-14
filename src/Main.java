
public class Main {
    public static void main(String[] args) {

        //Createtype tp=new Createtype();
        File_handle tt= new File_handle();
        tt.get_Flist();
        String s1="2020-01-20";
        String s2="quanguo";
        System.out.println(tt.ipnum(s1,s2));
        System.out.println(tt.spnum(s1,s2));
        System.out.println(tt.curenum(s1,s2));
        System.out.println(tt.deadnum(s1,s2));
        //System.out.println(tt.iptd(s1,s2).get(2));
        //System.out.println(tt.sptd(s1,s2).get(2));
        //System.out.println(tt.curetd(s1,s2).get(2));
        //System.out.println(tt.deadtd(s1,s2).get(2));

    }
}