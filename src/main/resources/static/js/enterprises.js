// Call the dataTables jQuery plugin
$(document).ready(function() {
   loadEnterprises();
  $('#enterprises').DataTable();
});

async function loadEnterprises() {

  const request = await fetch('/enterprises', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const enterprises = await request.json();

  let listHTML = '';
  for (let enterprise of enterprises) {

    let enterpriseHTML = '<tr><td>'+enterprise.id+'</td><td>'+enterprise.name+'</td><td>'+enterprise.nit+'</td><td>'+enterprise.address+'</td> <td>'+enterprise.phone+'</td> <td>'+enterprise.created_at+'</td> <td>'+enterprise.updated_at+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
    listHTML += enterpriseHTML;
  }

  console.log(enterprises);



document.querySelector('#enterprises tbody').outerHTML = listHTML;

}
