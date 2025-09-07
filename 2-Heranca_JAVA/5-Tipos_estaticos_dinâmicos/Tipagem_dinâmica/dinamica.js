var a;
console.log(typeof a); // Mostra 'undefined' pois 'a' não foi inicializada
a = 3.1415;
console.log(typeof a); // Mostra 'number'
a = "Agora sou uma string";
console.log(typeof a); // Mostra 'string'
a = true;
console.log(typeof a); // Mostra 'boolean'
a = {
    nome: "Cassio", idade: 55
};
console.log(typeof a); // Mostra 'object', pois objetos são do tipo 'object' em JS
a = null; 
console.log(typeof a);// Mostra 'object', pois null é um objeto especial em JS
a = function() {
    return "Sou uma função";
};
console.log(typeof a); // Mostra 'function'
console.log(a()); // Invoca a função armazenada em 'a'