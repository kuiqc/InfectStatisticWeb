<%@page import="infect.web.myProvince"%>
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
              margin: 50px auto;
              border:1px solid #FFFFFF;
          }
        /*默认长宽比0.75*/
    </style>
</head>
<body>
    <div id="main">
    </div>
    <script type="text/javascript">
    var dataList=[
        {name:"安徽",value:randomValue()},
        {name:"北京",value:randomValue()},
        {name:"重庆",value:randomValue()},
        {name:"福建",value:randomValue()},
        {name:"甘肃",value:randomValue()},
        {name:"广东",value:randomValue()},
        {name:"广西",value:randomValue()},
        {name:"贵州",value:randomValue()},
        {name:"海南",value:randomValue()},
        {name:"河北",value:randomValue()},
        {name:"河南",value:randomValue()},
        {name:"黑龙江",value:randomValue()},
        {name:"湖北",value:randomValue()},
        {name:"湖南",value:randomValue()},
        {name:"吉林",value:randomValue()},
        {name:"江苏",value:randomValue()},
        {name:"江西",value:randomValue()},
        {name:"辽宁",value:randomValue()},
        {name:"内蒙古",value:randomValue()},
        {name:"宁夏",value:randomValue()},
        {name:"青海",value:randomValue()},
        {name:"山东",value:randomValue()},
        {name:"山西",value:randomValue()},
        {name:"陕西",value:randomValue()},
        {name:"上海",value:randomValue()},
        {name:"四川",value:randomValue()},
        {name:"天津",value:randomValue()},
        {name:"西藏",value:randomValue()},
        {name:"新疆",value:randomValue()},
        {name:"云南",value:randomValue()},
        {name:"浙江",value:randomValue()},
    ]
        var myChart = echarts.init(document.getElementById('main'));
        function randomValue() {
            return Math.round(Math.random()*1000);
        }
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
                text: ['高','低'],//取值范围的文字
                inRange: {
                    color: ['#FFFFFF', '#8b0000']//取值范围的颜色
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
        	window.location.href="province.jsp"+"?"+"province="+ params.name;
        });
    </script>
</body>
</html>