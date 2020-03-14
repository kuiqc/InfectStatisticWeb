<%@page import="infect.web.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>疫情统计图</title>
    </head>
    <body>
        <div class="row">
			<div id="chart1" style="width: 900px;height: 600px; margin:40px auto; text-align:center"></div>
            <div id="chart2" style="width: 900px;height: 600px; margin:40px auto; text-align:center"></div>
        </div>
    </body>
    <script src="echarts/echarts.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    	<%
    	
			String date = "2020-02-02";
    	
    		String provinceName = request.getParameter("province");
    		myProvince mypro = new myProvince();
    		String pro = mypro.getProvincePinyin(provinceName);
    		File_handle tt= new File_handle();
    		
		%>
    	// 基于准备好的dom，初始化echarts实例
    	var myChart = echarts.init(document.getElementById("chart1"));
    	// 指定图表的配置项和数据
    	var option = {
        	// 标题
        	title: {
	        	text: '<%=provinceName%>'+'疫情情况柱状图',
	            subtext:'数据不代表真实情况',
	            left:'left',
	        },
	        tooltip:{
	            trigger:'axis'
	        },
	        // x轴
	        xAxis: {
	            data: ["感染患者人数", "疑似患者人数", "治愈人数", "死亡人数"]
	        },
	        yAxis: {},
	        // 数据
	        series: [{
	            name: '人数',
	            type: 'bar',
	   	        barWidth : 40,
	   	        data: [<%=tt.ipnum(date,pro)%>,<%=tt.spnum(date,pro)%>,<%=tt.curenum(date,pro)%>,<%=tt.deadnum(date,pro) %>],
	            itemStyle: {
	                normal: {
	                    color: function(params) {
	                        var colorList = [
	                          '#FF6A57','#E83132','#10AEB5','#4D5054'
	                        ];
	                        return colorList[params.dataIndex]
	                    },
	                    label: {
	                        show: true,
	                        position: 'top',
	                        formatter: '{b}\n{c}'
	                    }
	                }
	            },
	        }
	        ]
	    };
	
	    // 使用刚指定的配置项和数据显示图表。
	    myChart.setOption(option);
	
	</script>
	
    <script type="text/javascript">
    
    	<%
	    	myLogs myLogs = new myLogs();
	    	ArrayList<String> files = myLogs.getLogsName(date);
	    	
	    	ArrayList<Integer> arrIp = tt.iptd(date,pro);
	    	ArrayList<Integer> arrSp = tt.sptd(date,pro);
	    	ArrayList<Integer> arrCure = tt.curetd(date,pro);
	    	ArrayList<Integer> arrDead = tt.deadtd(date,pro);
	    	
    	%>
    	
    	//日期数组
    	var arr = new Array();
    	<% for(int i = 0;i<files.size();i++){ %>
		var j = '<%=files.get(i)%>';
		arr.push(j);
		<% } %>
		
		//ip增长数组
    	var arr1 = new Array();
    	<% for(int i = 0;i<arrIp.size();i++){ %>
    	j = '<%=arrIp.get(i)%>';
		arr1.push(j);
		<% } %>
		
		//sp增长数组
    	var arr2 = new Array();
    	<% for(int i = 0;i<arrSp.size();i++){ %>
    	j = '<%=arrSp.get(i)%>';
		arr2.push(j);
		<% } %>
		
		//Cure增长数组
    	var arr3 = new Array();
    	<% for(int i = 0;i<arrCure.size();i++){ %>
    	j = '<%=arrCure.get(i)%>';
		arr3.push(j);
		<% } %>
		
		//Dead增长数组
    	var arr4 = new Array();
    	<% for(int i = 0;i<arrDead.size();i++){ %>
    	j = '<%=arrDead.get(i)%>';
		arr4.push(j);
		<% } %>
    
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('chart2'));
        // 指定图表的配置项和数据
        myChart.setOption({
            title: {
            	text: '<%=provinceName%>'+'疫情情况折线图',
                subtext:'数据不代表真实情况',
                left:'left',
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross',
                    label: {
                        backgroundColor: '#6a7985'
                    }
                }
            },
            legend: {
                data: ['新增确诊趋势', '新增疑似趋势', '治愈趋势', '死亡趋势']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis: [{
                type: 'category',
                boundaryGap: false,
                data: arr,
             	//x轴文字倾斜
                axisLabel:{
                	interval:0,
                	rotate:25,
                }
            }],
            yAxis: [{
                type: 'value'
            }],
            series: [{
                    name: '新增确诊趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#FF6A57",
                    data: arr1,
                },
                {
                    name: '新增疑似趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#E83132",
                    data: arr2,
                },
                {
                    name: '治愈趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#10AEB5",
                    data: arr3,
                },
                {
                    name: '死亡趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#4D5054",
                    data: arr4,
                },
            ]
        });
    </script>
</html>
