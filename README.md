# career-path

Highly accessible & integrated informational website for career-finding among international students at UCSD.

## Development Note
此项目通过Vue和Springboot实现前后端分离:

  - 后端方面
    - controller  实现登入和注册时的检查
    - mapper      实现数据库自动查询
    - common      实现结果类型自定义
    - entity      实现用户构造
    
  - 前端方面
    - router      实现路由逻辑
    - layout      实现整个页面的布局
    - views       实现内容区域的页面
    - components  实现header, aside等其他区域的页面
    - utils       实现页面请求的数据传输
    - assets      实现css及特殊自定义资源


## Customize configuration

See [Vite Configuration Reference](https://vitejs.dev/config/).

## Project Setup

package.json: /career-path/vue/package.json

```sh
npm install
```

### Compile and Hot-Reload for Development

```sh
npm run dev
```

### Compile and Minify for Production

```sh
npm run build
```
