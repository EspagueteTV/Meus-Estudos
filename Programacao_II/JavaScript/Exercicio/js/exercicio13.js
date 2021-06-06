function converter(){
    let resp = window.document.querySelector(".resp");
    let c = Number.parseFloat(window.document.querySelector("#celsius").value);

    let f = c * (9/5) + 32

    resp.innerHTML = `<p>${f}</p>`
}