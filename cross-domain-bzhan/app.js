const Koa = require("koa");

const app = new Koa();

app.use((ctx)=> {
    ctx.body = {
        msg:"看大佬们白手起高楼,创个服务端分分钟的事儿~~~"
    }
})
app.listen(3000);