const app = document.getElementById('root');
const x=document.getElementById('myBtn');
document.getElementById('myBtn').open=true
var inputVal = null;
function getInputValue()
{
	// Selecting the input element and get its value
      inputVal = document.getElementById('Category').value;
}
window.alert('Enter the Category')
x.addEventListener("click", function(){getInputValue()});

const container = document.createElement('div');
container.setAttribute('class', 'container');

app.appendChild(container);

var userRequest = new XMLHttpRequest();
userRequest.open('GET', 'https://api.publicapis.org/entries?Category=', true);

if (inputVal == null){
userRequest.onload = function ()
{ // Begin accessing JSON data here
	var comp_data = JSON.parse(this.response);
	/*var data = new Array();*/
	var data = comp_data.entries;
	/*const card = document.createElement('div');
    card.setAttribute('class', 'card');
	const h2 = document.createElement('h2');
    h2.textContent = `Data1 Length ${data1.length}`;
    card.appendChild(h2);*/
	
	if (userRequest.status >= 200 && userRequest.status < 400)
	{

		/* 
				const p = document.createElement('p');
				api.Description = api.Description.substring(0, 300);
				p.textContent = `${api.Description}...`;

				const h1 = document.createElement('h1');
				h1.textContent = api.API;

				container.appendChild(card);
				card.appendChild(h1);
				card.appendChild(p);
			})
		}*/

		
			data.forEach(api=> {
			const card = document.createElement('div');
			card.setAttribute('class', 'card');

			const p = document.createElement('p');
			api.Description = api.Description.substring(0, 300);
			p.textContent = `${api.Description}...`;

			const h1 = document.createElement('h1');
			h1.textContent = api.API;

			container.appendChild(card);
			card.appendChild(h1);
			card.appendChild(p);
			})
		
	}
	else
	{
		const errorMessage = document.createElement('marquee');
		errorMessage.textContent = `Gah, it's not working!`;
		app.appendChild(errorMessage);
	}
}
userRequest.send()
}
if (inputVal != null){
	x.addEventListener("click", function(){window.alert(inputVal)})
userRequest.onload = function ()
{ // Begin accessing JSON data here
	var comp_data = JSON.parse(this.response);
	/*var data = new Array();*/
	var data = comp_data.entries;
	
	var data1 = [];
	var k=0;
	data.forEach(data2 => {
		if(data2.Category = inputVal)
		{
			data1[k] = data2;
		}
		k++
    })
	const card = document.createElement('div');
    card.setAttribute('class', 'card');
	const h2 = document.createElement('h2');
    h2.textContent = `Data1 Length ${data1.length}`;
    card.appendChild(h2);
	if (userRequest.status >= 200 && userRequest.status < 400)
	{

		/* 
				const p = document.createElement('p');
				api.Description = api.Description.substring(0, 300);
				p.textContent = `${api.Description}...`;

				const h1 = document.createElement('h1');
				h1.textContent = api.API;

				container.appendChild(card);
				card.appendChild(h1);
				card.appendChild(p);
			})
		}*/

		
			data1.forEach(api=> {
			const card = document.createElement('div');
			card.setAttribute('class', 'card');

			const p = document.createElement('p');
			api.Description = api.Description.substring(0, 300);
			p.textContent = `${api.Description}...`;

			const h1 = document.createElement('h1');
			h1.textContent = api.API;

			container.appendChild(card);
			card.appendChild(h1);
			card.appendChild(p);
			})
		
	}
	else
	{
		const errorMessage = document.createElement('marquee');
		errorMessage.textContent = `Gah, it's not working!`;
		app.appendChild(errorMessage);
	}
}
userRequest.send()
}


