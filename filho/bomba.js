
// function sleep(ms) {
//     return new Promise(resolve => setTimeout(resolve, ms));
// }

// async function explodir(x) {
//     const status = document.getElementById("status");
//     const contagem = document.getElementById("contagem");
//     alert("Armar a bomba")
//     status.innerHTML = "BOMBA ARMADA<br><br>";
//     await sleep(1000)
    
//     for (let i = x; i >= 0; i--) {
//         if (i > 0) {
//             contagem.innerHTML = `Faltam ${i} segundos`;
//         } else {
//             contagem.innerHTML = "BOMBA EXPLODIU 💥💥💥";
//         }
//         await sleep(1000); // Pausa de 1 segundo
//     }
// }

// explodir(10);