
/**
 * 
 */
var prod = [];
var url = 'rest/familia/alta';
var data = {codigo: 28,             
        	descripcion: "Compras desde js"
        	};
/*
fetch(url, {
  method: 'POST', // or 'PUT'
  body: JSON.stringify(data), // data can be `string` or {object}!
  headers:{
    'Content-Type': 'application/json'
  }
})
.then(res => res.text())
// .catch(error => console.log('Error:', error))
.then(res => console.log('Success:', res));
*/
 console.log('url',url);
fetch('rest/familia/leer/1')
	.then(response => response.json())
	.then(data => {
		
		
		console.log(data);
	document.querySelector('h3').innerHTML = data.descripcion;
	});

/*
fetch('rest/familia/porfam/1')
	.then(resp => resp.json())
	.then(resp => {
		console.log(resp);
		//document.querySelector('h3').innerHTML = resp.descripcion;
});

fetch('rest/familia', {
    method: 'POST',
    body: JSON.stringify({
        codigo: 21,             
        descripcion: "Compras desde js"
   })
})
	.then(response => response.text())
	.then(text => {
		console.log(text); 
	});
*/
