 
function agregarPedido(data){
    id =  $(data).attr("data-id");
    tipo =  $(data).attr("data-id");

    $.ajax({
        type: "get",
        url: contextPath+"/abrirPedido?idProducto="+id+'&idTipo='+tipo,
        dataType: "json",
        success: function (response) {
            window.location.href=contextPath+'/';
        }
    });

}