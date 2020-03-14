<%@page import="infect.web.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>折线统计图</title>
    </head>
    <body>
        <!-- 折线统计图 -->
        <div class="row">
			<div id="chart1" style="width: 900px;height: 600px; margin:80px auto; text-align:center"></div>
            <div id="chart2" style="width: 900px;height: 600px; margin:80px auto; text-align:center"></div>
        </div>
    </body>
    <script src="echarts/echarts.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    	<%
    		String provinceName = request.getParameter("province");
    		myProvince mypro = new myProvince();
    		String pro = mypro.getProvincePinyin(provinceName);
    		String date = "2020-02-02";
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
	   	        data: [<%=tt.ipnum(date,pro)%>,<%=tt.spnum(date,pro)%>,<%=tt.curenum(date,pro)%>,<%=tt.deadnum(date,pro)%>],
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
		//var pro=<%=pro%>;
		//alert(pro);
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
                data: ['10.1', '10.2', '10.3', '10.4', '10.5', '10.6', '10.7']
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
                    data: [120, 132, 101, 134, 90, 230, 210]
                },
                {
                    name: '新增疑似趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#E83132",
                    data: [220, 182, 191, 234, 290, 330, 310]
                },
                {
                    name: '治愈趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#10AEB5",
                    data: [150, 232, 101, 154, 190, 330, 410]
                },
                {
                    name: '死亡趋势',
                    type: 'line',
                    stack: '总量',
                    smooth:true,
                    color:"#4D5054",
                    data: [320, 332, 301, 334, 190, 330, 320]
                },
            ]
        });
    </script>
</html>
