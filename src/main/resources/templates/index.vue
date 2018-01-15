<!DOCTYPE HTML>
<html xmlns:v-bind="http://www.w3.org/1999/xhtml" xmlns:v-on="http://www.w3.org/1999/xhtml">
<head>
    <title>hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script src="https://cdn.jsdelivr.net/npm/vue"></script>
</head>
<body>
<div id="app">
    {{message}}
</div>

<div id="app2">
    <span v-bind:title="message">
        鼠标悬停几秒钟查看此处动态绑定的提示信息！
    </span>

</div>

<div id="app3">
   <p v-if="!seen">you can see me</p>

</div>

<div id="app4">
    <ol>
        <li v-for="l in list">
            <span >{{l.id}}</span><span >{{l.name}}</span>
        </li>
    </ol>
</div>

<div id="app-5">
    <p>{{ message }}</p>
    <button v-on:click="reverseMessage">逆转消息</button>
</div>

<div id="app-6">
    <p>{{ message }}</p>
   <input v-model="message">
</div>
</body>
<script>
    var app = new Vue({
        el: "#app",
        data: {
            message: "hello world111"
        }
    });

    var app2 = new Vue({
        el: "#app2",
        data: {
            message: "当前时间："+new Date().toLocaleString()
        }
    });

    var app3 = new Vue({
        el: "#app3",
        data: {
            seen: true
        }
    });

    var app4 = new Vue({
        el: "#app4",
        data: {
            list:[
                {id:1,name:'zhangsan'},
                {id:2,name:'lisi'},
                {id:3,name:'wangwu'}
            ]
        }
    });

    var app5 = new Vue({
        el: '#app-5',
        data: {
            message: 'Hello Vue.js!'
        },
        methods: {
            reverseMessage: function () {
                debugger;
                this.message =  this.message.split('').reverse().join('')
            }
        }
    });

    var app6 = new Vue({
        el: '#app-6',
        data: {
            message: 'Hello Vue.js!'
        }
    })

</script>
</html>