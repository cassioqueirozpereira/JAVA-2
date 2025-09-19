const efeito = document.getElementById("efeito");
const status = document.getElementById("status");
const contagem = document.getElementById("contagem");
const cabum = document.getElementById("cabum");

let resposta, i, time;
do {
    resposta = prompt("Armar a bomba? Digite 'sim' ou 'não'").toLowerCase();
    if ((resposta !== "sim") && (resposta !== "não"))
        alert("Resposta inválida. Digite 'sim' ou 'não'")
} while((resposta !== "sim") && (resposta !== "não"))

if (resposta === "sim") {
    do {
        time = parseInt(prompt("Digite o tempo para a bomba explodir em segundos: "))
            if (isNaN(time))
                alert("Resposta inválida. Digite um número")
    } while (isNaN(time))
}

async function explodir(x) {
    efeito.innerHTML = "PREPARANDO BOMBA";
    await sleep(700);
    efeito.innerHTML = "PREPARANDO BOMBA.";
    await sleep(700);
    efeito.innerHTML = "PREPARANDO BOMBA..";
    await sleep(700);
    efeito.innerHTML = "PREPARANDO BOMBA...";
    await sleep(700);
    if (resposta === "sim") {
        status.innerHTML = "BOMBA ARMADA";
        for (i = x; i >= 0; i--) {
            contagem.innerHTML = `Faltam ${i} segundos`;
            await sleep(1000);
            if (i === 0) {
                status.innerHTML = "";
                contagem.innerHTML = "";
                cabum.innerHTML = "BOMBA EXPLODIU";
                document.body.style.backgroundColor = "black";
            }
        }
    }
    else
        status.innerHTML = "BOMBA NÃO FOI ARMADA";
}

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms))
}

explodir(time);