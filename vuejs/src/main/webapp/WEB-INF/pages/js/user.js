new Vue({
    el:"#app",
    data:{
        user:{id:"",username:"aaa",password:"",sex:"",age:"",email:"599@qq.com"},
        useradd:{id:"",username:"",password:"",sex:"",age:"",email:""},
        userList:[]
    },
    methods:{
      findAll:function(){
          var _this = this;
          axios.get("/vuejs/user/findAll").then(function(response){
              _this.userList = response.data;
              console.log(_this.userList);
          }).catch(function (err) {
              console.log(err);
          });
      },
      findById(userId){
        _this = this;
        axios.get("/vuejs/user/findById",{
            params:{
                id:userId
            }
        }).then(function (value) {
            _this.user = value.data;
            $("#myModal").modal("show")
        }).catch(function (reason) { console.log(reason) })
      },
      update:function(){
          _this = this;
          axios.post("/vuejs/user/update",_this.user).then(function (value) {
                _this.findAll();
          }).catch(function (error) { console.log(error) })
      },
      deleteById(userId){
          _this = this;
          axios.get("/vuejs/user/delete",{
              params:{
                  id:userId
              }
          }).then(function (value) {
              _this.findAll();
          }).catch(function (reason) { console.log(reason) })
      },
      save:function(){
          _this = this;
          axios.post("/vuejs/user/save",_this.useradd).then(function (value) {
            _this.findAll();
            _this.useradd.reset();
          }).catch(function (reason) { console.log(reason) })
      }
    },
    created:function(){
        this.findAll();
    }
});