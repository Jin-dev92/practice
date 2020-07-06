var http = require('http'); // 모듈 사용 선언
var fs = require('fs');
var url = require('url');

var app = http.createServer(function(request,response){
    var _url = request.url;
    var querydata = url.parse(_url,true).query;
    var title = querydata.id;
    var pathname = url.parse(_url,true).pathname;

    // console.log(url.parse(_url,true).path);


    if(_url == '/'){
      _url = '/index.html';
    }
    if(_url == '/favicon.ico'){
        response.writeHead(404);
        response.end();
        return;
    }
    if (pathname == '/') {
        if (querydata.id === undefined) {
            querydata.id = 'Welcome';
        }
        //  else {
            fs.readFile(`data/${querydata.id}`,'utf8',function(err,description){
                // var description = data;
                var template = `
                <!doctype html>
                <html>
                <head>
                <title>WEB1 - ${querydata.id}</title>
                <meta charset="utf-8">
                </head>
                <body>
                <h1><a href="/">WEB</a></h1>
                <ol>
                    <li><a href="1.html">HTML</a></li>
                    <li><a href="2.html">CSS</a></li>
                    <li><a href="3.html">JavaScript</a></li>
                </ol>
                <h2>${querydata.id}</h2>
                <p>
                    ${description}
                </p>
                </body>
                </html>
                `;
                response.writeHead(200);
                // response.end(fs.readFileSync(__dirname + _url));
                response.end(template);
            }); 
        // }
    }else{
        response.writeHead(200);
        response.end('Not Found');
    }
});
app.listen(3000);