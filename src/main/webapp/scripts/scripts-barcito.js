
$(function() {
    
    function cargarMesas() {
        $.ajax({
            type: "get",
            url: contextPath +'/mesas',
            data: "data",
            dataType: "json",
            success: function (response) {
                //agregamos la logica para agregar las mesas
                //iteramos la lista
                $.each(response, function(index,value){



                    //$("#boxGroupMesas").append("div").addClass("card m-2").text(value.id);
                    crarCaja(value);
                    
                    
                })
            }
        });
    }  

    function crarCaja(value) {
        divCard = document.createElement( "div" ).addClass("card m-2"),
        divCard.append("div").addClass("card-body")
        $("#boxGroupMesas").append(divCard);
    }

    $(document).ready(function () {
        cargarMesas();    
    });


});