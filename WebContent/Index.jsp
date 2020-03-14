<%@page import="infect.web.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>疫情地图</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	    <script src="echarts/echarts.js"></script>
	    <script src="echarts/china.js"></script>
		    <style>
		        *{margin:0;padding:0}
		        html,body{
	            width:100%;
	            height:100%;
	        }
	        #main{
	              width:800px;
	              height:600px;
	              margin: 40px auto;
	              border:1px solid #FFFFFF;
	          }
	    </style>
	</head>
	<%
	    //Createtype tp=new Createtype();
	    File_handle tt= new File_handle();
	    tt.get_Flist();
	    String date="2020-02-02";
	    String pro="quanguo";
	%>
	<body>
	    <div id="main">
	    </div>
	    <script type="text/javascript">
	    var dataList=[
	        {name:"安徽",value:<%=tt.ipnum(date,"anhui")%>},
	        {name:"北京",value:<%=tt.ipnum(date,"beijing")%>},
	        {name:"重庆",value:<%=tt.ipnum(date,"chongqing")%>},
		    {name:"福建",value:<%=tt.ipnum(date,"fujian")%>},
	        {name:"甘肃",value:<%=tt.ipnum(date,"gansu")%>},
	        {name:"广东",value:<%=tt.ipnum(date,"guangdong")%>},
	        {name:"广西",value:<%=tt.ipnum(date,"guangxi")%>},
	        {name:"贵州",value:<%=tt.ipnum(date,"guizhou")%>},
	        {name:"海南",value:<%=tt.ipnum(date,"hainan")%>},
	        {name:"河北",value:<%=tt.ipnum(date,"hebei")%>},
	        {name:"河南",value:<%=tt.ipnum(date,"henan")%>},
	        {name:"黑龙江",value:<%=tt.ipnum(date,"heilongjiang")%>},
	        {name:"湖北",value:<%=tt.ipnum(date,"hubei")%>},
	        {name:"湖南",value:<%=tt.ipnum(date,"hunan")%>},
	        {name:"吉林",value:<%=tt.ipnum(date,"jilin")%>},
	        {name:"江苏",value:<%=tt.ipnum(date,"jiangsu")%>},
	        {name:"江西",value:<%=tt.ipnum(date,"jiangxi")%>},
	        {name:"辽宁",value:<%=tt.ipnum(date,"liaoning")%>},
	        {name:"内蒙古",value:<%=tt.ipnum(date,"neimenggu")%>},
	        {name:"宁夏",value:<%=tt.ipnum(date,"ningxia")%>},
	        {name:"青海",value:<%=tt.ipnum(date,"qinghai")%>},
	        {name:"山东",value:<%=tt.ipnum(date,"shandong")%>},
	        {name:"山西",value:<%=tt.ipnum(date,"shanxi")%>},
	        {name:"陕西",value:<%=tt.ipnum(date,"shan_xi")%>},
	        {name:"上海",value:<%=tt.ipnum(date,"shanghai")%>},
	        {name:"四川",value:<%=tt.ipnum(date,"sichuan")%>},
	        {name:"天津",value:<%=tt.ipnum(date,"tianjin")%>},
	        {name:"西藏",value:<%=tt.ipnum(date,"xizang")%>},
	        {name:"新疆",value:<%=tt.ipnum(date,"xinjiang")%>},
	        {name:"云南",value:<%=tt.ipnum(date,"yunnan")%>},
	        {name:"浙江",value:<%=tt.ipnum(date,"zhejiang")%>},
	    ]
	        var myChart = echarts.init(document.getElementById('main'));
	        option = {
	            title: {
                	text: '全国疫情大致分布情况',
                    subtext:'数据不代表真实情况',
                    left:'left',
                },
	            tooltip: {
                    formatter:function(params,ticket, callback){
                    	return "地区："+params.name+'<br />'+params.seriesName+'：'+params.value
                    }//数据格式化
                },
	            visualMap: {
	                min: 0,
	                max: 1500,
	                left: 'left',
	                top: 'bottom',
	                inRange: {
	                    color: ['#FFFF99', '#8b0000']//取值范围的颜色
	                },
	                show:true//图注
	            },
	            geo: {
	                map: 'china',
	                roam: false,//不开启缩放和平移
	                zoom:1.23,//视角缩放比例
	                label: {
	                    normal: {
	                        show: true,
	                        fontSize:'10',
	                        color: 'rgba(0,0,0,0.7)'
	                    }
	                },
	                itemStyle: {
	                    normal:{
	                        borderColor: 'rgba(0, 0, 0, 0.2)'
	                    },
	                    emphasis:{
	                        areaColor: '#BDFCC9',//鼠标选择区域颜色
	                        shadowOffsetX: 0,
	                        shadowOffsetY: 0,
	                        shadowBlur: 20,
	                        borderWidth: 0,
	                        shadowColor: 'rgba(0, 0, 0, 0.5)'
	                    }
	                }
	            },
	            series : [
	                {
	                    name: '确诊',
	                    type: 'map',
	                    geoIndex: 0,
	                    data:dataList
	                }
	            ]
	        };
	        myChart.setOption(option);
	        myChart.on('click', function (params) {
	        	window.location.href="province.jsp"+"?"+"province="+params.name;
	        });
	    </script>
	</body>
</html>