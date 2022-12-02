// Call the dataTables jQuery plugin
$(document).ready(function() {
   loadMovements();
  $('#movements').DataTable();
});

async function loadMovements() {

  const request = await fetch('/movements', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const movements = await request.json();

  let listHTML = '';
  for (let movement of movements) {

    let movementHTML = '<tr><td>'+movement.id+'</td><td>'+movement.concept+'</td><td>'+movement.amount+'</td><td>'+movement.employee_id+'</td><td>'+movement.enterprise_id+'</td> <td>'+movement.created_at+'</td> <td>'+movement.updated_at+'</td> <td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
    listHTML += movementHTML;
  }

  console.log(movements);



document.querySelector('#movements tbody').outerHTML = listHTML;

}
