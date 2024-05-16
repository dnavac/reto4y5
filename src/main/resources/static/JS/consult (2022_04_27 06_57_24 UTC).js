let id = document.getElementById("id");
let idSent = document.getElementById("idSent");

id.addEventListener("input", toSent);

function toSent() {
    idSent.setAttribute("action", "/consultar/"+id.value)
    //console.log(idSent.getAttribute("action"));
}