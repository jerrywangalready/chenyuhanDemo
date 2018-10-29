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
            // var html = template('grid_template',{'list':data});
            // $("#grid").html(html);
        }
    });

}