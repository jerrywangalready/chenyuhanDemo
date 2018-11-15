$(function () {
    queryList();

});

function queryList() {

    $.ajax({
        type:'POST',
        url:'userManage/queryList',
        contentType:'application/json',
        data:{},
        success:function (data) {

            console.info(data);
        }
    });

}

$("#demobutton").click(
    console.log("按下了demobutton按钮")
);