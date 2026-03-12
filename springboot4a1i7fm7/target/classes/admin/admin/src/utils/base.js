const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot4a1i7fm7/",
            name: "springboot4a1i7fm7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot4a1i7fm7/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生兼职平台"
        } 
    }
}
export default base
