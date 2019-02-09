var modalEscuela;
var selects;
document.addEventListener('DOMContentLoaded', function (evt) {
    selects = document.querySelectorAll('.uk-select');
    limpiaSelect();
});

function limpiaSelect(data) {
    if (data === null) {
        if (data.status === 'success') {
            selects.forEach(function (elemento) {
                elemento.removeAttribute('size');
            });
        }
    } else {
        selects.forEach(function (elemento) {
            elemento.removeAttribute('size');
        });
    }
}